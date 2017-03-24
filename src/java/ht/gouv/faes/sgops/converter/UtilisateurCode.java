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
//@FacesConverter(value="UtilisateurCode")
//public class UtilisateurCode implements Converter{
//    private TUtilisateurs selectedUtilisateur;
//    private UtilisateurDAO uDAO = new UtilisateurDAO();
//    @Override
//    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
//        if(string.isEmpty()){
//               return null;
//                        }
//        return uDAO.find(string);
//       
//    }
//
//    @Override
//    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
////        
////        if ((o == null) || o.equals("")) {
////            return "";
////        } else {
////            
////        int id = Integer.parseInt(o.toString());
////        return uDAO.find(id).getUsername();   
//         return ((TUtilisateurs)o).getUsername();
//    
//  }
//}