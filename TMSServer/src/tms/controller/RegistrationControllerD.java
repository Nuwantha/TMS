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
import tms.model.Registration;


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

}
