package ht.gouv.faes.sgops.converter;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.converter;
//
//import ht.reseauquartier.controller.DataLayersDAO;
//import ht.reseauquartier.model.TDataLayers;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
///**
// *
// * @author chdelmas
// */
//@FacesConverter(value="DataLayer")
//public class DataLayer implements Converter {
//DataLayersDAO dataLayersDAO = new DataLayersDAO();
//    @Override
//    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
//        if (string == null || string.length() == 0) {
//             return null;
//         }
//            TDataLayers dtLayer = dataLayersDAO.find(  Integer.parseInt(string));
//            return dtLayer;
//    }
//
//    @Override
//    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
//         TDataLayers dtLayer = dataLayersDAO.find(((Integer)o));
//          return  dtLayer.getDataLayerID().toString()  ;
//    }
//    
//}
