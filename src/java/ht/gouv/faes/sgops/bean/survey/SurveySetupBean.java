package ht.gouv.faes.sgops.bean.survey;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.survey;
//
//import ht.reseauquartier.controller.BureauDAO;
//import ht.reseauquartier.controller.SurveyDAO;
//import ht.reseauquartier.controller.SurveyMonthsDAO;
//import ht.reseauquartier.controller.SurveySetupDAO;
//import ht.reseauquartier.controller.SurveyStatutDAO;
//import ht.reseauquartier.gret.bean.dataModel.SurveyDataModel;
//import ht.gouv.faes.util.RecordAction;
//import ht.reseauquartier.model.TBureaux;
//import ht.reseauquartier.model.TSurvey;
//import ht.reseauquartier.model.TSurveyMonths;
//import ht.reseauquartier.model.TSurveySetup;
//import ht.reseauquartier.model.TSurveyStatut;
//import java.io.Serializable;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.logging.Logger;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//import javax.faces.model.SelectItem;
//import javax.persistence.Transient;
//import org.primefaces.context.RequestContext;
//import org.primefaces.event.SelectEvent;
//import org.primefaces.event.TransferEvent;
//import org.primefaces.event.UnselectEvent;
//import org.primefaces.model.DualListModel;
//
// 
///**
// *
// * @author chdelmas
// */
//@ManagedBean
//@ViewScoped
//public class SurveySetupBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//    private static final Logger log = Logger.getLogger(SurveySetupBean.class.getName());
//    private DualListModel<TBureaux> bureaux; 
//    @Transient
//    private SurveySetupDAO surveySetupDAO;
//    private List<TSurveySetup> listSurveySetupOpen;
//    private List<TSurveySetup> listSurveySetupClose;
//    private List<TSurveySetup> listSurveySetup;
//    private TSurveySetup selectedSurveySetup;
//    private TSurveySetup newSurveySetup;
//    private TSurveySetup activeSurveySetup;
//    private int tabActiveIndex=0;
//    private RecordAction action;
//    private String title="Editer Bureau";
//    private boolean collecteOpen;
//    private String mois=null;
//    private int collecteID;
//    private List<SelectItem> moisItems ;
//    private List<SelectItem> statutItems;
//    private List<SelectItem> statutCollecte;
//    //Survey
//     @Transient
//    private SurveyDAO surveyDAO;
//    private SurveyDataModel surveyDataModel = null;
//    private List<TSurvey> listSurvey;
//    private TSurvey selectedSurvey;
//    
//   @Transient
//    SurveyStatutDAO surveyStatutDAO ;
//     @Transient
//    SurveyMonthsDAO surveyMonthsDAO;;
//     //Ggestion des bureau
//     @Transient
//    private BureauDAO bureauDAO ;
//public SurveySetupBean() {
//     
//}
//
//// <editor-fold defaultstate="collapsed" desc="Initialisation des objets dans inti">
//
//@PostConstruct
//public void init(){
//    
//      //Initialisation du Dual List
//      List<TBureaux> source = new ArrayList<TBureaux>();
//      List<TBureaux> target = new ArrayList<TBureaux>();
//      
//    surveySetupDAO=new SurveySetupDAO();
//    selectedSurveySetup = new TSurveySetup();
//    newSurveySetup =   new TSurveySetup();
//    this.activeSurveySetup= new TSurveySetup();
//    listSurveySetup = new ArrayList<TSurveySetup>();
//    listSurveySetupOpen = new ArrayList<TSurveySetup>();
//    moisItems = new LinkedList<SelectItem>();
//    statutItems= new LinkedList<SelectItem>();
//    this.statutCollecte = new LinkedList<SelectItem>();
//    listSurveySetup=surveySetupDAO.getAll();
//   this.collecteOpen  = this.surveySetupDAO.isSurveyOpen();
//     listSurveySetupOpen=surveySetupDAO.getAllSurveySetupOpen();
//     listSurveySetupClose=surveySetupDAO.getAllSurveySetupClose();
//     if(collecteOpen==true){
//         this.activeSurveySetup = this.surveySetupDAO.activeSurveySetup();
//         this.selectedSurveySetup = this.surveySetupDAO.activeSurveySetup();
//         collecteID= this.activeSurveySetup.getSurveySid();
//        action  =  RecordAction.Actualiser;
//     } else {
//         action  =  RecordAction.Nouveau;
//         this.selectedSurveySetup = new TSurveySetup();
//     }
//     // Pour le datatable
//     bureauDAO = new BureauDAO();
//     //Gestion de PickList
//       fillStatutCollecteItems();
//    //Gestion des Survey
//      listSurvey = new ArrayList<TSurvey>();
//      surveyDAO=new SurveyDAO();
//      selectedSurvey = new TSurvey();
//     // listSurvey = surveyDAO.getOpenListSurveys();
//      listSurvey = surveyDAO.getSurveysBy(collecteID) ;
//      
////      if(surveySetupDAO.isSurveyOpen())
////          this.selectedSurveySetup =listSurveySetup.get(0);
////      
//       
//       //Populate the source List<TBureaux>
//      for(TBureaux p : bureauDAO.getSourcePickList(collecteID)){
//                   source.add(p);
//        }
//      
//      for(TBureaux p : bureauDAO.getTargetPickList(collecteID)){
//                  target.add(p);
//        }
//      
//  //DualList bureaux      
//      bureaux = new DualListModel<TBureaux>(source, target);
//
//}
//
//// </editor-fold>
//
//
//
//// <editor-fold defaultstate="collapsed" desc="Initialisation des objets MenuItems">
//
//
//private void fillStatutItems(){
//    surveyStatutDAO = new SurveyStatutDAO();
//     for(TSurveyStatut t : surveyStatutDAO.getAll() ){
//         this.statutItems.add(new SelectItem(t.getSurveyStatutid(),t.getSurveyStatut()));
//    }
//}
//
//private void fillMoisItems(){
//    surveyMonthsDAO = new SurveyMonthsDAO();
//    for(TSurveyMonths t : surveyMonthsDAO.getAll()){
//         this.moisItems.add(new SelectItem(t.getSurveyMonthid(),t.getSurveyMonth()));
//    }
//    
//    
//}
//
//private void fillStatutCollecteItems(){
//     
//         this.statutCollecte.add(new SelectItem(1,"Ouvert"));
//         this.statutCollecte.add(new SelectItem(2,"Fermer"));
//  
//    
//}
//
//// </editor-fold>
//
//
//public void handleStartDateSelect(SelectEvent event) {  
//        FacesContext facesContext = FacesContext.getCurrentInstance();  
//        SimpleDateFormat format = new SimpleDateFormat("yyyy");
//        SimpleDateFormat moisFormat = new SimpleDateFormat("M");
//        int currentMois =Integer.parseInt(moisFormat.format(((Date)event.getObject())));
//        int currentYear =Integer.parseInt(format.format(((Date)event.getObject())));
//        this.selectedSurveySetup.setYears(currentYear);
//        this.selectedSurveySetup.setSurveyMonthid(currentMois);
//        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));  
//    }   
//
//
//// <editor-fold defaultstate="collapsed" desc="Gestion SurveySetup Navigation">
//  
////SurveySetup Navigation    
//public void onRowSurveySetupSelect(SelectEvent event){
//       this.selectedSurveySetup = (TSurveySetup) event.getObject();
//        FacesMessage msg=new FacesMessage("Collecte : ",this.selectedSurveySetup.getSurveySid().toString());
//       FacesContext.getCurrentInstance().addMessage(null, msg);
//       tabActiveIndex=0;
//        action = RecordAction.Actualiser;
//        title="Editer la collecte # : " + this.selectedSurveySetup.getSurveySid().toString();
//       
//    }
//
// 
//public void onRowSurveySetupUnselect(UnselectEvent event) {  
////         this.selectedSurveySetup= (TSurveySetup) event.getObject();
//         FacesMessage msg=new FacesMessage("TSurveySetup UnSelected",this.selectedSurveySetup.getSurveySid().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    //    this.selectedSurveySetup= new TSurveySetup();
//        
//    }
// 
//// </editor-fold>
//
//
// // <editor-fold defaultstate="collapsed" desc="Gestion du DualList">
//    
//
//public void onTransfer(TransferEvent event) {
//            boolean ret=false;
//            TBureaux itemSelect;
//            String info="Bureau";
//          FacesMessage msg = new FacesMessage();
//            if (event.isAdd()){
//                for(Object item : event.getItems() ) {
//                      itemSelect= (TBureaux) item;
//                      info=itemSelect.getDescription();
//                    addIntoSurvey(itemSelect);
//                   }
//                 
//               } else if (event.isRemove()){
//                   for(Object item : event.getItems() ) {
//                          itemSelect= (TBureaux) item;
//                           info=itemSelect.getDescription();
//                    removeFromSurvey(itemSelect);
//                   }
//               }
//         listSurvey = surveyDAO.getSurveysBy(collecteID) ;
// 
//        msg.setSeverity(FacesMessage.SEVERITY_INFO);
//        msg.setSummary("Items Transferred : " );
//        msg.setDetail(info.trim());
//        
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
// 
//// addIntoUserTable((ActivityUserDTO) user); // this add the object to a List
//    private void addIntoSurvey(TBureaux bureau){
//          TSurvey o; boolean ret;
//          o = new TSurvey();
//          o.setCodeBureau(bureau.getCodeBureau());
//          o.setSurveySid(this.activeSurveySetup.getSurveySid());
//          o.setSurveyStatutid(this.activeSurveySetup.getSurveyStatutid());
//           surveyDAO.create(o);
//    }
//   
//    private void removeFromSurvey(TBureaux bureau) {
//         TSurvey o; boolean ret;
//          o = new TSurvey();
//          o.setCodeBureau(bureau.getCodeBureau());
//          o.setSurveyId(this.collecteID);
//          o.setSurveySid(this.activeSurveySetup.getSurveySid());
//          //o.setSurveyStatutid(this.activeSurveySetup.getSurveyStatutid());
//           surveyDAO.removeItem(o);
//    }
//   
//   public void saveSelected(){
//        FacesMessage msg;
//        boolean ret;
//        StringBuilder sb= new StringBuilder();
//          surveyDAO = new SurveyDAO();
//        //Se recupera la lista
//      List<TBureaux> target=this.bureaux.getTarget();
//        try{
//                 saveTargetList(target);
//                // RequestContext.getCurrentInstance().addPartialUpdateTarget("dGrid");
//                 review();
//                msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Enregistrement" , "Avec succes");
//          }
//             catch(Exception ex){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, "Enregistrement", "Echec de sauvegarde" + ex); 
//             }
//         
//         FacesContext.getCurrentInstance().addMessage(null, msg);
//    
//      }
//      
//   
//
//   private boolean saveTargetList(List<TBureaux> target ) {
//       boolean ret=false;
//      TSurvey o;
//         surveyDAO = new SurveyDAO();
//    //   List <TSurvey> lstSurvey = new ArrayList<TSurvey>();
//       for(TBureaux s :target){
//                  o = new TSurvey();
//                  o.setCodeBureau(s.getCodeBureau());
//          
//          o.setSurveySid(this.activeSurveySetup.getSurveySid());
//          o.setSurveyStatutid(this.activeSurveySetup.getSurveyStatutid());
//       
//            ret=surveyDAO.create(o);
//           log.info("Initialisation avec succès");
//       }
//       return ret;
//   }
//   
//   private void review(){
//    List<TBureaux> target= new ArrayList<TBureaux>();
//    List<TBureaux> source = new ArrayList<TBureaux>();
//    //Populate the source List<TBureaux>
//      for(TBureaux p : bureauDAO.getSourcePickList(collecteID)){
//                   source.add(p);
//        }
//      for(TBureaux p : bureauDAO.getTargetPickList(collecteID)){
//                  target.add(p);
//        }
//     listSurvey = surveyDAO.getSurveysBy(collecteID) ;
//     //
//     
//      //populate the target List<TBureaux>
//    bureaux = new DualListModel<TBureaux>(source, target);
//}
//   // </editor-fold>
//  
//   
//   
//   
//   
//public void setAnnee(){
//    Calendar c = Calendar.getInstance();
//         c.setTime(this.selectedSurveySetup.getStartDate());
//         this.selectedSurveySetup.setYears( c.get(Calendar.YEAR));
//}
//
//
// //Survey Navigation
//  public void onRowSurveySelect(SelectEvent event){
//       this.selectedSurvey = (TSurvey) event.getObject();
//        FacesMessage msg=new FacesMessage("TSurvey Selected",this.selectedSurvey.getSurveyId().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//       // tabActiveIndex=0;
//        action = RecordAction.Actualiser;
//        //title="Editer Bureau";
//       
//    }
//  
//    public void onRowSurveyUnselect(UnselectEvent event) {  
////         this.selectedSurvey= (TSurvey) event.getObject();
//         FacesMessage msg=new FacesMessage("TSurvey UnSelected",((TSurvey) event.getObject()).getSurveyId().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    //    this.selectedSurvey= new TSurvey();
//        
//    }
//  
//      // <editor-fold defaultstate="collapsed" desc="Gestion des boutons de commandes de Survey">
//    
//     public void removeSurveyItem() {
//         FacesMessage msg;
//       try{
//             this.surveyDAO.delete(selectedSurvey);
//             this.listSurvey=surveyDAO.getOpenListSurveys();
//            // RequestContext.getCurrentInstance().
//            msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Déselectionner", "Avec succes");
//           }catch(Exception e){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, "Déselectionner", "Echec de sauvegarde");
//         }
//           FacesContext.getCurrentInstance().addMessage(null, msg);
//     }
//     
//     
//      //Close Survey
//     public void closeSurvey(){
//        Calendar c = Calendar.getInstance();
//        FacesMessage msg;
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
//     // </editor-fold>
//     
//     // <editor-fold defaultstate="collapsed" desc="Gestion des boutons de commandes de SurveySetup">
//     
//       
//     //Action 
//    public void saveSurveySetup(){
//           Calendar c = Calendar.getInstance();
//          FacesMessage msg;
//          String actionString="Actualiser / Save ";
//          RequestContext requestContext = RequestContext.getCurrentInstance();
//        boolean ret;
//        
//        try{
//                 msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Pas d'action", "Aucune action");
//            switch(action) {
//                
//                 case Nouveau :{
//                      this.selectedSurveySetup.setSurveyStatutid(1);
//                      this.selectedSurveySetup.setCreeLe(c.getTime());
//                      this.selectedSurveySetup.setActive(1);
//                      this.selectedSurveySetup.setStartDate(c.getTime());
//                      ret=this.surveySetupDAO.create(selectedSurveySetup); 
//                      actionString="Enregistrement de la Collecte";
//                      msg=new FacesMessage(FacesMessage.SEVERITY_INFO, actionString, "Avec succes");
//                       requestContext.update("messages");
//                      break;
//                }
//                case Actualiser :{
//                      actionString="Fermeture de la Collecte # " + String.valueOf(collecteID);
//                       this.selectedSurveySetup.setModifieLe(new Date());
//                       ret=this.surveySetupDAO.update(selectedSurveySetup); 
//                       msg=new FacesMessage(FacesMessage.SEVERITY_INFO, actionString, "Avec succes");
//                    //  requestContext.update("messages");
//                   break;
//                }
//            }
//             this.listSurveySetupOpen = this.surveySetupDAO.getAllSurveySetupOpen();
//             this.listSurveySetup = this.surveySetupDAO.getAll();
//        } catch(Exception e){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, actionString , "Echec de sauvegarde");
//            
//     }
//         FacesContext.getCurrentInstance().addMessage(null, msg);
//    
//  }
// public void nouveauSurveySetup(){
//      FacesMessage msg;
//    selectedSurveySetup = new TSurveySetup();
//    action=RecordAction.Nouveau;
//    this.title = "Saisie d'un B";
//     msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Nouvelle Transaction", "Nouvelle Collecte");
//     FacesContext.getCurrentInstance().addMessage(null, msg);
//}
// 
//     public void closeSurveySetup(){
//          Calendar c = Calendar.getInstance();
//          FacesMessage msg;
//          boolean ret;
//          String outcome ;
//            try{
//            this.selectedSurveySetup.setSurveyStatutid(2);
//            this.selectedSurveySetup.setModifieLe(c.getTime());
//            this.surveySetupDAO.update(this.selectedSurveySetup);
//            this.listSurveySetup = this.surveySetupDAO.getAllSurveySetupOpen();
//            this.collecteOpen = this.surveySetupDAO.isSurveyOpen();
//            msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Fermer", "Avec succes");
//          }catch(Exception e){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, "Fermer", "Echec de sauvegarde");
//         }
//         FacesContext.getCurrentInstance().addMessage(null, msg);
//     }
// 
// // </editor-fold>
//       
//  // <editor-fold defaultstate="collapsed" desc="D'eclaration des getters and setters">
//
//
//      public DualListModel<TBureaux> getBureaux() {
//          return bureaux;
//      }
//
//    public void setBureaux(DualListModel<TBureaux> bureaux) {
//        this.bureaux = bureaux;
//    }
//
//    public SurveySetupDAO getSurveySetupDAO() {
//        return surveySetupDAO;
//    }
//
//    public void setSurveySetupDAO(SurveySetupDAO surveySetupDAO) {
//        this.surveySetupDAO = surveySetupDAO;
//    }
//
//    public List<TSurveySetup> getListSurveySetupOpen() {
//        return listSurveySetupOpen;
//    }
//
//    public void setListSurveySetupOpen(List<TSurveySetup> listSurveySetupOpen) {
//        this.listSurveySetupOpen = listSurveySetupOpen;
//    }
//
//    public List<TSurveySetup> getListSurveySetupClose() {
//        return listSurveySetupClose;
//    }
//
//    public void setListSurveySetupClose(List<TSurveySetup> listSurveySetupClose) {
//        this.listSurveySetupClose = listSurveySetupClose;
//    }
//
//    public List<TSurveySetup> getListSurveySetup() {
//        return listSurveySetup;
//    }
//
//    public void setListSurveySetup(List<TSurveySetup> listSurveySetup) {
//        this.listSurveySetup = listSurveySetup;
//    }
//
//    public TSurveySetup getSelectedSurveySetup() {
//        return selectedSurveySetup;
//    }
//
//    public void setSelectedSurveySetup(TSurveySetup selectedSurveySetup) {
//        this.selectedSurveySetup = selectedSurveySetup;
//    }
//
//    public TSurveySetup getNewSurveySetup() {
//        return newSurveySetup;
//    }
//
//    public void setNewSurveySetup(TSurveySetup newSurveySetup) {
//        this.newSurveySetup = newSurveySetup;
//    }
//
//    public TSurveySetup getActiveSurveySetup() {
//        return activeSurveySetup;
//    }
//
//    public void setActiveSurveySetup(TSurveySetup activeSurveySetup) {
//        this.activeSurveySetup = activeSurveySetup;
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
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
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
//    public String getMois() {
//        return mois;
//    }
//
//    public void setMois(String mois) {
//        this.mois = mois;
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
//    public List<SelectItem> getMoisItems() {
//        return moisItems;
//    }
//
//    public void setMoisItems(List<SelectItem> moisItems) {
//        this.moisItems = moisItems;
//    }
//
//    public List<SelectItem> getStatutItems() {
//        return statutItems;
//    }
//
//    public void setStatutItems(List<SelectItem> statutItems) {
//        this.statutItems = statutItems;
//    }
//
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
//    public BureauDAO getBureauDAO() {
//        return bureauDAO;
//    }
//
//    public void setBureauDAO(BureauDAO bureauDAO) {
//        this.bureauDAO = bureauDAO;
//    }
//
//    
//    public List<SelectItem> getStatutCollecte() {
//        return statutCollecte;
//    }
//
//    public void setStatutCollecte(List<SelectItem> statutCollecte) {
//        this.statutCollecte = statutCollecte;
//    }
//    
//    
//    
//    
// 
//
//    public SurveyStatutDAO getSurveyStatutDAO() {
//        return surveyStatutDAO;
//    }
//
//    public void setSurveyStatutDAO(SurveyStatutDAO surveyStatutDAO) {
//        this.surveyStatutDAO = surveyStatutDAO;
//    }
//
//    public SurveyMonthsDAO getSurveyMonthsDAO() {
//        return surveyMonthsDAO;
//    }
//
//    public void setSurveyMonthsDAO(SurveyMonthsDAO surveyMonthsDAO) {
//        this.surveyMonthsDAO = surveyMonthsDAO;
//    }
//    // </editor-fold>     
//}