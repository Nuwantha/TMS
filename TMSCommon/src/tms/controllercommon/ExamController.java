/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllercommon;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import tms.model.Exam;
import tms.model.Paper;

/**
 *
 * @author Nuwantha
 */
public interface ExamController extends Remote{
    
    public boolean addNewExamResult(Paper paper, ArrayList<Exam> results) throws RemoteException,ClassNotFoundException, SQLException;
    public  ArrayList<Exam> getAllResults(String paperId) throws RemoteException,ClassNotFoundException, SQLException;
    
    public boolean editExamResult(Paper paper, ArrayList<Exam> results) throws RemoteException,ClassNotFoundException, SQLException ;

}
