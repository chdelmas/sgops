/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.validator;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author chdelmas
 */
public class SMTPAuthenticator extends Authenticator { 
    private String username, password;
    public SMTPAuthenticator(String username,String password){
        this.username=username;
        this.password= password;
    }
    @Override
    public PasswordAuthentication getPasswordAuthentication() {
//           String username = this.username;
//           String password = this.password;
           return new PasswordAuthentication(username, password);
}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
