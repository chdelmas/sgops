/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.bean.bloc;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author Hubert
 */
@ManagedBean
@ViewScoped
public class BlocBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//    private BlocDAO blocDAO;
//    private List<TBloc> listBloc;
//    private TBloc selectedBloc;
//    private BlocDataModel blocDataModel;
//    private List<SelectItem> blocItems;
//    
//    private DepartementsDAO departementsDAO;
//    private CommunesDAO communesDAO;
//  
//   //
//    private List<TDepartements> listDepartements;
//    private List<SelectItem> departementItems;
//    private List<TCommunes> listCommunes;
//    private List<SelectItem> communeItems; 
//    private int tabActiveIndex=0;
// private static final Logger log = Logger.getLogger(UtilisateurBean.class.getName());
//    public BlocBean() {
//       
//    }
//
//  @PostConstruct
//public void init(){
//    blocDAO=new BlocDAO();
//        listBloc = new ArrayList<TBloc>();
//        listBloc=blocDAO.getAll();
//        selectedBloc = new TBloc();
//        blocDataModel= new BlocDataModel(listBloc);
//        //DAO
//        departementsDAO= new DepartementsDAO();
//        communesDAO = new CommunesDAO();
//        //Test
////        departementBean = new DepartementBean();
////        communesBean = new CommuneBean();
//        fillBlocItems();
//       fillDepartementsItems();
//       fillCommunesItems();
//} 
//    
//    
//    private void fillBlocItems(){
//       blocItems =new LinkedList<SelectItem>();
//          blocItems.add(new SelectItem(null,"Select"));
//        for(TBloc o : this.listBloc){
//             SelectItem  selectItem = new SelectItem(o.getCodeBloc(),o.getBlocAdmin());
//              this.blocItems.add(selectItem);
//        }
//        
//    }  
//    
//   private void fillDepartementsItems(){
//       departementItems =new LinkedList<SelectItem>();
//        listDepartements = departementsDAO.getAll();
//         this.departementItems.add(new SelectItem(null," Selectionner un departement"));
//        for(TDepartements o : listDepartements){
//              SelectItem selectItem = new SelectItem(o.getIddep(),o.getDepartement());
//             this.departementItems.add(selectItem);
//        }
//        
//    }
//     
//  private void fillCommunesItems(){
//       communeItems =new LinkedList<SelectItem>();
//          listCommunes=   refillCommunesList(this.selectedBloc);
//        this.communeItems.add(new SelectItem(null,"---Faire Un Choix"));
//        for(TCommunes o : listCommunes){
//              SelectItem selectItem = new SelectItem(o.getIDCom(),o.getCommune());
//             this.communeItems.add(selectItem);
//        }
//       
//        
//    }
//
//     private  List<TCommunes> refillCommunesList(TBloc _bloc){
//         return communesDAO.getAll(_bloc);
//     }
//      
//
//   
//     // Manage Event
//    public void onRowSelect(SelectEvent event) {  
//        this.selectedBloc =(TBloc) event.getObject();
//        FacesMessage msg=new FacesMessage("Bloc  ",((TBloc) event.getObject()).getBlocAdmin()+ " Selectionné" );
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//          tabActiveIndex=1;
//    }
//   public void onRowUnselect(UnselectEvent event){
//           //this.selectedBloc =((TBloc) event.getObject());
//       FacesMessage msg=new FacesMessage("Bloc ",((TBloc) event.getObject()).getBlocAdmin() + " désélectionné");
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
//
//  
//  //Méthode  
//    public String create(){
//        FacesMessage msg;
//        boolean ret;
//        String outcome ;
//        try{
//            ret=blocDAO.create(selectedBloc);
//            msg=new FacesMessage(FacesMessage.SEVERITY_INFO, "Enregistrement", "Avec succes");
//            outcome="/app/app_blocs?faces-redirect=true&amp;includeViewParams=true";
//            }catch(Exception e){
//                msg=new FacesMessage(FacesMessage.SEVERITY_WARN, "Enregistrement", "Echec de sauvegarde");
//            outcome="error?faces-redirect=true&amp;includeViewParams=true";
//     }
//         FacesContext.getCurrentInstance().addMessage(null, msg);
//    return outcome;
//
//}
//private void saveUserEvent(TBloc bloc){
//          bloc.setCreePar(ActiveUtils.getActiveUsername());
//          bloc.setCreeLe(DateUtils.getDateTime());      
// }
//
//private void updateUserEvent(TBloc bloc){
////      Calendar cal;   cal = Calendar.getInstance();
//      bloc.setModifiePar(ActiveUtils.getActiveUsername());
//      bloc.setModifieLe(DateUtils.getDateTime());      
//}
////08-02-2013 , status =1 
// public void update( ) {
//     
//      FacesMessage message;
//      boolean ret; 
//      String outcome;
//       Calendar cal;
//        cal = Calendar.getInstance();
//        try{
//             saveUserEvent(this.selectedBloc);
//              blocDAO.update(this.selectedBloc);
//               message= new FacesMessage(FacesMessage.SEVERITY_INFO, "Modifier", "Avec succes");
//             
//         } 
//         catch(Exception ex){
//              message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Modification", "Echec de Modification");
//              //outcome = "error?faces-redirect=true&amp;includeViewParams=true";
//         }
//             FacesContext.getCurrentInstance().addMessage(null,message);
//        //return outcome;
//    }
//   
//  
////getters and setters
//
//    public BlocDAO getBlocDAO() {
//        return blocDAO;
//    }
//
//    public void setBlocDAO(BlocDAO blocDAO) {
//        this.blocDAO = blocDAO;
//    }
//
//    public List<TBloc> getListBloc() {
//        return listBloc;
//    }
//
//    public void setListBloc(List<TBloc> listBloc) {
//        this.listBloc = listBloc;
//    }
//
//    public TBloc getSelectedBloc() {
//        return selectedBloc;
//    }
//
//    public void setSelectedBloc(TBloc selectedBloc) {
//        this.selectedBloc = selectedBloc;
//    }
//
//    public BlocDataModel getBlocDataModel() {
//        return blocDataModel;
//    }
//
//    public void setBlocDataModel(BlocDataModel blocDataModel) {
//        this.blocDataModel = blocDataModel;
//    }
//
//    public List<SelectItem> getBlocItems() {
//        return blocItems;
//    }
//
//    public void setBlocItems(List<SelectItem> blocItems) {
//        this.blocItems = blocItems;
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
//    //Gestion Departements Items et Communes Items
//
//    public DepartementsDAO getDepartementsDAO() {
//        return departementsDAO;
//    }
//
//    public void setDepartementsDAO(DepartementsDAO departementsDAO) {
//        this.departementsDAO = departementsDAO;
//    }
//
//    public CommunesDAO getCommunesDAO() {
//        return communesDAO;
//    }
//
//    public void setCommunesDAO(CommunesDAO communesDAO) {
//        this.communesDAO = communesDAO;
//    }
//
// 
//    public List<TDepartements> getListDepartements() {
//        return listDepartements;
//    }
//
//    public void setListDepartements(List<TDepartements> listDepartements) {
//        this.listDepartements = listDepartements;
//    }
//
//    public List<SelectItem> getDepartementItems() {
//        return departementItems;
//    }
//
//    public void setDepartementItems(List<SelectItem> departementItems) {
//        this.departementItems = departementItems;
//    }
//
//    public List<TCommunes> getListCommunes() {
//        return listCommunes;
//    }
//
//    public void setListCommunes(List<TCommunes> listCommunes) {
//        this.listCommunes = listCommunes;
//    }
//
//    public List<SelectItem> getCommuneItems() {
//        return communeItems;
//    }
//
//    public void setCommuneItems(List<SelectItem> communeItems) {
//        this.communeItems = communeItems;
//    }
//    
//    
//    
//    //AjaxBehaviorEvent event
//public void handleDepartementChange() {
//            //this.listCommunes.clear();
//	    this.fillCommunesItems();
//            
//    }
//  

}

