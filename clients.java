/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiapp.database;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class clients implements Serializable{

     int accNo;
     String firstName;
     String lastName;
     String email;
     float amount;
            
    public clients(int accNoParam , String firstNameParam , String lastNameParam, String emailParam, float amountParam) {
        this.accNo = accNoParam;
        this.amount = amountParam;
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
        this.email = emailParam;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    
    
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    @Override
    public String toString() {
        return String.format("%s \t%s \t%s \t%s \t%s", accNo,firstName,lastName,email,amount); //To change body of generated methods, choose Tools | Templates.
    }   
}
