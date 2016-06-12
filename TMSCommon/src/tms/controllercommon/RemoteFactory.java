/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllercommon;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;


public interface RemoteFactory extends Remote {

    public AttendenceController getAttendenceController() throws RemoteException, SQLException, ClassNotFoundException;

    public ClassController getClassController() throws RemoteException, SQLException, ClassNotFoundException;

    public ClassFeesController getClassFeesController() throws RemoteException, SQLException, ClassNotFoundException;

    public ExamController getExamController() throws RemoteException, SQLException, ClassNotFoundException;

    public PaperController getPaperController() throws RemoteException, SQLException, ClassNotFoundException;

    public RegistrationController getRegistrationController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException;

    public SchoolarshipResultController getSchoolarshipResultController() throws RemoteException, SQLException, ClassNotFoundException;

    public StudentController getStudentController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException;
    
   public UserController getUSerController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException;

}
