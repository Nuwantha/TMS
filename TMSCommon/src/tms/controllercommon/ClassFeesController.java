/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllercommon;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import tms.model.ClassFees;

/**
 *
 * @author Nuwantha
 */
public interface ClassFeesController extends Remote{
    public boolean addNewClassFees(ClassFees classFees) throws RemoteException,ClassNotFoundException, SQLException ;
    
}
