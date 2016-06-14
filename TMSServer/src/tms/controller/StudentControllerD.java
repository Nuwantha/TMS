/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tms.db_utilities.DBConnection;
import tms.db_utilities.DBHandler;
import tms.model.ClassS;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class StudentControllerD {

    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static int getStudentCount() throws ClassNotFoundException, SQLException {
        int count = 0;
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "select count(distinct studentId)  from Student";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                count = rst.getInt(1);
            }
        } finally {
            readWriteLock.readLock().unlock();
        }

        return count;
    }

    public static boolean addNewStudent(Student student) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into Student Values('" + student.getStudentId() + "','" + student.getBirthDay() + "','" + student.getName() + "','" + student.getAddress() + "','" + student.getParentName() + "','" + student.getContactNumber() + "')";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static Student searchStudent(String studentId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from student where studentId='" + studentId + "'";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                Student student = new Student(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
                return student;
            } else {
                return null;
            }
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<Student> getAllStudent() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From Student";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Student> studentList = new ArrayList<>();
            while (rst.next()) {
                Student student = new Student(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
                studentList.add(student);
            }
            return studentList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<Student> getAllStudentRegisterForNewYear() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From Student where (Select Year(CURDATE()))-(year(birthday))<12 and studentId not in (select studentId from registration where yearR=(Select Year(CURDATE())))";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Student> studentList = new ArrayList<>();
            while (rst.next()) {
                Student student = new Student(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
                studentList.add(student);
            }
            return studentList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<Student> getStudentOfClass(String classId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select studentId From Registration where classId='" + classId + "'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Student> studentList = new ArrayList<>();
            while (rst.next()) {
                Student student = searchStudent(rst.getString(1));
                studentList.add(student);
            }
            return studentList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static boolean editStudentDetail(Student student) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "update Student set birthday='" + student.getBirthDay() + "',name= '" + student.getName() + "',address='" + student.getAddress() + "',parentName='" + student.getParentName() + "',contactNumber='" + student.getContactNumber() + "' where studentId='" + student.getStudentId() + "'";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static ArrayList<Student> getAvailableRegistrationStudentForClass(ClassS studentClass) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from Student where year(birthday)=year(curdate())-('" + studentClass.getGrade() + "'+5) and studentId not in(select studentId from registration where yearR='" + studentClass.getYear() + "')";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Student> studentList = new ArrayList<>();
            while (rst.next()) {
                Student student = new Student(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
                studentList.add(student);
            }
            return studentList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static Student getLastAddedStudent() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from student order by studentId desc limit 1";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                Student student = new Student(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
                return student;
            } else {
                return null;
            }
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<Student> getAvailableStudentForAddingSchoolarshipResult(String classId) throws ClassNotFoundException, SQLException {
        try {
            
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select studentId From Registration where classId='" + classId + "' and studentId not in(select studentId from schoolarshipResult)";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Student> studentList = new ArrayList<>();
            
            while (rst.next()) {
                Student student = StudentControllerD.searchStudent(rst.getString(1));
                studentList.add(student);
            }
            
            return studentList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

}
