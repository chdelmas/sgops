/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class MessagesBean implements Serializable{
    private static final long serialVersionUID = 1L; 
     FacesContext ctx ;
     Locale locale, currentLocale ;
     ResourceBundle rb;
     ResourceBundle messages;
     String value;
     String langue ;
     public MessagesBean() {
        
        ctx = FacesContext.getCurrentInstance();
//         locale = ctx.getViewRoot().getLocale();
//         messages = ResourceBundle.getBundle("i18n.msgs", locale);
    }
     //currentLocale = new Locale("fr");
     
     public void Labels(String label){
         value =(messages.getString(label));
  
     }

    public String getValue() {
        return value;
    }
    

//    public void setValue(String label) {
//        value =(messages.getString(label));
//    }

    public void setValue(String value) {
        currentLocale  = new Locale(langue);
       // locale = ctx.getViewRoot().setLocale(currentLocale );
         messages = ResourceBundle.getBundle("i18n.msgs", locale);
        this.value = (messages.getString(value));
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
         
        this.langue = langue;
    }

     
    
        
//    FacesContext ctx = FacesContext.getCurrentInstance();
//Locale locale = ctx.getViewRoot().getLocale();
//ResourceBundle rb = ResourceBundle.getBundle("test.Messages", locale);
//String str = rb.getString("validation_error_message");

    public FacesContext getCtx() {
        return ctx;
    }

    public void setCtx(FacesContext ctx) {
        this.ctx = ctx;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public ResourceBundle getRb() {
        return rb;
    }

    public void setRb(ResourceBundle rb) {
        this.rb = rb;
    }

    public ResourceBundle getMessages() {
        return messages;
    }

    public void setMessages(ResourceBundle messages) {
        this.messages = messages;
    }
}
