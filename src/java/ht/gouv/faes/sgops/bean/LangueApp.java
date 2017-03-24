/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.util.List;
import java.util.Locale;
import javax.faces.context.FacesContext;

/**
 *
 * @author chdelmas
 */
public class LangueApp {
    String language ="fr";
    List<String> languageList;
    FacesContext context;
    
    public LangueApp(){
         context = FacesContext.getCurrentInstance(); 
         context.getViewRoot().getLocale().getLanguage().length();
    }
    
 public String activerFR() { 
    
        context = FacesContext.getCurrentInstance(); 
       context.getViewRoot().setLocale(Locale.FRENCH); 
    
     return null; 
 
  } 
  
 
  
public String activerEN() { 
    
    FacesContext context = FacesContext.getCurrentInstance(); 
   
    context.getViewRoot().setLocale(Locale.ENGLISH); 
   
    return null; 
  
  } 

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
         FacesContext context = FacesContext.getCurrentInstance(); 
               if(language.equals("en")) {
                    context.getViewRoot().setLocale(Locale.ENGLISH); 
               } else {
                    context.getViewRoot().setLocale(Locale.FRENCH); 
               }
               //this example change locale to france
   //        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale('fr');
    }
  
    
}
