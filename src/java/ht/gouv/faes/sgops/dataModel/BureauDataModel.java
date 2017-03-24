package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
//import ht.reseauquartier.model.TBureaux;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author Hubert
// */
//@SuppressWarnings("unchecked")
//public class BureauDataModel extends ListDataModel<TBureaux> implements SelectableDataModel<TBureaux>{
//    public BureauDataModel(){
//    }
//    public BureauDataModel(List<TBureaux> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TBureaux bureau)
//    {
//    return bureau.getCodeBureau();
//    }
//
//    @Override
//    public TBureaux getRowData(String string) {
//       List<TBureaux>  bureauList=(List<TBureaux>)this.getWrappedData();
//       TBureaux find =null;
//    for(TBureaux bureau:bureauList){
//        if(bureau.getCodeBureau().equals(Integer.parseInt(string))){
//            find=bureau;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//}
