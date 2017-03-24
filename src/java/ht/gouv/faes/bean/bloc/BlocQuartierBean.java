/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.bean.bloc;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author chdelmas
 */
@ManagedBean
@RequestScoped
public class BlocQuartierBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//    private BlocQuartierDAO blocQuartierDAO;
//    private List<TBlocQuartiers> listBlocQuartier;
//    private TBlocQuartiers selectedBlocQuartier;
//    private TBlocQuartiers[] selectedBlocQuartiers;
//    private BlocQuartierDataModel blocQuartierDataModel;
//    private List<SelectItem> blocQuartierItems;
//
//   public BlocQuartierBean() {
//       blocQuartierDAO=new BlocQuartierDAO();
//       listBlocQuartier = new ArrayList<TBlocQuartiers>();
//       listBlocQuartier=blocQuartierDAO.getAll();
//       fillOrganismeItems();
//}
//
//  private void fillOrganismeItems(){
//       blocQuartierItems =new LinkedList<SelectItem>();  
//        //this.blocQuartierItems.add(new SelectItem("0","---Faire Un Choix"));
//        for(TBlocQuartiers o : listBlocQuartier){
//              SelectItem selectItem = new SelectItem(o.getCodeQuartier(),o.getQuartier());
//             this.blocQuartierItems.add(selectItem);
//        }
//        
//    }
//
//  public List<TBlocQuartiers> complete(String query) {
//		List<TBlocQuartiers> suggestions = new ArrayList<TBlocQuartiers>();
//		
//		for(TBlocQuartiers p : listBlocQuartier) {
//			if(p.getQuartier().startsWith(query)) {
//                        suggestions.add(p);
//                    }
//		}
//		
//		return suggestions;
//	}
//  
//  
//  
//    public BlocQuartierDAO getBlocQuartierDAO() {
//        return blocQuartierDAO;
//    }
//
//    public void setBlocQuartierDAO(BlocQuartierDAO blocQuartierDAO) {
//        this.blocQuartierDAO = blocQuartierDAO;
//    }
//
//    public List<TBlocQuartiers> getListBlocQuartier() {
//        return listBlocQuartier;
//    }
//
//    public void setListBlocQuartier(List<TBlocQuartiers> listBlocQuartier) {
//        this.listBlocQuartier = listBlocQuartier;
//    }
//
//    public TBlocQuartiers getSelectedBlocQuartier() {
//        return selectedBlocQuartier;
//    }
//
//    public void setSelectedBlocQuartier(TBlocQuartiers selectedBlocQuartier) {
//        this.selectedBlocQuartier = selectedBlocQuartier;
//    }
//
//    public TBlocQuartiers[] getSelectedBlocQuartiers() {
//        return selectedBlocQuartiers;
//    }
//
//    public void setSelectedBlocQuartiers(TBlocQuartiers[] selectedBlocQuartiers) {
//        this.selectedBlocQuartiers = selectedBlocQuartiers;
//    }
//
//    public BlocQuartierDataModel getBlocQuartierDataModel() {
//        return blocQuartierDataModel;
//    }
//
//    public void setBlocQuartierDataModel(BlocQuartierDataModel blocQuartierDataModel) {
//        this.blocQuartierDataModel = blocQuartierDataModel;
//    }
//
//    public List<SelectItem> getBlocQuartierItems() {
//        return blocQuartierItems;
//    }
//
//    public void setBlocQuartierItems(List<SelectItem> blocQuartierItems) {
//        this.blocQuartierItems = blocQuartierItems;
//    }
//  
//  
//  
}
