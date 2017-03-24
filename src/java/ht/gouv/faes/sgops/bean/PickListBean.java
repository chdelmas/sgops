/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author chdelmas
 */
@ManagedBean
@ViewScoped
public class PickListBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//        private DualListModel<TBureaux> bureaux;
////	 private DualListModel<TBureaux> cities;
//
//	public PickListBean() {
//		//Players
//            BureauDAO bureauDAO = new BureauDAO();
//		List<TBureaux> source = new ArrayList<TBureaux>();
//		List<TBureaux> target = new ArrayList<TBureaux>();
//                for(TBureaux p : bureauDAO.getAll()){
//                      source.add(p);
//        }
//                
//               bureaux = new DualListModel<TBureaux>(source, target);
//		 
//	}
// 
////    private void fillDataLayers(){
////       dataLayersItems =new LinkedList<SelectItem>();
////       DataLayersDAO dataLayersDAO = new DataLayersDAO();    
////        dataLayersItems.add(new SelectItem("0","---Tous les Points"));
////          this.listDatalayers =dataLayersDAO.getAll();
////        for(TDataLayers o : listDatalayers){
////              SelectItem selectItem = new SelectItem(o.getDataLayerID(),o.getDataLayerTitle());
////             this.dataLayersItems.add(selectItem);
////        }
//        
//    public void onTransfer(TransferEvent event) {
//        StringBuilder builder = new StringBuilder();
//        for(Object item : event.getItems()) {
//            builder.append(((TBureaux) item).getCodeBureau().toString()).append("<br />");
//        }
//     
//         
//        FacesMessage msg = new FacesMessage();
//        msg.setSeverity(FacesMessage.SEVERITY_INFO);
//        msg.setSummary("Items Transferred");
//      //  msg.setDetail(builder.toString());
//        
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
//    
//    //Settters / Getters
//
//    public DualListModel<TBureaux> getBureaux() {
//        return bureaux;
//    }
//
//    public void setBureaux(DualListModel<TBureaux> bureaux) {
//        this.bureaux = bureaux;
//    }
//
//    
//
//       //Panier Target
////      String  selectedPlayerNames = "";
////         for (TBureaux p : bureaux.getTarget()){
////    selectedPlayerNames += p.getQuartier() + " ";
////    }
//      
//           //Panier Source
////      String  panierSource = "";
////         for (TBureaux p : bureaux.getSource()){
////       panierSource += p.getQuartier() + " ";
////    }
//    
//    
}
                    