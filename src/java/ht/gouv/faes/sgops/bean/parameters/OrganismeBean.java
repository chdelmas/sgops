package ht.gouv.faes.sgops.bean.parameters;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.parameters;
//
//import ht.reseauquartier.controller.OrganismesDAO;
//import ht.reseauquartier.model.TOrganismes;
//import java.io.Serializable;
//import java.util.LinkedList;
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//import javax.faces.model.SelectItem;
//
///**
// *
// * @author chdelmas
// */
//@ManagedBean
//@RequestScoped
//public class OrganismeBean implements Serializable{
//  private TOrganismes selectedOrganisme;
//  private List<TOrganismes> listOrganismes;
//  private List<SelectItem> organismeItems;
//  public OrganismeBean() {
//       fillOrganismeItems();
//  }
//
//   
//     private void fillOrganismeItems(){
//       organismeItems =new LinkedList<SelectItem>();
//       OrganismesDAO organismesDAO = new OrganismesDAO();
//       listOrganismes = organismesDAO.getAll();
//      
//     //  this.organismeItems.add(new SelectItem("0","---Faire Un Choix"));
//        for(TOrganismes o : listOrganismes){
//              SelectItem selectItem = new SelectItem(o.getOrganismeId(),o.getSigle());
//             this.organismeItems.add(selectItem);
//        }
//        
//    }
//
//    public TOrganismes getSelectedOrganisme() {
//        return selectedOrganisme;
//    }
//
//    public void setSelectedOrganisme(TOrganismes selectedOrganisme) {
//        this.selectedOrganisme = selectedOrganisme;
//    }
//
//    public List<SelectItem> getOrganismeItems() {
//        return organismeItems;
//    }
//
//    public void setOrganismeItems(List<SelectItem> organismeItems) {
//        this.organismeItems = organismeItems;
//    }
//  
//}
