package ht.gouv.faes.sgops.converter;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.CommunesDAO;
//import ht.reseauquartier.model.TCommunes;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
///**
// *
// * @author chdelmas
// */
//@FacesConverter(value="Communes")
//public class Communes implements Converter{
//    private TCommunes selectedCommune;
//    private CommunesDAO communesDAO = new CommunesDAO();
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
//         selectedCommune = new TCommunes();
//      int code_commune = (Integer)o;
//         
//           selectedCommune= communesDAO.find(code_commune);
//           return selectedCommune.getCommune();//code_organisme ;//organismesDAO.find(code_organisme).getSigle();
//        //return selectedOrganisme.getSigle();//String.valueOf(((Classification) value).getId());
//    }
//    
//}
