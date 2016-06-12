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
import tms.model.User;

/**
 *
 * @author Nuwantha
 */
public interface UserController extends Remote {

    public int addNewUser(User user) throws RemoteException, SQLException,ClassNotFoundException;
    public int updateUser(User user) throws RemoteException, SQLException,ClassNotFoundException;
    public int updatePassword(User user) throws RemoteException, SQLException,ClassNotFoundException;
    public ArrayList<User> getAllUsers() throws RemoteException, SQLException,ClassNotFoundException;
    public User searchUser(String name) throws RemoteException, SQLException,ClassNotFoundException;
    public boolean matchPassword(String name, String entertext) throws RemoteException, SQLException,ClassNotFoundException;
    public ArrayList<User> getAllSimilarUsers(String typed) throws RemoteException,ClassNotFoundException, SQLException;

    
}
