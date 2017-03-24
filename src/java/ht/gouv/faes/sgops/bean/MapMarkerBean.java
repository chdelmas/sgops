package ht.gouv.faes.sgops.bean;


import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
public class MapMarkerBean implements Serializable
{
  private static final long serialVersionUID = 5359528954148173473L;
  private MapModel model = new DefaultMapModel();
  public int cont = 0;
  private Marker marker; 
  public MapMarkerBean()
  {
      
  }

  public MapModel getModel()
  {
    System.out.println("Starting getModel");
    for(Marker m : model.getMarkers())
    {
      System.out.println("--" + m.getLatlng().getLat() + "--" + m.getLatlng().getLng());
    }
    System.out.println("Ending getModel");
    return model;
  }
  
  public void onMarkerSelect(OverlaySelectEvent event) {  
      marker = (Marker) event.getOverlay();  
        
      addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", marker.getTitle()));  
  }  
     
  public void updatemap()
  {
            //simple method to add differents points....
       System.out.println("Adding Marker");
       RequestContext context = RequestContext.getCurrentInstance();
       marker = null;
       if(cont==0)
       {
          marker = new Marker(new LatLng(54.638478737889805, -6.172106523437492), "mkr"); 
          context.execute("overOverLay('54.638478737889805','-6.172106523437492')");
       }
       else if(cont==1)
       {
          marker = new Marker(new LatLng(54.64463773636441, -6.172106523437492), "mkr1");
          context.execute("overOverLay('54.65463773636441','-6.192106523437492','mkr1')");
       }
       else if(cont==2)
       {
          
          marker = new Marker(new LatLng(54.66463773636441, -6.202106523437492), "mkr2");
          context.execute("overOverLay('54.66463773636441','-6.202106523437492',)");
       }
       else if(cont==3)
       {
          marker = new Marker(new LatLng(54.65463773636441, -6.192106523437492), "mkr3");
          context.execute("overOverLay('54.65463773636441','-6.192106523437492')");             
      
       }
       cont++;
       model.addOverlay(marker);
      
  }
  public Marker getMarker() {  
      return marker;  
  }  
  public void addMessage(FacesMessage message) {  
      FacesContext.getCurrentInstance().addMessage(null, message);  
  }  
  
}
