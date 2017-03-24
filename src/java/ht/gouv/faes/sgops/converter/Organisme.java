package ht.gouv.faes.sgops.converter;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.OrganismesDAO;
//import ht.reseauquartier.model.TOrganismes;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
///**
// *
// * @author chdelmas
// */
//
//@FacesConverter(value="Organisme")
//public class Organisme implements Converter{
//    private TOrganismes selectedOrganisme;
//    private OrganismesDAO organismesDAO = new OrganismesDAO();
//    @Override
//    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
//        if(string.isEmpty()){
//               return null;
//                        }
//       return null;
//    }
//
//    @Override
//    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
//         selectedOrganisme = new TOrganismes();
//      int code_organisme = (Integer)o;
//         
//           selectedOrganisme= organismesDAO.find(code_organisme);
//           return selectedOrganisme.getSigle();//code_organisme ;//organismesDAO.find(code_organisme).getSigle();
//        //return selectedOrganisme.getSigle();//String.valueOf(((Classification) value).getId());
//    }
//    
//}
