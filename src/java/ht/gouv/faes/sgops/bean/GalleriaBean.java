/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class GalleriaBean implements Serializable{
    private static final long serialVersionUID = 1L; 
    private List<String> images;

    private String effect = "fade";

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();

        for(int i=1;i<=3;i++) {
           String result = String.format("pic_%d", i)+ ".png";
            images.add(result);
        }
    }

    public List<String> getImages() {
        return images;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

}
