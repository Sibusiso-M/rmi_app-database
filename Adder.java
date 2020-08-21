/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp.database;

import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author User
 */
public interface Adder extends Remote{
    
    public List<clients> display() throws Exception;
    
}
