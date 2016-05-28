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
import tms.model.Attendence;
/**
 *
 * @author Nuwantha
 */
public interface AttendenceController extends Remote{
   
    public boolean addNewAttendence(ArrayList<Attendence> attendences) throws RemoteException,ClassNotFoundException, SQLException;
    public boolean editAttendence(ArrayList<Attendence> attendences) throws RemoteException,ClassNotFoundException, SQLException;
    public ArrayList<Attendence> searchClassAttendence(String classId,String date) throws RemoteException,ClassNotFoundException, SQLException;
    public ArrayList<Attendence> searchStudentAttendence(String studentId,String classId) throws RemoteException,ClassNotFoundException, SQLException;
                 
}
