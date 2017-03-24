/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author chdelmas
 */
@ManagedBean(name="language")
@SessionScoped
public class LanguageBean implements Serializable{
 
	private static final long serialVersionUID = 1L;
 
	private String localeCode="fr";
 
	private static Map<String,Object> countries;
	public LanguageBean(){
                
		countries =  new HashMap<String,Object>();
		countries.put("FRENCH", Locale.FRENCH); //label, value
                countries.put("ENGLISH", Locale.ENGLISH);
                
        }
 
	public Map<String, Object> getCountriesInMap() {
		return countries;
	}
 
 
	public String getLocaleCode() {
		return localeCode;
	}
 
 
	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}
 
	//value change event listener
	public void countryLocaleCodeChanged(ValueChangeEvent e){
 
		String localValue = e.getNewValue().toString();
 
		//loop country map to compare the locale code
                 Locale  search= (Locale)countries.get(localValue);
               FacesContext.getCurrentInstance()
        			.getViewRoot().setLocale(search);
  
	}
        
   
   public String englishAction() {
      FacesContext context = FacesContext.getCurrentInstance();
      context.getViewRoot().setLocale(Locale.ENGLISH);
      return null;
   }
   public String frenchAction() {
      FacesContext context = FacesContext.getCurrentInstance();
      context.getViewRoot().setLocale(Locale.FRANCE);
      return null;
   }
 public void updateCountryLocaleCodeChanged(){
     
 }
    public static Map<String, Object> getCountries() {
        return countries;
    }

    public static void setCountries(Map<String, Object> countries) {
        LanguageBean.countries = countries;
    }
 
}