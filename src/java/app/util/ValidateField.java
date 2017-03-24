/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author chdelmas
 */
public class ValidateField {
   
    public ValidateField(){
        
    }
    
    public void validateNIF(FacesContext facesContext, 
    UIComponent uIComponent, Object value) throws ValidatorException {
 
   /*SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx: 
         ^\\d{3}: Starts with three numeric digits. 
    [- ]?: Followed by an optional "-" 
    \\d{2}: Two numeric digits after the optional "-" 
    [- ]?: May contain an optional second "-" character. 
    \\d{4}: ends with four numeric digits. 
 
        Examples: 003-303-264-9; 0033032649 etc. 
*/  

         
    //Get the component's contents and cast it to a String
    String enteredNIF = (String)value;

    //Set the email pattern string
    Pattern p = Pattern.compile("^\\d{3}[- ]?\\d{3}[- ]?\\d{3}[- ]?\\d{1}$");

    //Match the given string with the pattern
    Matcher m = p.matcher(enteredNIF);

    //Check whether match is found
    boolean matchFound = m.matches();

    if (!matchFound) {
        FacesMessage message = new FacesMessage();
        message.setDetail("NIF not valid - The email must be in the format 000-000-000-0");
        message.setSummary("NIF not valid - The email must be in the format 0000-000-000-0");
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }
 }

     public void validateEmail(FacesContext facesContext, 
    UIComponent uIComponent, Object value) throws ValidatorException {
        
    //Get the component's contents and cast it to a String
    String enteredEmail = (String)value;

    //Set the email pattern string
    Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

    //Match the given string with the pattern
    Matcher m = p.matcher(enteredEmail);

    //Check whether match is found
    boolean matchFound = m.matches();

    if (!matchFound) {
        FacesMessage message = new FacesMessage();
        message.setDetail("Courriel invalide - Le format est  votrenom@votredomain.com");
        message.setSummary("Courriel invalide - Le format est  votrenom@votredomain.com");
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }
}
 public void validateCourriel(FacesContext context, UIComponent validate, 
        Object value) { 
    String inputFromField = (String) value; 
    String simpleTextPatternText = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
    Pattern textPattern = null; 
    Matcher emailMatcher = null; 
    textPattern = Pattern.compile(simpleTextPatternText); 
    emailMatcher = textPattern.matcher(inputFromField); 
    if (inputFromField.length() >= 30) { 
        FacesMessage msg = new FacesMessage(  "Pre dugacak email(Ne dozvoljeno)"); 
        throw new ValidatorException(msg); 
 
    } 
 
    if (inputFromField.length() <= 0) { 
        FacesMessage msg = new FacesMessage("Zaboraviliste email adresu"); 
        throw new ValidatorException(msg); 
 
    } 
 
    if (!emailMatcher.matches()) { 
        FacesMessage msg = new FacesMessage( 
                "Ne ispravan email. Napisiti email u ispravnom obliku. (Np: markomarkovic@mail.com)"); 
        throw new ValidatorException(msg); 
    }        
} 
 
// public void ifNIF(){
//        Tblprestataire t = new Tblprestataire();
//         FacesMessage message = new FacesMessage("Tab Changed", "NIF ");  
//        t = prestataireDAO.find(selectedPrestataire);
//          if (t.getNif().equals(this.selectedPrestataire.getNif())){
//               message.setSummary("NIF Exist");
//              message.setDetail("NIF Exist");
//                FacesContext.getCurrentInstance().addMessage(null, message);  
//             }
//          
//  }
    
 
}
