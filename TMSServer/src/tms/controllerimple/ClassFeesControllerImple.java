/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import tms.controller.ClassFeesControllerD;
import tms.controllercommon.ClassFeesController;

/**
 *
 * @author Nuwantha
 */
public class ClassFeesControllerImple extends UnicastRemoteObject implements ClassFeesController{

    private ClassFeesControllerD classFeesControllerD;
    public ClassFeesControllerImple() throws RemoteException{
        this.classFeesControllerD=new ClassFeesControllerD();
    }
    
    
}
