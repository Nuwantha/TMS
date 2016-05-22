/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmsserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tms.controller.StudentControllerD;
import tms.controllerimple.RemoteFactoryImple;

/**
 *
 * @author Nuwantha
 */
public class TMSServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
    
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry myRegistry = LocateRegistry.createRegistry(344);
            myRegistry.rebind("TMSServer", new RemoteFactoryImple());
            System.out.println("TMS server started...");
        } catch (ExportException e) {
            System.out.println("TMS Server already running");
        }

    }

}
