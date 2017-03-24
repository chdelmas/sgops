/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.util;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;



/**
 *
 * @author chdelmas
 */
 
public class ActiveUtils {
   
    public static  String getActiveUsername(){
      String username;
       ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
       username  = (String)externalContext.getSessionMap().get("username");
      return (username!=null ?username : "inconnu");
}
    
}
