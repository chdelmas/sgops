package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
//
//import ht.reseauquartier.model.TBloc;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author Hubert
// */
//public class BlocDataModel extends ListDataModel<TBloc> implements SelectableDataModel<TBloc>{
//    public BlocDataModel(){
//    }
//    public BlocDataModel(List<TBloc> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TBloc bloc)
//    {
//    return bloc.getCodeBloc();
//    }
//
//    @Override
//    public TBloc getRowData(String string) {
//       List<TBloc>  blocList=(List<TBloc>)this.getWrappedData();
//       TBloc find =null;
//    for(TBloc bloc:blocList){
//        if(bloc.getCodeBloc().equals(Integer.parseInt(string))){
//            find=bloc;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//    
//}
