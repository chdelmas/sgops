package ht.gouv.faes.sgops.converter;

/////*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.BureauDAO;
//import ht.reseauquartier.model.TBureaux;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
///**
// *
// * @author chdelmas
// */
//@FacesConverter(value="BureauCode")
//public class BureauCode implements Converter {
//  private TBureaux selectedBureau;
//    private BureauDAO bureauxDAO = new BureauDAO();
//    @Override
//    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
//        if(string.isEmpty()){
//               return null;
//                        }
//         
//       return  bureauxDAO.find(Integer.parseInt(string)).getQuartier();
//    }
//
//    @Override
//    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
//      selectedBureau = new TBureaux();
//      int code_bureau = (Integer)o;
//      selectedBureau= bureauxDAO.find(code_bureau); ///bureauxDAO.find(code_bureau);
//       return selectedBureau.getQuartier();
//    }
//    
//}
