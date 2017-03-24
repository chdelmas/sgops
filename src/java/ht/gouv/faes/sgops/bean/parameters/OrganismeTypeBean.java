package ht.gouv.faes.sgops.bean.parameters;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.parameters;
//
//import ht.reseauquartier.controller.OrganismeTypeDAO;
//import ht.reseauquartier.model.TOrganismeType;
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
//public class OrganismeTypeBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//   private List<SelectItem> availableOrganismeType;
//   
//   public OrganismeTypeBean(){
//    
//       fillOrganismeTypeItems();
//   }
//    public List<SelectItem> getAvailableOrganismeType() {
//        return availableOrganismeType;
//    }
//
//    public void setAvailableOrganismeType(List<SelectItem> availableOrganismeType) {
//        this.availableOrganismeType = availableOrganismeType;
//    }
//
//   
//    private void fillOrganismeTypeItems(){
//       availableOrganismeType =new LinkedList<SelectItem>();
//        OrganismeTypeDAO orgTypeDAO = new  OrganismeTypeDAO();
//      
//      // this.availableOrganismeType.add(new SelectItem("0","---Faire Un Choix-----"));
//        for(TOrganismeType _organismeType : orgTypeDAO.getAll()){
//             SelectItem selectItem = new SelectItem(_organismeType.getOrganismeTypeId(),_organismeType.getOrganismeType());
//              this.availableOrganismeType.add(selectItem);
//             
//             //    this.availableOrganismeType.add(new SelectItem(tblcategorie.getCatID(),tblcategorie.getCategorie()));
//          //   this.availableOrganismeType.add(new SelectItem(tblcategorie.getCatID(),tblcategorie.getCategorie()));
//        }
//        
//    }
//
//    
//     
//}
