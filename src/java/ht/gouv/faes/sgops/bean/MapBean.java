package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.event.map.PointSelectEvent;
import org.primefaces.event.map.StateChangeEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.LatLngBounds;
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
@ManagedBean
@RequestScoped
public class MapBean implements Serializable {
         public int cont = 0;
	
        private MapModel model;
	private MapModel emptyModel;

	private MapModel simpleModel;
	
	private MapModel advancedModel;
	
	private MapModel polylineModel;
	
	private MapModel polygonModel;
        
	private MapModel circleModel;
	
    private MapModel rectangleModel;
	
	private MapModel draggableModel;

	private Marker marker;
	
	private String title;
	
	private double lat;
	
	private double lng;



	public MapBean() {
		polygonModel = new DefaultMapModel();
		
		//Shared coordinates
		//LatLng coord1 = new LatLng(18.576882, -72.2943);
		//LatLng coord2 = new LatLng(19.73619, -72.193895);
		//LatLng coord3 = new LatLng(36.879703, 30.706707);

		//Polygon
		//Polygon polygon = new Polygon();
	//	polygon.getPaths().add(coord1);
	//	polygon.getPaths().add(coord2);
		//polygon.getPaths().add(coord3);

//		polygon.setStrokeColor("#FF9900");
//		polygon.setFillColor("#FF9900");
//		polygon.setStrokeOpacity(0.7);
//		polygon.setFillOpacity(0.7);
//		
//		polygonModel.addOverlay(polygon);
	}

//     public MapModel getMapModel() {
//        
//        advancedModel = new DefaultMapModel();
//        
//        String remoteAddr = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getRemoteAddr();
//        if(remoteAddr.equalsIgnoreCase("127.0.0.1"))//for testing purposes
//                remoteAddr = "81.165.100.98";
//
//        String coordinatesVisitor = ipToGeoLocationSessionBean.getCityForIp(remoteAddr, IpToGeoLocationSessionBean.RETURN_COORDINATES);
//
//        //show the location of the visitor
//        if(coordinatesVisitor != null && coordinatesVisitor.indexOf(",")!=-1)
//        {
//            double lat = Double.parseDouble(coordinatesVisitor.substring(0, coordinatesVisitor.indexOf(",")));
//            double lon = Double.parseDouble(coordinatesVisitor.substring(coordinatesVisitor.indexOf(",")+1, coordinatesVisitor.length()));
//
//            LatLng coordVisitor = new LatLng(lat,lon);
//            //Icons and Data
//            advancedModel.addOverlay(
//                    new Marker(coordVisitor, "Locatie bezoeker", "testtest", "http://maps.google.com/mapfiles/kml/pal3/icon48.png"));
//        }
//
//        //show the companies locations
//        for(CompanyAddress companyAddress : getSelectedCompany().getCompanyAddressList())
//        {
//            //Shared coordinates
//            LatLng coord1 = new LatLng(companyAddress.getLatitude(), companyAddress.getLongitude());
//            //Icons and Data
//            advancedModel.addOverlay(
//                    new Marker(coord1, companyAddress.getCompany().getName() + " te " + companyAddress.getCity(), "konyaalti.png", "http://maps.google.com/mapfiles/ms/micons/yellow-dot.png"));
//        }
//        return advancedModel;
//    }
// 
//        
	public MapModel getPolygonModel() {
		return polygonModel;
	}
public void onPointSelect(PointSelectEvent event) { 
    LatLng latlng = event.getLatLng(); 
addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Point Selected", "Lat:" + latlng.getLat() + ", Lng:" + latlng.getLng()));
}  

	public void onPolygonSelect(OverlaySelectEvent event) {
		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Polygon Selected", null));
	}
       public void onPolygonSelect() {
		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Polygon Selected", null));
	}
        public void onMarkerSelect(OverlaySelectEvent event) {  
      marker = (Marker) event.getOverlay();  
        
      addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", marker.getTitle()));  
  } 
   
//        public void onPolygonSelect(OverlaySelectEvent event) { 
//     addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Polygon Selected", null));
//          }        
        public void DinepaTestChlore(){
//             marker = new Marker(new LatLng(54.638478737889805, -6.172106523437492), "mkr"); 
//             model.addOverlay(marker);
//            foreach(Site:DansLePays.getAll()){
//                       // marker = new Marker(new LatLng(54.638478737889805, -6.172106523437492), "mkr"); 
//                     //   model.addOverlay(marker);
//            }
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
       //    context.execute("overOverLay('54.638478737889805','-6.172106523437492')");
       }
       else if(cont==1)
       {
          marker = new Marker(new LatLng(54.64463773636441, -6.172106523437492), "mkr1");
       //   context.execute("overOverLay('54.65463773636441','-6.192106523437492','mkr1')");
       }
       else if(cont==2)
       {
          
          marker = new Marker(new LatLng(54.66463773636441, -6.202106523437492), "mkr2");
         // context.execute("overOverLay('54.66463773636441','-6.202106523437492',)");
       }
       else if(cont==3)
       {
          marker = new Marker(new LatLng(54.65463773636441, -6.192106523437492), "mkr3");
         // context.execute("overOverLay('54.65463773636441','-6.192106523437492')");             
      
       }
       cont++;
       model.addOverlay(marker);
      
  }
        public Marker getMarker() {  
      return marker;  
  } 
      
 public void onStateChange(StateChangeEvent event) {
		LatLngBounds bounds = event.getBounds();
		int zoomLevel = event.getZoomLevel();
		
		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Zoom Level", String.valueOf(zoomLevel)));
		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Center", event.getCenter().toString()));
		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "NorthEast", bounds.getNorthEast().toString()));
		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "SouthWest", bounds.getSouthWest().toString()));
	}
	
//	public void onPointSelect(PointSelectEvent event) {
//		LatLng latlng = event.getLatLng();
//		
//		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Point Selected", "Lat:" + latlng.getLat() + ", Lng:" + latlng.getLng()));
//	}
	
        
	public void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
        
        //

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public MapModel getModel() {
        return model;
    }

    public void setModel(MapModel model) {
        this.model = model;
    }

    public MapModel getEmptyModel() {
        return emptyModel;
    }

    public void setEmptyModel(MapModel emptyModel) {
        this.emptyModel = emptyModel;
    }

    public MapModel getSimpleModel() {
        return simpleModel;
    }

    public void setSimpleModel(MapModel simpleModel) {
        this.simpleModel = simpleModel;
    }

    public MapModel getAdvancedModel() {
        return advancedModel;
    }

    public void setAdvancedModel(MapModel advancedModel) {
        this.advancedModel = advancedModel;
    }

    public MapModel getPolylineModel() {
        return polylineModel;
    }

    public void setPolylineModel(MapModel polylineModel) {
        this.polylineModel = polylineModel;
    }

    public MapModel getCircleModel() {
        return circleModel;
    }

    public void setCircleModel(MapModel circleModel) {
        this.circleModel = circleModel;
    }

    public MapModel getRectangleModel() {
        return rectangleModel;
    }

    public void setRectangleModel(MapModel rectangleModel) {
        this.rectangleModel = rectangleModel;
    }

    public MapModel getDraggableModel() {
        return draggableModel;
    }

    public void setDraggableModel(MapModel draggableModel) {
        this.draggableModel = draggableModel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
        
        
}
			