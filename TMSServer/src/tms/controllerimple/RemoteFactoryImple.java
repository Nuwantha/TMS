/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import tms.controllercommon.AttendenceController;
import tms.controllercommon.ClassController;
import tms.controllercommon.ClassFeesController;
import tms.controllercommon.ClassFeesPavementController;
import tms.controllercommon.ExamController;
import tms.controllercommon.PaperController;
import tms.controllercommon.RegistrationController;
import tms.controllercommon.RemoteFactory;
import tms.controllercommon.SchoolarshipResultController;
import tms.controllercommon.StudentController;

/**
 *
 * @author Nuwantha
 */
public class RemoteFactoryImple extends UnicastRemoteObject implements RemoteFactory{
    
    public RemoteFactoryImple()throws RemoteException{
        super();
    }

    @Override
    public AttendenceController getAttendenceController() throws RemoteException, SQLException, ClassNotFoundException {
       return new AttendenceControllerImple();
    
    }

    @Override
    public ClassController getClassController() throws RemoteException, SQLException, ClassNotFoundException {
        return new ClassControllerImpe();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClassFeesController getClassFeesController() throws RemoteException, SQLException, ClassNotFoundException {
        return new ClassFeesControllerImple();
    }

    @Override
    public ClassFeesPavementController getClassFeesPavementController() throws RemoteException, SQLException, ClassNotFoundException {
        return new ClassFeesPavementControllerImple();
    }

    @Override
    public ExamController getExamController() throws RemoteException, SQLException, ClassNotFoundException {
        return new ExamControllerImple();
    }

    @Override
    public PaperController getPaperController() throws RemoteException, SQLException, ClassNotFoundException {
        return new PaperControllerImple();
    }

    @Override
    public RegistrationController getRegistrationController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException {
        return new RegistrationControllerImpe();
    }

    @Override
    public SchoolarshipResultController getSchoolarshipResultController() throws RemoteException, SQLException, ClassNotFoundException {
            return new SchoolarshipResultControllerImple();
    }

    @Override
    public StudentController getStudentController() throws RemoteException, SQLException, InterruptedException, ClassNotFoundException {
        return new StudentControllerImple();
    }
}
