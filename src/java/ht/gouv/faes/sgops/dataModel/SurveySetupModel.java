package ht.gouv.faes.sgops.dataModel;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.dataModel;
//
//import ht.reseauquartier.model.TSurveySetup;
//import java.util.List;
//import javax.faces.model.ListDataModel;
//import org.primefaces.model.SelectableDataModel;
//
///**
// *
// * @author chdelmas
// */
//public class SurveySetupModel extends ListDataModel<TSurveySetup> implements SelectableDataModel<TSurveySetup>{
//    public SurveySetupModel(){
//    }
//    public SurveySetupModel(List<TSurveySetup> data){
//    super(data);
//    }
//    
//
//    
//    @Override
//    public Object getRowKey(TSurveySetup o)
//    {
//    return o.getSurveySid();
//    }
//
//    @Override
//    public TSurveySetup getRowData(String string) {
//       List<TSurveySetup>  oList=(List<TSurveySetup>)this.getWrappedData();
//       TSurveySetup find =null;
//    for(TSurveySetup bloc:oList){
//        if(bloc.getSurveySid().equals(Integer.parseInt(string))){
//            find=bloc;
//       } 
//      } // fin foreach
//         return find; 
//    }
//    
//    
//}
