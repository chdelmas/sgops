/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author chdelmas
 */
@ManagedBean
@RequestScoped
public class EmailValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
           
    //Get the component's contents and cast it to a String
    String enteredEmail = (String)o;

    //Set the email pattern string
    Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

    //Match the given string with the pattern
    Matcher m = p.matcher(enteredEmail);

    //Check whether match is found
    boolean matchFound = m.matches();

    if (!matchFound) {
        FacesMessage message = new FacesMessage();
        message.setDetail("Format Email incorrect - Le format est en exemple directiongenerale@faes.gouv.ht");
        message.setSummary("Format Email incorrect - Le format est en exemple directiongenerale@faes.gouv.ht");
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }

    }
    
}
