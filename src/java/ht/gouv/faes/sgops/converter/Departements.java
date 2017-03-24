package ht.gouv.faes.sgops.converter;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.DepartementsDAO;
//import ht.reseauquartier.model.TDepartements;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
///**
// *
// * @author chdelmas
// */
//@FacesConverter(value="Departements")
//public class Departements implements Converter{
// 
//    private DepartementsDAO departementDAO = new DepartementsDAO();
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
//        TDepartements selectedDepartement;
//         selectedDepartement = new TDepartements();
//         int code_departement = (Integer)o;
//          selectedDepartement = departementDAO.find(code_departement);
//        return  selectedDepartement.getDepartement();
//    
//    }
//    
//}
