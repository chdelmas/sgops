/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.util;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author chdelmas
 */
public class MailUtil {

//    
//    private MailSender mailSender;
//
//    public MailUtil(MailSender mailSender)
//    {
//        this.mailSender=mailSender;
//    }
//    public void sendResetPasswordMail(String email, String password) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("mymail@gmail.com");
//        message.setTo(email);
//        message.setSubject("Your new password!");
//        message.setText("Here is your new account login password - " + password);
//        mailSender.send(message);
//    }
//    
//   // Validate Email Address Using Java Mail API
//
//    	private boolean crunchifyEmailValidator(String email) {
//		boolean isValid = false;
//		try {
//			//
//			// Create InternetAddress object and validated the supplied
//			// address which is this case is an email address.
//			InternetAddress internetAddress = new InternetAddress(email);
//			internetAddress.validate();
//			isValid = true;
//		} catch (AddressException e) {
//			System.out.println("You are in catch block -- Exception Occurred for: " + email);
//		}
//		return isValid;
//	}
// 
//	private void myLogger(String email, boolean valid) {
//		System.out.println(email + " is " + (valid ? "a" : "not a") + " valid email address\n");
//	}
//
//    
}