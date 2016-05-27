/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tms.db_utilities.DBConnection;
import tms.db_utilities.DBHandler;
import tms.model.ClassFees;

/**
 *
 * @author Nuwantha
 */
public class ClassFeesControllerD {
    
    
    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    
    
    
    public static boolean addNewClassFees(ClassFees classFees) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into ClassFees Values('"+classFees.getClassStudent().getClassId()+"','" + classFees.getStudent().getStudentId() + "','" + classFees.getMonth() + "','" + classFees.getPayDate() + "')";
            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
    
}
