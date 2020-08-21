/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp.database;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

/**
 *
 * @author User
 */
public class MyServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        try {
            Registry r = LocateRegistry.createRegistry(1099);
            Adder stub = new AdderRemote(); // instantiate the AdderRemote class "constructor" type Adder remote
            Naming.rebind("CIA", stub);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

 
}
