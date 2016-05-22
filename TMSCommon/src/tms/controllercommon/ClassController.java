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
import tms.model.ClassS;

/**
 *
 * @author Nuwantha
 */
public interface ClassController extends Remote{
      public ArrayList<ClassS> getAllClass() throws RemoteException, SQLException,ClassNotFoundException;
       public ClassS searchClass(String classId) throws RemoteException, SQLException,ClassNotFoundException;
      public ArrayList<ClassS> getAllClassForNewYear() throws RemoteException, SQLException,ClassNotFoundException;
        
      
}
