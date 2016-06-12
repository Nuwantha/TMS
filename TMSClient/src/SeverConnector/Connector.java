/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeverConnector;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import tms.controllercommon.AttendenceController;
import tms.controllercommon.ClassController;
import tms.controllercommon.ClassFeesController;;
import tms.controllercommon.ExamController;
import tms.controllercommon.PaperController;
import tms.controllercommon.RegistrationController;
import tms.controllercommon.RemoteFactory;
import tms.controllercommon.SchoolarshipResultController;
import tms.controllercommon.StudentController;
import tms.controllercommon.UserController;

/**
 *
 * @author Nuwantha
 */
public class Connector {

    public static Connector getServerConnector() {
        return serverConnector;
    }
    
    private final RemoteFactory remoteFactory;
    private static Connector serverConnector = null;
    private AttendenceController attendenceController;
    private ClassController classController;
    private ClassFeesController classFeesController;
    private ExamController examController;
    private PaperController paperController;
    private RegistrationController registrationController;
    private SchoolarshipResultController schoolarshipResultController;
    private StudentController studentController;
    private UserController userController;
    
    private Connector() throws NotBoundException, MalformedURLException, RemoteException {
        String lookUpString = "rmi://127.0.0.1:344/TMSServer";
        remoteFactory = (RemoteFactory) Naming.lookup(lookUpString);
    }

    public RemoteFactory getRemoteFactory() {
        return remoteFactory;
    }

    public static Connector getSConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if (serverConnector == null) {
            serverConnector = new Connector();
        }
        return serverConnector;
    }

    public AttendenceController getAttendenceController() throws RemoteException, SQLException, ClassNotFoundException {
        if(attendenceController==null){
            attendenceController=remoteFactory.getAttendenceController();
        }
        return attendenceController;
    }

    public ClassController getClassController() throws RemoteException, SQLException, ClassNotFoundException {
        if(classController==null){
            classController=remoteFactory.getClassController();
        }
        return classController;
    }

    public ClassFeesController getClassFeesController() throws RemoteException, SQLException, ClassNotFoundException {
        if(classFeesController==null){
            classFeesController=remoteFactory.getClassFeesController();
        }
        return classFeesController;
        
    }

   
    public ExamController getExamController() throws RemoteException, SQLException, ClassNotFoundException {
        if(examController==null){
            examController=remoteFactory.getExamController();
        }
        return examController;
    }

    public PaperController getPaperController() throws RemoteException, SQLException, ClassNotFoundException {
        if(paperController==null){
            paperController=remoteFactory.getPaperController();
        }
        return paperController;
    }

    public RegistrationController getRegistrationController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException {
        if(registrationController==null){
            registrationController=remoteFactory.getRegistrationController();
        }
        return registrationController;
    }

    public SchoolarshipResultController getSchoolarshipResultController() throws RemoteException, SQLException, ClassNotFoundException {
        if(schoolarshipResultController==null){
            schoolarshipResultController=remoteFactory.getSchoolarshipResultController();
        }
        return schoolarshipResultController;
    }

    public StudentController getStudentController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException {
        if(studentController==null){
            studentController=remoteFactory.getStudentController();
        }
        return studentController;
    }

    public UserController getUserController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException {
        if(userController==null){
            userController=remoteFactory.getUSerController();
        }
        return userController;
    }
    
}
