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
public interface PaperController extends Remote{
    
    public int getPaperCount() throws RemoteException, SQLException,ClassNotFoundException; 
    public boolean addNewPaper(Paper paper) throws RemoteException,ClassNotFoundException, SQLException;

}
