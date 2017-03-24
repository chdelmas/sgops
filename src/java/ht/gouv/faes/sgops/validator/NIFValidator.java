/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author chdelmas
 */
public class NIFValidator implements Validator {
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
           
    //Get the component's contents and cast it to a String
    String enteredEmail = (String)o;

    //Set the email pattern string
     Pattern p = Pattern.compile("^\\d{3}[- ]?\\d{3}[- ]?\\d{3}[- ]?\\d{1}$");
    
    //Match the given string with the pattern
    Matcher m = p.matcher(enteredEmail);

    //Check whether match is found
    boolean matchFound = m.matches();

    if (!matchFound) {
        FacesMessage message = new FacesMessage();
        message.setDetail("Format du NIF est incorrect - Le format est en exemple 000-000-000=0");
        message.setSummary("Format du NIF est incorrect - Le format est en exemple 000-000-000-0");
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }

    }
}
