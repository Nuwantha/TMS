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
import tms.model.Attendence;

/**
 *
 * @author Nuwantha
 */
public class AttendenceControllerD {
    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static boolean addNewAttendence(ArrayList<Attendence> attendences) throws ClassNotFoundException, SQLException {

        try {
            readWriteLock.writeLock().lock();
            boolean returnStatue = true;
            Connection conn = DBConnection.getDBConnection().getConnection();
            conn.setAutoCommit(false);
            try {
                    for (Attendence attendence : attendences) {
                        String sql = "Insert into Attendence Values('" + attendence.getClassId() + "','" + attendence.getStudentId() + "','" + attendence.getDate() + "','" + attendence.getStatus() + "')";
                        int resultAdded = DBHandler.setData(conn, sql);
                        if (resultAdded < 0) {
                            returnStatue = false;
                            conn.rollback();
                            break;
                        }
                    }
                if (returnStatue) {
                    conn.commit();
                }
            } catch (SQLException sqlExeption) {
                returnStatue = false;
                conn.rollback();
            } finally {
                conn.setAutoCommit(true);
            }
            return returnStatue;
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
    
      public static ArrayList<Attendence> searchClassAttendence(String classId,String date) throws ClassNotFoundException, SQLException {
        
          try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From Attendence where classId='"+classId+"' and dateAttended='"+date+"'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Attendence> attendenceList = new ArrayList<>();
            while (rst.next()) {
                Attendence attendence = new Attendence(rst.getString(1), rst.getString(2), rst.getString(3),rst.getInt(4));
                attendenceList.add(attendence);
            }
            return attendenceList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static ArrayList<Attendence> searchStudentAttendence(String studentId,String classId) throws ClassNotFoundException, SQLException {
        
          try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From Attendence where classId='"+classId+"' and studentId='"+studentId+"'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Attendence> attendenceList = new ArrayList<>();
            while (rst.next()) {
                Attendence attendence = new Attendence(rst.getString(1), rst.getString(2), rst.getString(3),rst.getInt(4));
                attendenceList.add(attendence);
            }
            return attendenceList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
      
     public static boolean editAttendence(ArrayList<Attendence> attendences) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            boolean returnStatue = true;
            Connection conn = DBConnection.getDBConnection().getConnection();
            conn.setAutoCommit(false);
            try {
                    for (Attendence attendence : attendences) {
                        String sql = "update attendence set status='"+attendence.getStatus()+"' where classId='"+attendence.getClassId()+"' and studentId='"+attendence.getStudentId()+"' and dateAttended='"+attendence.getDate()+"'";
                        int resultAdded = DBHandler.setData(conn, sql);
                        if (resultAdded < 0) {
                            returnStatue = false;
                            conn.rollback();
                            break;
                        }
                    }
                if (returnStatue) {
                    conn.commit();
                }
            } catch (SQLException sqlExeption) {
                returnStatue = false;
                conn.rollback();
            } finally {
                conn.setAutoCommit(true);
            }
            return returnStatue;
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
     
      
}
