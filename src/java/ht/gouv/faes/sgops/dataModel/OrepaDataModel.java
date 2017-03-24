package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
// 
//import ht.reseauquartier.model.TOrepa;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author Hubert
// */
//@SuppressWarnings("unchecked")
//public class OrepaDataModel extends ListDataModel<TOrepa> implements SelectableDataModel<TOrepa>{
//    public OrepaDataModel(){
//    }
//    public OrepaDataModel(List<TOrepa> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TOrepa orepa)
//    {
//    return orepa.getCteId();
//    }
//
//    @Override
//    public TOrepa getRowData(String string) {
//       List<TOrepa>  orepaList=(List<TOrepa>)this.getWrappedData();
//       TOrepa find =null;
//    for(TOrepa orepa:orepaList){
//        if(orepa.getCteId().equals(Integer.parseInt(string))){
//            find=orepa;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//}
