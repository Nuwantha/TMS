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
import tms.controllercommon.PaperController;
import tms.db_utilities.DBConnection;
import tms.db_utilities.DBHandler;
import tms.model.Exam;
import tms.model.Paper;

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

}
