/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class TerminalController {
    public String handleCommand(String command, String[] params) {
        String value;
    if(command.trim().equals("greet")) {
            value = "Hello " + params[0];
          }
         else if(command.equals("date")) 
         {
             value= new Date().toString();
         }
         else 
         {
            value= command + " not found";
         }
    return value;
}

}
