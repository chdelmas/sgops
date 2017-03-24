package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
// 
//import ht.reseauquartier.model.TDataLayers;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author Hubert
// */
//public class DatalayersDataModel extends ListDataModel<TDataLayers> implements SelectableDataModel<TDataLayers>{
//    public DatalayersDataModel(){
//    }
//    public DatalayersDataModel(List<TDataLayers> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TDataLayers datalayers)
//    {
//    return datalayers.getDataLayerID();
//    }
//
//    @Override
//    public TDataLayers getRowData(String string) {
//       List<TDataLayers>  blocList=(List<TDataLayers>)this.getWrappedData();
//       TDataLayers find =null;
//    for(TDataLayers datalayers:blocList){
//        if(datalayers.getDataLayerID().equals(Integer.parseInt(string))){
//            find=datalayers;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//    
//}
