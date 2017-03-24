package ht.gouv.faes.sgops.converter;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.BureauDAO;
//import ht.reseauquartier.model.TBureaux;
//import ht.reseauquartier.model.TUserBureaux;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//import javax.persistence.Transient;
//
///**
// *
// * @author chdelmas
// */
//@FacesConverter(value="UserBureauConverter")
//public class UserBureauConverter implements Converter{
//    private TUserBureaux selectedUserBureau;
//    @Transient
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
//       selectedUserBureau = new TUserBureaux();
//       selectedUserBureau =(TUserBureaux)o;
//        TBureaux f = null;
//       int code_bureau = selectedUserBureau.getCodeBureau();
//       f= bureauxDAO.find(code_bureau); ///bureauxDAO.find(code_bureau);
//      //selectedBureau= bureauxDAO.find(code_bureau); ///bureauxDAO.find(code_bureau);
//      
//       return f.getQuartier();
//    }
//}
