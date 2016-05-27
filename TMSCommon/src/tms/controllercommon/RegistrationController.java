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
import tms.model.Registration;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public interface RegistrationController extends Remote{
    public boolean addNewRegistration(Registration registration) throws RemoteException, SQLException,ClassNotFoundException;
    public ArrayList<Student> getStudentOfClass(String classId) throws RemoteException, ClassNotFoundException, SQLException;
      
    
}
