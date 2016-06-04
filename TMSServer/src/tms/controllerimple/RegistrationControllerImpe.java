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
import tms.controller.RegistrationControllerD;
import tms.controllercommon.RegistrationController;
import tms.model.ClassS;
import tms.model.Registration;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class RegistrationControllerImpe extends UnicastRemoteObject implements RegistrationController {

    private final RegistrationControllerD registrationControllerD;

    public RegistrationControllerImpe() throws RemoteException {
        this.registrationControllerD = new RegistrationControllerD();
    }

    @Override
    public boolean addNewRegistration(Registration registration) throws RemoteException, SQLException, ClassNotFoundException {
        return registrationControllerD.addNewRegistration(registration); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> getStudentOfClass(String classId) throws RemoteException, ClassNotFoundException, SQLException {
        return  registrationControllerD.getStudentOfClass(classId);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClassS> getClassOfStudent(String studentId) throws RemoteException, ClassNotFoundException, SQLException {
        return registrationControllerD.getClassOfStudent(studentId);//To change body of generated methods, choose Tools | Templates.
    }
}
