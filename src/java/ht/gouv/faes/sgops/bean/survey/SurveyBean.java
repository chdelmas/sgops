package ht.gouv.faes.sgops.bean.survey;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.survey;
//
//import ht.reseauquartier.controller.SurveyDAO;
//import ht.reseauquartier.gret.bean.dataModel.SurveyDataModel;
//import ht.gouv.faes.util.RecordAction;
//import ht.reseauquartier.model.TSurvey;
//import java.io.Serializable;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import java.util.logging.Logger;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//import org.primefaces.event.SelectEvent;
//import org.primefaces.event.UnselectEvent;
//
///**
// *  
// * @author chdelmas
// */
//@ManagedBean
//@ViewScoped
//public class SurveyBean implements Serializable {
//    private static final long serialVersionUID = 1L; 
//    private static final Logger log = Logger.getLogger(SurveyBean.class.getName());
//  
//    private SurveyDAO surveyDAO;
//    private SurveyDataModel surveyDataModel = null;
//    private List<TSurvey> listSurvey;
//    private TSurvey selectedSurvey;
//    private int tabActiveIndex=0;
//    private RecordAction action;
//    private boolean collecteOpen;
//    private int collecteID;
//   
//   
//      
//  
//public SurveyBean() {
//     
//}
//@PostConstruct
//public void init(){
//      listSurvey = new ArrayList<TSurvey>();
//      surveyDAO=new SurveyDAO();
//      selectedSurvey = new TSurvey();
//      listSurvey = surveyDAO.getOpenListSurveys();
// 
//}
//
//
//
//    public void onRowSurveySelect(SelectEvent event){
//       this.selectedSurvey= (TSurvey) event.getObject();
//        FacesMessage msg=new FacesMessage("TSurvey Selected",this.selectedSurvey.getSurveyId().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//        tabActiveIndex=0;
//        action = RecordAction.Actualiser;
//        //title="Editer Bureau";
//       
//    }
//   public void onRowSurveyUnselect(UnselectEvent event) {  
////         this.selectedSurvey= (TSurvey) event.getObject();
//         FacesMessage msg=new FacesMessage("TSurvey UnSelected",((TSurvey) event.getObject()).getSurveyId().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    //    this.selectedSurvey= new TSurvey();
//        
//    }
// 
//public void handleStartDateSelect(SelectEvent event) {  
//        FacesContext facesContext = FacesContext.getCurrentInstance();  
//        SimpleDateFormat format = new SimpleDateFormat("yyyy");
//        SimpleDateFormat moisFormat = new SimpleDateFormat("M");
//        int currentMois =Integer.parseInt(moisFormat.format(((Date)event.getObject())));
//        int currentYear =Integer.parseInt(format.format(((Date)event.getObject())));
// 
//    }   
//
//   
//    //Settters / Getters
////public void setAnnee(){
////    Calendar c = Calendar.getInstance();
////         c.setTime(this.selectedSurvey.getStartDate());
////         this.selectedSurvey.setYears( c.get(Calendar.YEAR));
////}
//
////Action 
//    public void save(){
//          FacesMessage msg;
//        boolean ret;
//        String outcome ;
//        try{
//            ret=this.surveyDAO.create(selectedSurvey);
//           // this.listSurvey = this.surveyDAO.getAll();
//            msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Enregistrement", "Avec succes");
//          }catch(Exception e){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, "Enregistrement", "Echec de sauvegarde");
//            
//     }
//         FacesContext.getCurrentInstance().addMessage(null, msg);
//    
//  }
// public void newBureau(){
//    selectedSurvey = new TSurvey();
//    action=RecordAction.Nouveau;
//    //this.title = "Saisie Bureau";
//}
//
//    
//
//       public void closeSurvey(){
//           Calendar c = Calendar.getInstance();
//            FacesMessage msg;
//        boolean ret;
//        String outcome ;
//        try{
//          
//            this.selectedSurvey.setSurveyStatutid(2);
//            this.selectedSurvey.setModifieLe(c.getTime());
////            this.surveySetupDAO.update(this.selectedSurvey);
////            this.listSurveySetup = this.surveySetupDAO.getAll();
////            this.collecteOpen = this.surveySetupDAO.isSurveyOpen();
//            msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Fermer", "Avec succes");
//          }catch(Exception e){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, "Fermer", "Echec de sauvegarde");
//            
//     }
//         FacesContext.getCurrentInstance().addMessage(null, msg);
//     }
//
//  
//
//   
//   public void removeItem() {
//         FacesMessage msg;
//      
//      
// try{
//          this.surveyDAO.delete(selectedSurvey);
//          this.listSurvey=surveyDAO.getOpenListSurveys();
//         // RequestContext.getCurrentInstance().
//            msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Déselectionner", "Avec succes");
//          }catch(Exception e){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, "Déselectionner", "Echec de sauvegarde");
//            
//     }
//         FacesContext.getCurrentInstance().addMessage(null, msg);
//     }
//
//    //getters and setters
//    public SurveyDAO getSurveyDAO() {
//        return surveyDAO;
//    }
//
//    public void setSurveyDAO(SurveyDAO surveyDAO) {
//        this.surveyDAO = surveyDAO;
//    }
//
//    public SurveyDataModel getSurveyDataModel() {
//        return surveyDataModel;
//    }
//
//    public void setSurveyDataModel(SurveyDataModel surveyDataModel) {
//        this.surveyDataModel = surveyDataModel;
//    }
//
//    public List<TSurvey> getListSurvey() {
//        return listSurvey;
//    }
//
//    public void setListSurvey(List<TSurvey> listSurvey) {
//        this.listSurvey = listSurvey;
//    }
//
//    public TSurvey getSelectedSurvey() {
//        return selectedSurvey;
//    }
//
//    public void setSelectedSurvey(TSurvey selectedSurvey) {
//        this.selectedSurvey = selectedSurvey;
//    }
//
//    public int getTabActiveIndex() {
//        return tabActiveIndex;
//    }
//
//    public void setTabActiveIndex(int tabActiveIndex) {
//        this.tabActiveIndex = tabActiveIndex;
//    }
//
//    public RecordAction getAction() {
//        return action;
//    }
//
//    public void setAction(RecordAction action) {
//        this.action = action;
//    }
//
//    public boolean isCollecteOpen() {
//        return collecteOpen;
//    }
//
//    public void setCollecteOpen(boolean collecteOpen) {
//        this.collecteOpen = collecteOpen;
//    }
//
//    public int getCollecteID() {
//        return collecteID;
//    }
//
//    public void setCollecteID(int collecteID) {
//        this.collecteID = collecteID;
//    }
//    
//   
//}