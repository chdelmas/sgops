package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
//import ht.reseauquartier.model.TUtilisateurs;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author chdelmas
// */
// 
//public class UtilisateurDataModel extends ListDataModel<TUtilisateurs> implements SelectableDataModel<TUtilisateurs> {
//     public UtilisateurDataModel() {
//    }
//
//    public UtilisateurDataModel(List<TUtilisateurs> data) {
//        super(data);
//    }
//    
//    @Override
//    public TUtilisateurs getRowData(String rowKey) {
//      List<TUtilisateurs>  ListUtilisateurs=  (List<TUtilisateurs>)this.getWrappedData();
//       for(TUtilisateurs utilisateur : ListUtilisateurs) {
//            if(utilisateur.getUsername().equals(rowKey)) {
//                return utilisateur;
//            }
//        }
//       return null;
//    }
//
//   @Override
//   public Object getRowKey(TUtilisateurs utilisateur) {
//        return utilisateur.getUserId();
//    }
//}
//                    
