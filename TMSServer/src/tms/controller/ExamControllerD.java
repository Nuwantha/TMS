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
import tms.controllercommon.PaperController;
import tms.db_utilities.DBConnection;
import tms.db_utilities.DBHandler;
import tms.model.Exam;
import tms.model.Paper;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class ExamControllerD {

    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static boolean addNewExamResult(Paper paper, ArrayList<Exam> results) throws ClassNotFoundException, SQLException {

        try {
            readWriteLock.writeLock().lock();
            boolean returnStatue = true;
            Connection conn = DBConnection.getDBConnection().getConnection();
            conn.setAutoCommit(false);
            try {
                boolean addNewPaper = PaperControllerD.addNewPaper(paper);
                if (addNewPaper) {
                    for (Exam result : results) {
                        String sql = "Insert into Exam Values('" + result.getStudent().getStudentId() + "','" + result.getPaper().getPaperId() + "','" + result.getMark() + "','" + result.getRank() + "')";
                        int resultAdded = DBHandler.setData(conn, sql);
                        if (resultAdded < 0) {
                            returnStatue = false;
                            conn.rollback();

                            break;
                        }
                    }
                } else {
                    returnStatue = false;
                    conn.rollback();
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

    
    public static ArrayList<Exam> getAllResults(String paperId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From exam where paperId='"+paperId+"' order by rank2";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Exam> examList = new ArrayList<>();
            while (rst.next()) {
                Student searchStudent = StudentControllerD.searchStudent(rst.getString(1));
                Paper searchPaper = PaperControllerD.searchPaper( rst.getString(2));
                Exam exam = new Exam(searchStudent,searchPaper, rst.getInt(3), rst.getInt(4));
                examList.add(exam);
            }
            return examList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
    
  
    
    
    public static boolean editExamResult(Paper paper, ArrayList<Exam> results) throws ClassNotFoundException, SQLException {

        try {
            readWriteLock.writeLock().lock();
            boolean returnStatue = true;
            Connection conn = DBConnection.getDBConnection().getConnection();
            conn.setAutoCommit(false);
            try {
                boolean editPaper = PaperControllerD.editPaper(paper);
                if (editPaper) {
                    for (Exam result : results) {
                        String sql = "update Exam set mark='" + result.getMark() + "' ,rank2='" + result.getRank() + "' where studentId='" + result.getStudent().getStudentId() + "' and paperId='" + result.getPaper().getPaperId() + "'";
                        int resultAdded = DBHandler.setData(conn, sql);
                        if (resultAdded < 0) {
                            returnStatue = false;
                            conn.rollback();

                            break;
                        }
                    }
                } else {
                    returnStatue = false;
                    conn.rollback();
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

  
     public static ArrayList<Exam> searchStudentResult(String studentId) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            Connection conn = DBConnection.getDBConnection().getConnection();
            String sql = "Select * From exam where studentId='"+studentId+"'";
            ResultSet rst = DBHandler.getData(conn, sql);
            ArrayList<Exam> examList = new ArrayList<>();
            while (rst.next()) {
                Student searchStudent = StudentControllerD.searchStudent(rst.getString(1));
                Paper searchPaper = PaperControllerD.searchPaper( rst.getString(2));
                Exam exam = new Exam(searchStudent,searchPaper, rst.getInt(3), rst.getInt(4));
                examList.add(exam);
            }
            return examList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
    
  
    
    
    
    
    
}
