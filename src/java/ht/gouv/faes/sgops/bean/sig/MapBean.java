package ht.gouv.faes.sgops.bean.sig;

//package ht.reseauquartier.gret.bean.sig;
//
//import ht.reseauquartier.controller.BureauDAO;
//import ht.reseauquartier.controller.DataLayersDAO;
//import ht.reseauquartier.controller.FontainesDAO;
//import ht.reseauquartier.logique.model.PointSpatiale;
//import ht.reseauquartier.model.TBureaux;
//import ht.reseauquartier.model.TDataLayers;
//import ht.reseauquartier.model.TFontaines;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//import javax.faces.event.AjaxBehaviorEvent;
//import javax.faces.model.SelectItem;
//import javax.persistence.Transient;
//import org.primefaces.event.map.OverlaySelectEvent;
//import org.primefaces.model.map.DefaultMapModel;
//import org.primefaces.model.map.LatLng;
//import org.primefaces.model.map.MapModel;
//import org.primefaces.model.map.Marker;
//
//
//
//
//
///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author chdelmas
// */
//@ManagedBean
//@ViewScoped
//public final class MapBean implements Serializable {
// private static final long serialVersionUID = 1L;
//
//         MapModel model  = new DefaultMapModel();
//    
//        private List <MarkerData> space;
//        private Marker selectedMarker;
//        @Transient
//	private BureauDAO bureauDAO;
//        private List<TBureaux> listBureaux;
//        private PointSpatiale selectedData;
//        @Transient
//        private FontainesDAO fontainesDAO;
//        private List<TFontaines> listFontaines;
//        private List<TDataLayers> listDataLayers;
//        private List<PointSpatiale> listPointSpatiales;
//        //Controller
//        @Transient
//        private DataLayersDAO dataLayerDAO;
//        private TDataLayers selectedDataLayer;
//        private List<TDataLayers> selectedListDataLayers;
//        
//        private TDataLayers[] selectedDataLayers;
//        
//        private List<TDataLayers> listDatalayers;
//        private List<SelectItem> dataLayersItems;
//        
//        private int zoom=8;
//        private boolean fitBouns=true;
//        private boolean selectionChanged = false;
//        private double latitude =18.361058;
//        private double longitude=-72.160021;
//        private static final Logger log = Logger.getLogger(MapBean.class.getName());
//     
//@PostConstruct
//public void init() {
//    fitBouns=true;
//    latitude =18.361058;
//    longitude=-72.160021;
//    zoom=8;
//             space = new ArrayList<MarkerData>();
//            listPointSpatiales= new ArrayList<PointSpatiale>();      
//            selectedListDataLayers = new ArrayList<TDataLayers>();
//             fillDataLayers();
//}
//        
//        
//        public  MapBean() {
//             
//            
//} 
//        private void loadFontaines(){
//             fontainesDAO=new FontainesDAO();
//             listPointSpatiales= fontainesDAO.getAllPointSpatiaux();
//             for(PointSpatiale pointSpatiale : listPointSpatiales){
//                 LatLng coord = new LatLng(pointSpatiale.getLatitude(), pointSpatiale.getLongitude());
//                selectedMarker = new Marker(coord,PageHtmlInfo(pointSpatiale),"fontain.png" , "../resources/common/marker/fontain.png");
//                space.add(new MarkerData(selectedMarker,pointSpatiale));
//                 model.addOverlay(selectedMarker);
//             }
//             
//        }
//        private void loadBureaux(){
//            bureauDAO=new BureauDAO();
//             listPointSpatiales = bureauDAO.getAllPointSpatiaux();
//              for(PointSpatiale pointSpatiale : listPointSpatiales){
//                 LatLng coord = new LatLng(pointSpatiale.getLatitude(), pointSpatiale.getLongitude());
//               selectedMarker = new Marker(coord,PageHtmlInfo(pointSpatiale),"bureau.png", "../resources/common/marker/bureau.png");  
//                 space.add(new MarkerData(selectedMarker,pointSpatiale));
//                 model.addOverlay(selectedMarker);
//        }
//        
//        }
//     
//        public void DisplaySelectedLayer(int layer){
//             switch(layer){
//                 case 0: loadBureaux();
//                         loadFontaines();
//                         break;
//                        
//                 case 1:  loadBureaux(); break;
//                 case 4:  loadFontaines(); break;
//                  
//                 default :
//                          model.getMarkers().clear();
//                   break;
//             }
//        }
//     private void fillDataLayers(){
//       dataLayersItems =new LinkedList<SelectItem>();
//       DataLayersDAO dataLayersDAO = new DataLayersDAO();    
//        dataLayersItems.add(new SelectItem("0","---Tous les Points"));
//          this.listDatalayers =dataLayersDAO.getAll();
//        for(TDataLayers o : listDatalayers){
//              SelectItem selectItem = new SelectItem(o.getDataLayerID(),o.getDataLayerTitle());
//             this.dataLayersItems.add(selectItem);
//        }
//        
//    }     
//       
//         private String ObjectPrefix(int objectType)  {
//             String prefix;
//               switch (objectType) {
//                       case 1:
//                           prefix="F";
//                           break;
//                       default :
//                    prefix="B";
//                           break;
//               }
//               return prefix;
//         }
//
//         private String PageHtmlInfo(PointSpatiale p){
//            String info;
//                 info = "Nom : " + p.getName() + "\n";
//                   info +=  "Description : " + p.getDescription() +  "\n" ;
//                 return info;
//        }
//        //(OverlaySelectEvent event)
//       
//      public void onMarkerSelect(OverlaySelectEvent event) {
//		selectedMarker = (Marker) event.getOverlay();
//                 this.selectedData=(selectedMarker!=null?find(selectedMarker) :new PointSpatiale());
//               log.info(this.selectedData.toString());
//		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", selectedMarker.getTitle()));
//	}
//	
//
//        public PointSpatiale find(Marker markerpoint){
//                PointSpatiale objectData= new PointSpatiale() ;
//                for(MarkerData item:space){
//                     if(item.selectedMarker.getId().equals(markerpoint.getId())){
//                          objectData=item.selectedPointSpatiale;
//                     break;
//                } else{
//                    objectData=null;
//                }
//           
//	}    
//            return objectData;
//        }
//       
//       public void addMessage(FacesMessage message) {
//		FacesContext.getCurrentInstance().addMessage(null, message);
//	}
//
//// HP 164 ancre //
//    public void reloaded (AjaxBehaviorEvent event){
////      String info= (String) ((UIOutput)event.getSource()).getValue();
//        List<TDataLayers>id  = (List<TDataLayers>) event.getComponent().getAttributes().get("value");
//         if(id != null) {
//          // listEntity = escDao.findByxxxx(id, true);
//      }
//        // TDataLayers t = this.selectedListDataLayers.get(0);
//        log.log(Level.INFO, "Data Layer Size is : " ,id.get(0).getDataLayerTitle());
////       for(TDataLayers layer: selectedDataLayers){
////             loadActivesDataLayers(layer);
////        }
//      
//    }
////   public void toggleSelection() {
////      Map<Long, Boolean> selecaoNova = new TreeMap<Long, Boolean>();
////      if (!cbAll) {
////         for (Iterator<Long> iter =this.getSelectedListDataLayers()..kkeySet().iterator(); iter
////               .hasNext();) {
////            Long id = iter.next();
////            selecaoNova.put(id, true);
////         }
////         setSelection(selecaoNova);
////      } else {
////         clearSelection();
////      }
////
////   }
//    
//    public void reload(){
//       this.model.getMarkers().clear();
//         Object[] rec;
//           rec =  this.selectedListDataLayers.toArray();
//           for(int i=1;i<=rec.length;i++) {
//                switch ((Integer.parseInt(rec[i-1].toString())) )
//              
//              {
//                  case 1:
//                          loadBureaux();
//                           break;
//                  case 4:
//                         loadFontaines();
//                       break;
//                  default :
//                      //System.out.println("DataLayer id " + dataLayers.getDataLayerID().toString());
//                      break;
//                
//                 }
//         
//                 fitBouns=true;
//                 latitude =18.361058;
//                 longitude=-72.160021;
//                 zoom=11;
//           
//           }
//           
//      
//    }
//    private void loadActivesDataLayers(TDataLayers dataLayers){
//          // this.model.getMarkers ( ).clear ( );
//    
//        switch (dataLayers.getDataLayerID().intValue())
//              {
//                  case 1:
//                          loadBureaux();
//                           break;
//                  case 4:
//                         loadFontaines();
//                       break;
//                  default :
//                      System.out.println("DataLayer id " + dataLayers.getDataLayerID().toString());
//                      break;
//                
//                 }
////        
//                 fitBouns=true;
//                 latitude =18.361058;
//                 longitude=-72.160021;
//                 zoom=8;
//         }        
//
//  private String getMarkerURL ( String color )
//  {
//    return new StringBuilder ( "http://chart.googleapis.com/chart?chst=d_map_pin_icon&chld=glyphish_medical|" ).append ( color )
//        .append ( "&ext=.png" ).toString ( );
//  }
//  
//  //Setters and Getters
//
//    public MapModel getModel() {
//        return model;
//    }
//
//    public void setModel(MapModel model) {
//        this.model = model;
//    }
//
//    public List<MarkerData> getSpace() {
//        return space;
//    }
//
//    public void setSpace(List<MarkerData> space) {
//        this.space = space;
//    }
//
//    public Marker getSelectedMarker() {
//        return selectedMarker;
//    }
//
//    public void setSelectedMarker(Marker selectedMarker) {
//        this.selectedMarker = selectedMarker;
//    }
//
//    public BureauDAO getBureauDAO() {
//        return bureauDAO;
//    }
//
//    public void setBureauDAO(BureauDAO bureauDAO) {
//        this.bureauDAO = bureauDAO;
//    }
//
//    public List<TBureaux> getListBureaux() {
//        return listBureaux;
//    }
//
//    public void setListBureaux(List<TBureaux> listBureaux) {
//        this.listBureaux = listBureaux;
//    }
//
//    public PointSpatiale getSelectedData() {
//        return selectedData;
//    }
//
//    public void setSelectedData(PointSpatiale selectedData) {
//        this.selectedData = selectedData;
//    }
//
//    public FontainesDAO getFontainesDAO() {
//        return fontainesDAO;
//    }
//
//    public void setFontainesDAO(FontainesDAO fontainesDAO) {
//        this.fontainesDAO = fontainesDAO;
//    }
//
//    public List<TFontaines> getListFontaines() {
//        return listFontaines;
//    }
//
//    public void setListFontaines(List<TFontaines> listFontaines) {
//        this.listFontaines = listFontaines;
//    }
//
//    public List<TDataLayers> getListDataLayers() {
//        return listDataLayers;
//    }
//
//    public void setListDataLayers(List<TDataLayers> listDataLayers) {
//        this.listDataLayers = listDataLayers;
//    }
//
//    public List<PointSpatiale> getListPointSpatiales() {
//        return listPointSpatiales;
//    }
//
//    public void setListPointSpatiales(List<PointSpatiale> listPointSpatiales) {
//        this.listPointSpatiales = listPointSpatiales;
//    }
//
//    public DataLayersDAO getDataLayerDAO() {
//        return dataLayerDAO;
//    }
//
//    public void setDataLayerDAO(DataLayersDAO dataLayerDAO) {
//        this.dataLayerDAO = dataLayerDAO;
//    }
//
//    public TDataLayers getSelectedDataLayer() {
//        return selectedDataLayer;
//    }
//
//    public void setSelectedDataLayer(TDataLayers selectedDataLayer) {
//        this.selectedDataLayer = selectedDataLayer;
//    }
//
//    
//
//    public List<TDataLayers> getListDatalayers() {
//        return listDatalayers;
//    }
//
//    public void setListDatalayers(List<TDataLayers> listDatalayers) {
//        this.listDatalayers = listDatalayers;
//    }
//
//    public List<SelectItem> getDataLayersItems() {
//        return dataLayersItems;
//    }
//
//    public void setDataLayersItems(List<SelectItem> dataLayersItems) {
//        this.dataLayersItems = dataLayersItems;
//    }
//
//    public int getZoom() {
//        return zoom;
//    }
//
//    public void setZoom(int zoom) {
//        this.zoom = zoom;
//    }
//
//    public boolean isFitBouns() {
//        return fitBouns;
//    }
//
//    public void setFitBouns(boolean fitBouns) {
//        this.fitBouns = fitBouns;
//    }
//
//    public boolean isSelectionChanged() {
//        return selectionChanged;
//    }
//
//    public void setSelectionChanged(boolean selectionChanged) {
//        this.selectionChanged = selectionChanged;
//    }
//
//    public List<TDataLayers> getSelectedListDataLayers() {
//        return selectedListDataLayers;
//    }
//
//    public void setSelectedListDataLayers(List<TDataLayers> selectedListDataLayers) {
//        this.selectedListDataLayers = selectedListDataLayers;
//    }
//
//    public TDataLayers[] getSelectedDataLayers() {
//        return selectedDataLayers;
//    }
//
//    public void setSelectedDataLayers(TDataLayers[] selectedDataLayers) {
//        this.selectedDataLayers = selectedDataLayers;
//    }
//
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
//
//        
//}
//
