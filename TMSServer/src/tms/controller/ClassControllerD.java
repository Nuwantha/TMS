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

/**
 *
 * @author Nuwantha
 */
public class ClassControllerD {

    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    
    
    
    public static int getClassCount() throws ClassNotFoundException, SQLException {
        int count = 0;
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "select count(distinct classId)  from Class1";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                count = rst.getInt(1);
            }
        } finally {
            readWriteLock.readLock().unlock();
        }

        return count;
    }
    
    public static ArrayList<ClassS> getAllClass() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From Class1";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<ClassS> classList = new ArrayList<>();
            while (rst.next()) {
                ClassS class1 = new ClassS(rst.getString(1), rst.getInt(2),rst.getString(3), rst.getInt(4), rst.getInt(5));
                classList.add(class1);
            }
            return classList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
    
    public static ArrayList<ClassS> getAllClassForNewYear() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From Class1 where year2=(select year(curdate()))";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<ClassS> classList = new ArrayList<>();
            while (rst.next()) {
                ClassS class1 = new ClassS(rst.getString(1), rst.getInt(2),rst.getString(3), rst.getInt(4), rst.getInt(5));
                classList.add(class1);
            }
            return classList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    

    public static ClassS searchClass(String classId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from Class1 where classId='" + classId + "'";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                ClassS class1 = new ClassS(rst.getString(1), rst.getInt(2),rst.getString(3), rst.getInt(4), rst.getInt(5));
                 return class1;
            } else {
                return null;
            }
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
    
    
    
    public static boolean addNewClass(ClassS classDetail) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into Class1 Values('" + classDetail.getClassId() + "','" + classDetail.getGrade() + "','" + classDetail.getConductedDate() + "','" + classDetail.getClassFeesAmount() + "','" + classDetail.getYear() + "')";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
   
   
     public static boolean editClassDetail(ClassS classDetail) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "update Class1 set grade='" + classDetail.getGrade() + "', conductedDate = '" + classDetail.getConductedDate() + "',classFeesAmount='" + classDetail.getClassFeesAmount() + "',year2='" + classDetail.getYear() + "' where classId='" + classDetail.getClassId() + "'";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
   

}
