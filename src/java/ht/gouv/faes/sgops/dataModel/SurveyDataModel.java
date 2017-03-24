package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
//import ht.reseauquartier.model.TSurvey;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author chdelmas
// */
//public class SurveyDataModel extends ListDataModel<TSurvey> implements SelectableDataModel<TSurvey>{
//    public SurveyDataModel(){
//    }
//    public SurveyDataModel(List<TSurvey> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TSurvey o)
//    {
//    return o.getSurveyId();
//    }
//
//    @Override
//    public TSurvey getRowData(String string) {
//       List<TSurvey>  oList=(List<TSurvey>)this.getWrappedData();
//       TSurvey find =null;
//    for(TSurvey bloc:oList){
//        if(bloc.getSurveyId().equals(Integer.parseInt(string))){
//            find=bloc;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//    
//}
