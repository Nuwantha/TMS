/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import tms.controller.ExamControllerD;
import tms.controllercommon.ExamController;
import tms.model.Exam;
import tms.model.Paper;

/**
 *
 * @author Nuwantha
 */
public class ExamControllerImple extends UnicastRemoteObject implements ExamController{
    
    
   private final ExamControllerD examControllerD; 
   public ExamControllerImple() throws RemoteException{
        this.examControllerD=new ExamControllerD();
   }

    @Override
    public boolean addNewExamResult(Paper paper, ArrayList<Exam> results) throws RemoteException, ClassNotFoundException, SQLException {
      return examControllerD.addNewExamResult(paper, results);
    }

    @Override
    public ArrayList<Exam> getAllResults(String paperId) throws RemoteException, ClassNotFoundException, SQLException {
        return examControllerD.getAllResults(paperId);//To change body of generated methods, choose Tools | Templates.
    }
    
}
