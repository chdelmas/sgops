package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
//import ht.reseauquartier.model.TFontaines;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author Hubert
// */
//public class FontainesDataModel extends ListDataModel<TFontaines> implements SelectableDataModel<TFontaines>{
//    public FontainesDataModel(){
//    }
//    public FontainesDataModel(List<TFontaines> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TFontaines fontaines)
//    {
//    return fontaines.getCodeFontaine();
//    }
//
//    @Override
//    public TFontaines getRowData(String string) {
//       List<TFontaines>  fontainesList=(List<TFontaines>)this.getWrappedData();
//       TFontaines find =null;
//    for(TFontaines fontaines:fontainesList){
//        if(fontaines.getCodeFontaine().equals(Integer.parseInt(string))){
//            find=fontaines;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//    
//}
