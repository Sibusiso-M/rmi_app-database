/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp.database;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

/**
 *
 * @author User
 */
public class MyClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        try {
        Registry r = LocateRegistry.getRegistry("127.0.0.1",1099);
        Adder stub = (Adder)Naming.lookup("CIA"); //in this gateway look for "CIA" parameter
        
        List<clients> clientsList = stub.display();
        
            System.out.println("Acc_NO \t FName \t LName \t Email \t Amount");
            for (clients element:clientsList) {
                System.out.println(element.toString());               
            }
        
        } catch (Exception e) {
           // System.out.println(e.toString());
        }        
    }
    
}
