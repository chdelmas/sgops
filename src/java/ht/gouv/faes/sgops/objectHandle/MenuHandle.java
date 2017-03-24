package ht.gouv.faes.sgops.objectHandle;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;






/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
@ManagedBean
@RequestScoped
public class MenuHandle implements Serializable{
    private String outcome;
    public MenuHandle(){
        
    }
   
     public String userManager(){
      outcome="/app/app_utilisateurs?faces-redirect=true";
      return outcome;
     }
     
     public String dataManager(){
        outcome="/app/app_dataManager?faces-redirect=true";
      return outcome;
    }
     
      public String userCreate(){
     // String outcome;
      outcome="/app/app_uCreate?faces-redirect=true";
      return outcome;
     }
     
     public String bureauxManager(){
      //String outcome;
      outcome="/app/app_bureaux?faces-redirect=true";
      return outcome;
     }
     
     public String blocsManager(){
      //String outcome;
      outcome="/app/app_blocs?faces-redirect=true";
      return outcome;
     }
      public String blocCreate(){
      outcome="/app/app_bCreate?faces-redirect=true";
      return outcome;
     }
    public String sigManager(){
      //String outcome;
      outcome="/app/app_sig?faces-redirect=true";
      return outcome;
     } 
    public String opsManager(){
     // String outcome;
      outcome="/app/app_Prestataire?faces-redirect=true";
      return outcome;
     }
    public String dashManager(){
     // String outcome;
      outcome="/app/app_dash?faces-redirect=true";
      return outcome;
     }
   
    public String collecteManager(){
         // String outcome;
      outcome="/app/app_collectes?faces-redirect=true";
      return outcome;
    }
    public String listInscrits(){
          // String outcome;
      outcome="/app/app_collectes?faces-redirect=true";
      return outcome;
    }
      
      
     public String assignation(){
        
      outcome="/app/app_assignation?faces-redirect=true";
      return outcome;
    }
     public String mindMap(){
        
      outcome="/app/app_mind?faces-redirect=true";
      return outcome;
    }
     
       public String forgetPAssword(){
        
      outcome="/app/forget?faces-redirect=true";
      return outcome;
    }
     
     
//    public void linkPres(){
//        String url =null;
//      url="faces/addPrestataire.xhtml";
//        try {
//            //redirection
//            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
//        } catch (IOException ex) {
//            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    }
     public void addMessage(String summary) {   
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);   
        FacesContext.getCurrentInstance().addMessage(null, message);   
    }  
     
     
      
       public void destroyWorld(ActionEvent actionEvent){  
       FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "System Error",  "Please try again later.");  
          
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  

//public String add(ActionEvent actionEvent){
//      String outcome =null;
//      outcome="addPrestataire?faces-redirect=true";
//      return outcome;
//     }
public String update(){
      String outcome;
      outcome="addPrestataire?faces-redirect=true";
      return outcome;
     }
  public void save(ActionEvent actionEvent) {   
        addMessage("Data saved");   
    }   
       
    public void update(ActionEvent actionEvent) {   
        addMessage("Data updated");   
    }   
       
    public void delete(ActionEvent actionEvent) {   
        addMessage("Data deleted");   
    }   
      
    public void quitter(){
       
        addMessage("Quitter Session");
       
      String url="index.xhtml";
        try {
            //redirection
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void admin(){
       
        addMessage("Quitter Session");
       
      String url="sa/index.xhtml";
        try {
            //redirection
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
    public void sendMail(){
          addMessage("Sendimg Mail Module");
       
      String url="sendmail.xhtml";
        try {
            //redirection
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
      public void lister(){
       
        addMessage("Lister Prestataire");
       
      String url="listerPrestataire.xhtml";
        try {
            //redirection
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
     
  public void statOperators(){
       
        addMessage("Analyse");
       
      String url="statOperators.xhtml";
        try {
            //redirection
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
  public void statFormeLegales(){
       
        addMessage("Analyse");
       
      String url="statFormeLegale.xhtml";
        try {
            //redirection
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
  public void statCategories(){
       
        addMessage("Analyse");
       
      String url="statCategories.xhtml";
        try {
            //redirection
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException ex) {
            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
     
}
