/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author chdelmas
 */
@ManagedBean
@ViewScoped
public class DisableTag implements Serializable {

    private boolean disable;
    private boolean rendered;

    /** Creates a new instance of DisableTag */
    public DisableTag() {

        rendered = false;

    } //end of constructor

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public boolean isRendered() {
        return rendered;
    }

    public void setRendered(boolean rendered) {
        this.rendered = rendered;
    }

    public void changeMark(ValueChangeEvent vcEvent){

        rendered = Boolean.valueOf(vcEvent.getNewValue().toString()).booleanValue();
        System.out.println();

    }

} //end of class DisableTag