package ht.gouv.faes.sgops.converter;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.UtilisateurDAO;
//import ht.reseauquartier.model.TUtilisateurs;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
///**
// *
// * @author chdelmas
// */
//@FacesConverter(value="UtilisateurConverter")
//public class UtilisateurConverter implements Converter{
//    private TUtilisateurs selectedUtilisateur;
//    private UtilisateurDAO uDAO = new UtilisateurDAO();
//    @Override
//    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
//        if(string.isEmpty()){
//               return null;
//                        }
//        return uDAO.find(string).getUsername();
//       
//    }
//
//    @Override
//    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
//        
//        if ((o == null) || o.equals("")) {
//            return "";
//        } else {
//            int i = Integer.parseInt(o.toString());
//             
//            return uDAO.find(i).getUsername();
//        }
//        
////        int id = Integer.parseInt(o.toString());
////        TUtilisateurs toFind=new TUtilisateurs();
////       toFind.setUserId(id);
////       
////       selectedUtilisateur= uDAO.find(toFind);
////           return this.selectedUtilisateur.toString() ;//selectedUtilisateur.getUsername();//code_organisme ;//organismesDAO.find(code_organisme).getSigle();
////        //return selectedOrganisme.getSigle();//String.valueOf(((Classification) value).getId());
//    }
//    
//}
