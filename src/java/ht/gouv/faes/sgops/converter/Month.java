package ht.gouv.faes.sgops.converter;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.SurveyMonthsDAO;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
///**
// *
// * @author chdelmas
// */
//@FacesConverter(value="Month")
//public class Month implements Converter{
//   SurveyMonthsDAO oc = new SurveyMonthsDAO();
//  @Override
//    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
//        if(string.isEmpty()){
//               return null;
//                        }
//         return (String) (oc.find(Integer.parseInt(string))).getSurveyMonth();
//    }
//
//    @Override
//    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
//         int c= (Integer)o;
//         if (c !=0) {
//            return oc.find(c).getSurveyMonth();
//        }  else {
//             return "aucun";
//         }
//                 
//    }
//}