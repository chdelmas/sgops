/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;
 
import javax.faces.bean.ManagedBean;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class ForgetPassword {
    private static final long serialVersionUID = 1505268042561594901L;
   
    private String APIpasswordMD5= "98d84980fa62445b5753231142748447";
  
    private String username= "";
    private String password;
    private String email=null;
    private String phone;
    private boolean status= false;
    private int OrgansimeID;
    
    public ForgetPassword(){
        
    }
    
    public  ForgetPassword (String username, String password, int org, String email){
        this.username=username;
        this.password=password;
        this.OrgansimeID=org;
        this.email= email;
        
        
    }

      //Setter & gette
    public String getAPIpasswordMD5() {
        return APIpasswordMD5;
    }

    
    
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

     
     
    
       
}
