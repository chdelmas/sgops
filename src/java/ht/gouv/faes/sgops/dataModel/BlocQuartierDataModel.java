package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
//import ht.reseauquartier.model.TBlocQuartiers;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author chdelmas
// */
//public class BlocQuartierDataModel extends ListDataModel<TBlocQuartiers> implements SelectableDataModel<TBlocQuartiers>{
//    public BlocQuartierDataModel(){
//    }
//    public BlocQuartierDataModel(List<TBlocQuartiers> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TBlocQuartiers bloc)
//    {
//    return bloc.getCodeBloc();
//    }
//
//    @Override
//    public TBlocQuartiers getRowData(String string) {
//       List<TBlocQuartiers>  blocList=(List<TBlocQuartiers>)this.getWrappedData();
//       TBlocQuartiers find =null;
//    for(TBlocQuartiers bloc:blocList){
//      if(bloc.getCodeQuartier().equals(Integer.parseInt(string))){
//            find=bloc;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//    
//}
