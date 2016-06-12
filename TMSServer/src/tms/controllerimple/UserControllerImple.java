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
import tms.controller.UserControllerD;
import tms.controllercommon.UserController;
import tms.model.User;

/**
 *
 * @author Nuwantha
 */
public class UserControllerImple extends UnicastRemoteObject implements UserController {

    private final UserControllerD userControllerD;

    public UserControllerImple() throws RemoteException {

        this.userControllerD = new UserControllerD();
    }

    @Override
    public int addNewUser(User user) throws RemoteException, SQLException, ClassNotFoundException {
        return userControllerD.addNewUser(user);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateUser(User user) throws RemoteException, SQLException, ClassNotFoundException {
        return userControllerD.updateUser(user);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updatePassword(User user) throws RemoteException, SQLException, ClassNotFoundException {
        return userControllerD.updatePassword(user);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> getAllUsers() throws RemoteException, SQLException, ClassNotFoundException {
        return userControllerD.getAllUsers();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User searchUser(String name) throws RemoteException, SQLException, ClassNotFoundException {
        return userControllerD.searchUser(name);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean matchPassword(String name, String entertext) throws RemoteException, SQLException, ClassNotFoundException {
        return userControllerD.matchPassword(name, entertext);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> getAllSimilarUsers(String typed) throws RemoteException, ClassNotFoundException, SQLException {
        return userControllerD.getAllSimilarUsers(typed);//To change body of generated methods, choose Tools | Templates.
    }

}
