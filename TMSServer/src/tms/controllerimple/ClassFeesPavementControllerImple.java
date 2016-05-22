/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import tms.controller.ClassFeesPavementControllerD;
import tms.controllercommon.ClassFeesPavementController;

/**
 *
 * @author Nuwantha
 */
public class ClassFeesPavementControllerImple extends UnicastRemoteObject implements ClassFeesPavementController{
    private final ClassFeesPavementControllerD classFeesPavementControllerD;

    public ClassFeesPavementControllerImple() throws RemoteException{
        this.classFeesPavementControllerD = new ClassFeesPavementControllerD();
    }
    
}
