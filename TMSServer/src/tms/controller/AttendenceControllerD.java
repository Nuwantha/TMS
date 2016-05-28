/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controller;

import java.sql.Connection;
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

   
    
}
