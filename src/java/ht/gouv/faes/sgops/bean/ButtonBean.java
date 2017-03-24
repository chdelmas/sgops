package ht.gouv.faes.sgops.bean;


import javax.faces.application.FacesMessage;
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
public class ButtonBean {
//    public void save(ActionEvent actionEvent) {   
//        addMessage("Data saved");   
//    }   
//       
//    public void update(ActionEvent actionEvent) {   
//        addMessage("Data updated");   
//    }   
//       
//    public void delete(ActionEvent actionEvent) {   
//        addMessage("Data deleted");   
//    }   
       
    
    public String MusicAdd(ActionEvent actionEvent) {   
        addMessage("Add Music and saved");
        return "addMusic?faces-redirect=true";
    }   
       
    public void MusicUpdate(ActionEvent actionEvent) {   
        addMessage("Music Updated");   
    }   
       
    public void MusicDelete(ActionEvent actionEvent) {   
        addMessage("Delete  Music");   
    }   
    
   public void MusicSearch(ActionEvent actionEvent) {   
        addMessage("Data Search");   
    }    
   
   //============Genre =============
   public void GenreAdd(ActionEvent actionEvent) {   
        addMessage("Add Genre and saved");   
    }   
       
    public void GenrecUpdate(ActionEvent actionEvent) {   
        addMessage("Music Updated");   
    }   
       
    public void GenreDelete(ActionEvent actionEvent) {   
        addMessage("Delete  Music");   
    }   
    
   public void GenreSearch(ActionEvent actionEvent) {   
        addMessage("Data Search");   
    }    
   
   
   
    
    public void addMessage(String summary) {   
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);   
        FacesContext.getCurrentInstance().addMessage(null, message);   
    }   

}
