/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.push;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author chdelmas
 */
@ManagedBean
@ApplicationScoped
public class BeanPush implements Serializable {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

//    public void increment() {
//        count++;
//        RequestContext.getCurrentInstance().push("counter", count);
//    }
}