/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import tms.controller.BackUpControllerD;
import tms.controllercommon.BackUpController;

/**
 *
 * @author Nuwantha
 */
public class BackUpCotrollerDImple extends UnicastRemoteObject implements BackUpController{
    
    private final BackUpControllerD backUpControllerD;
    public  BackUpCotrollerDImple ()throws RemoteException{
        this.backUpControllerD=new BackUpControllerD();
    }

    @Override
    public int writeBackup() throws IOException, RemoteException, SQLException ,InterruptedException{
        return backUpControllerD.writeBackup();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int restoreBackup() throws RemoteException, IOException, InterruptedException {
        return backUpControllerD.restoreBackup();//To change body of generated methods, choose Tools | Templates.
    }
    
}
