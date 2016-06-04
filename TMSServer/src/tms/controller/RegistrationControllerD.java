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
import tms.model.Registration;
import tms.model.Student;


/**
 *
 * @author Nuwantha
 */
public class RegistrationControllerD {
        
        private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        public static boolean addNewRegistration(Registration registration) throws ClassNotFoundException, SQLException {
        try {
            
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into Registration Values('" + registration.getStudentClass().getClassId() + "','" + registration.getStudent().getStudentId() + "','" + registration.getYear() + "')";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;
            
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
        
    
  public static ArrayList<Student> getStudentOfClass(String classId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select studentId From Registration where classId='"+classId+"'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Student> studentList = new ArrayList<>();
            while (rst.next()) {
                Student student =StudentControllerD.searchStudent(rst.getString(1));
                studentList.add(student);
            }
            return studentList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

  
  
  public static ArrayList<ClassS> getClassOfStudent(String studentId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select distinct classId From Registration where studentId='"+studentId+"'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<ClassS> classList = new ArrayList<>();
            while (rst.next()) {
                ClassS searchClass = ClassControllerD.searchClass(rst.getString(1));
                classList.add(searchClass);
            }
            return classList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

  
  
         
}
