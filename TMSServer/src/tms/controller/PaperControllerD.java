/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tms.db_utilities.DBConnection;
import tms.db_utilities.DBHandler;

/**
 *
 * @author Nuwantha
 */
public class PaperControllerD {
    
    
   private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
   
    
    public static int getPaperCount() throws ClassNotFoundException, SQLException {
        int count = 0;
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "select count(distinct paperId)  from Paper";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                count = rst.getInt(1);
            }
        } finally {
            readWriteLock.readLock().unlock();
        }

        return count;
    }
    
}
