/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp.database;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class AdderRemote extends UnicastRemoteObject implements Adder {

    AdderRemote() throws RemoteException {super();}
    
    @Override
    public List<clients> display(){
       
        List<clients> clients = new ArrayList<>();
        clients.add(new clients(5, "James", "Franklin", "frank@gmail.com", 50000));
        clients.add(new clients(6, "Ravi", "Kumat", "ravkumat@hotmail.com", 98000));
        clients.add(new clients(7, "Vimal", "Jaiswal", "jaiswalVim@yahoo", 930000));
        
        return clients;
    }
    
}
