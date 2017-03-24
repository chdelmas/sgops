/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author chdelmas
 */
@FacesConverter(value="SurveyStatut")
public class SurveyStatut implements Converter{
     String[] statut = new String[]{"Ouvert", "Fermer"};
     
  @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string.isEmpty()){
               return null;
                        }
      return  statut[(Integer.parseInt(string)-1)].toString();
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
         
      int code = (Integer)o;
         
            
           return  statut[code-1];
    }
}