/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean.collectes;

 
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Hubert
 */

@ManagedBean
public class DataLayersBean implements Serializable{
    private static final long serialVersionUID = 7106004030806686639L;
//    private static final long serialVersionUID = 1L; 
//    private DataLayersDAO datalayersDAO;
//    private List<TDataLayers> listDatalayers;
//    private TDataLayers selectedDatalayers;
//    private TDataLayers[] selectedDatalayer;
//    private DatalayersDataModel datalayersDataModel;
//    private List<SelectItem> dataLayersItems;
//        public DataLayersBean() {
//            listDatalayers=new ArrayList<TDataLayers>();
//            DataLayersDAO dat=new DataLayersDAO();
//            listDatalayers=dat.getAll();
//            datalayersDataModel= new DatalayersDataModel(listDatalayers);
//            fillDataLayers();
//        }
//        
//
//     private void fillDataLayers(){
//       dataLayersItems = new LinkedList<SelectItem>();
//       DataLayersDAO dataLayersDAO = new DataLayersDAO();    
//     //  dataLayersItems.add(new SelectItem("0","---Faire Un Choix"));
//        for(TDataLayers o : dataLayersDAO.getAll()){
//              SelectItem selectItem = new SelectItem(o.getDataLayerID(),o.getDataLayerTitle());
//             this.dataLayersItems.add(selectItem);
//        }
//        
//    }     
//        
//        
//        
//        
//        
////getter and setter
//
//    public DataLayersDAO getDatalayersDAO() {
//        return datalayersDAO;
//    }
//
//    public void setDatalayersDAO(DataLayersDAO datalayersDAO) {
//        this.datalayersDAO = datalayersDAO;
//    }
//
//    public List<TDataLayers> getListDatalayers() {
//        return listDatalayers;
//    }
//
//    public void setListDatalayers(List<TDataLayers> listDatalayers) {
//        this.listDatalayers = listDatalayers;
//    }
//
//    public TDataLayers getSelectedDatalayers() {
//        return selectedDatalayers;
//    }
//
//    public void setSelectedDatalayers(TDataLayers selectedDatalayers) {
//        this.selectedDatalayers = selectedDatalayers;
//    }
//
//    public TDataLayers[] getSelectedDatalayer() {
//        return selectedDatalayer;
//    }
//
//    public void setSelectedDatalayer(TDataLayers[] selectedDatalayer) {
//        this.selectedDatalayer = selectedDatalayer;
//    }
//
//    public DatalayersDataModel getDatalayersDataModel() {
//        return datalayersDataModel;
//    }
//
//    public void setDatalayersDataModel(DatalayersDataModel datalayersDataModel) {
//        this.datalayersDataModel = datalayersDataModel;
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
//
//    // Manage Event
//    public void onRowSelect(SelectEvent event){
//        //FacesMessage msg=new FacesMessage("TDataLayers Selected",((TDataLayers) event.getObject()).getCodeBureau());
//        //FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
//    public void onRowSelect(UnselectEvent event){
//        //FacesMessage msg=new FacesMessage("TDataLayers Selected",((TDataLayers) event.getObject()).getCodeBureau());
//        //FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
//    public String onRowSelectNavigate(SelectEvent event){
//    FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedTDatalayers", event.getObject());
//    return "editBureau?faces-redirect=true";
//    }
    
}
