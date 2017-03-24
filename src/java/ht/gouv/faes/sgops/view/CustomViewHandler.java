/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.view;

import java.util.Map;
import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.context.FacesContext;
import org.primefaces.mobile.renderkit.MobileRenderKit;
 

/**
 *
 * @author chdelmas
 */
public class CustomViewHandler extends ViewHandlerWrapper {

 private ViewHandler wrapped;

 public CustomViewHandler(ViewHandler wrapped) {
 this.wrapped = wrapped;
 }

 @Override
 public ViewHandler getWrapped() {
 return this.wrapped;
 }

  @Override
    public String calculateRenderKitId(FacesContext context) {
        Map<String,String> map = context.getExternalContext().getRequestParameterMap();
        
        if(map.containsKey("mobile"))
            return MobileRenderKit.RENDER_KIT_ID;
        else
            return this.wrapped.calculateRenderKitId(context);
    }
}


