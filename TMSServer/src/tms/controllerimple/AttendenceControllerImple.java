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
import tms.controller.AttendenceControllerD;
import tms.controllercommon.AttendenceController;
import tms.model.Attendence;
/**
 *
 * @author Nuwantha
 */public class AttendenceControllerImple extends UnicastRemoteObject implements AttendenceController{
    
    private final AttendenceControllerD attendenceControllerD;
    
    public AttendenceControllerImple() throws RemoteException{
        this.attendenceControllerD=new AttendenceControllerD();
    
    }

    @Override
    public boolean addNewAttendence(ArrayList<Attendence> attendences) throws RemoteException, ClassNotFoundException, SQLException {
        return attendenceControllerD.addNewAttendence(attendences);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editAttendence(ArrayList<Attendence> attendences) throws RemoteException, ClassNotFoundException, SQLException {
        return attendenceControllerD.editAttendence(attendences);
    }

    @Override
    public ArrayList<Attendence> searchClassAttendence(String classId, String date) throws RemoteException, ClassNotFoundException, SQLException {
        return attendenceControllerD.searchClassAttendence(classId, date);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Attendence> searchStudentAttendence(String studentId, String classId) throws RemoteException, ClassNotFoundException, SQLException {
        return attendenceControllerD.searchStudentAttendence(studentId, classId);//To change body of generated methods, choose Tools | Templates.
    }
    
}
