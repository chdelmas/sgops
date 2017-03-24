/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean.authenticate;

import java.io.Serializable;

/**
 *
 * @author chdelmas
 */
public class LoginUser implements Serializable{
  
    private String username= "";
    private String password;
    private String email=null;
    private boolean status= false;
    private int OrgansimeID;
    
    public LoginUser(){
        
    }
    
    public  LoginUser (String username, String password, int org, String email){
        this.username=username;
        this.password=password;
        this.OrgansimeID=org;
        this.email= email;
        
        
    }

      //Setter & getter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getOrgansimeID() {
        return OrgansimeID;
    }

    public void setOrgansimeID(int OrgansimeID) {
        this.OrgansimeID = OrgansimeID;
    }

    
     
    
       
}
