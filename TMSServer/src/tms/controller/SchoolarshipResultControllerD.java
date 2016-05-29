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
import tms.model.SchoolarshipResult;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class SchoolarshipResultControllerD {

    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static boolean addSchoolarshipResult(SchoolarshipResult schoolarshipResult) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into schoolarshipresult Values('" + schoolarshipResult.getStudent().getStudentId() + "','" + schoolarshipResult.getIndexNumber() + "','" + schoolarshipResult.getYear() + "','" + schoolarshipResult.getResult() + "','" + schoolarshipResult.getRank() + "','" + schoolarshipResult.getIsPass() + "')";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static boolean editSchoolarshipResult(SchoolarshipResult schoolarshipResult) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "update schoolarshipresult set studentId='" + schoolarshipResult.getStudent().getStudentId() + "', year1= '" + schoolarshipResult.getYear() + "', results='" + schoolarshipResult.getResult() + "',rank1='" + schoolarshipResult.getRank() + "' , isPass= '" + schoolarshipResult.getIsPass() + "' where indexNumber= '" + schoolarshipResult.getIndexNumber() + "'";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static SchoolarshipResult searchSchoolarshipResult(String indexNumber) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from schoolarshipResult where indexNumber='" + indexNumber + "'";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                Student searchStudent = StudentControllerD.searchStudent(rst.getString(1));
                SchoolarshipResult schoolarshipResult = new SchoolarshipResult(searchStudent, rst.getInt(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getInt(6));
                return schoolarshipResult;
            } else {
                return null;
            }
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<SchoolarshipResult> getAllSchoolarshipResult() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from schoolarshipResult";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<SchoolarshipResult> schoolarshipResultList = new ArrayList<>();
            while (rst.next()) {

                Student searchStudent = StudentControllerD.searchStudent(rst.getString(1));
                SchoolarshipResult schoolarshipResult = new SchoolarshipResult(searchStudent, rst.getInt(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getInt(6));
                schoolarshipResultList.add(schoolarshipResult);
            }
            return schoolarshipResultList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<SchoolarshipResult> getSchoolarshipResultOfYear(int year) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from schoolarshipResult where year1='" + year + "'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<SchoolarshipResult> schoolarshipResultList = new ArrayList<>();
            while (rst.next()) {

                Student searchStudent = StudentControllerD.searchStudent(rst.getString(1));
                SchoolarshipResult schoolarshipResult = new SchoolarshipResult(searchStudent, rst.getInt(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getInt(6));
                schoolarshipResultList.add(schoolarshipResult);
            }
            return schoolarshipResultList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<Integer> getYears() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select distinct year1 from schoolarshipResult order by year1";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Integer> years = new ArrayList<>();
            while (rst.next()) {

                years.add(rst.getInt(1));
            }
            return years;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    
    public static int particateStudentCountOfYear(int year) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select count(indexNumber) from schoolarshipResult where year1='" + year+ "'";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
               return rst.getInt(1);
            } else {
                return 0;
            }
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    
    public static int passStudentCountOfYear(int year) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select count(indexNumber) from schoolarshipResult where year1='" + year+ "' and isPass=1";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
               return rst.getInt(1);
            } else {
                return 0;
            }
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

}
