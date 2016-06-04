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
import tms.model.Paper;

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

    public static boolean addNewPaper(Paper paper) throws ClassNotFoundException, SQLException {
        try {

            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into paper Values('" + paper.getPaperId() + "','" + paper.getClassId() + "','" + paper.getDateOfConduct() + "','" + paper.getNumberOfFacedStudent() + "','" + paper.getGrade() + "','" + paper.getTopScore() + "','" + paper.getAverage() + "')";

            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static ArrayList<Paper> getAllPaper() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From paper";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Paper> paperList = new ArrayList<>();
            while (rst.next()) {
                Paper paper = new Paper(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getInt(6), rst.getDouble(7));
                paperList.add(paper);
            }
            return paperList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static Paper searchPaper(String paperId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * from paper where paperId='" + paperId + "'";
            ResultSet rst = DBHandler.getData(conn, sql);
            if (rst.next()) {
                Paper paper = new Paper(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getInt(6), rst.getDouble(7));
                return paper;
            } else {
                return null;
            }
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public static boolean editPaper(Paper paper) throws ClassNotFoundException, SQLException {
        try {

            readWriteLock.writeLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "update paper set  numberOfFacedStudent ='" + paper.getNumberOfFacedStudent() + "',topscore='" + paper.getTopScore() + "',average='" + paper.getAverage() + "' where paperId='" + paper.getPaperId() + "'";

            int returnValue = DBHandler.setData(conn, sql);
            return returnValue > 0;

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    

    public static ArrayList<Paper> getStudentFacedPapers(String classId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From  paper where classId='"+classId+"'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Paper> paperList = new ArrayList<>();
            while (rst.next()) {
                Paper paper = new Paper(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getInt(6), rst.getDouble(7));
                paperList.add(paper);
            }
            return paperList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
    
    
    
    
    
}
