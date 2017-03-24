/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.google;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author chdelmas
 */
public class Geometry {
     @XmlElement
      private GeoPosition location;
    @XmlElement
    private Viewport viewport;
    @XmlElement
    private Viewport bounds;
    public GeoPosition getLocation() {
        return location;
    }

    public void setLocation(GeoPosition location) {
        this.location = location;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public Viewport getBounds() {
        return bounds;
    }

    public void setBounds(Viewport bounds) {
        this.bounds = bounds;
    }
     
     
}
