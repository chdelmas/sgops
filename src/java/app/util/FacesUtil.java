package app.util;


import javax.faces.context.FacesContext;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
public class FacesUtil {
    
    public static Object getSessionMapValue(String key){
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(key);
    }
    public static void setSessionMapValue(String key, Object value){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(key, value);
    }
    public static Object getApplicationMapValue(String key){
        return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get(key);
    }
    public static void setApplicationMapValue(String key, Object value){
        FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put(key, value);
    }
}
