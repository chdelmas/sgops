package ht.gouv.faes.sgops.bean.survey;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package ht.reseauquartier.gret.bean.survey;
//
//import ht.reseauquartier.controller.UserBureauxDAO;
//import ht.reseauquartier.controller.BureauDAO;
//import ht.reseauquartier.controller.FontainesDAO;
//import ht.reseauquartier.controller.UtilisateurDAO;
//import ht.reseauquartier.model.TBureaux;
//import ht.reseauquartier.model.TFontaines;
//import ht.reseauquartier.model.TUserBureaux;
//import ht.reseauquartier.model.TUtilisateurs;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Logger;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//import javax.faces.event.AjaxBehaviorEvent;
//import javax.faces.model.SelectItem;
//import javax.persistence.Transient;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import org.primefaces.event.SelectEvent;
//import org.primefaces.event.TransferEvent;
//import org.primefaces.model.DefaultTreeNode;
//import org.primefaces.model.DualListModel;
//import org.primefaces.model.TreeNode;
//import org.primefaces.model.mindmap.DefaultMindmapNode;
//import org.primefaces.model.mindmap.MindmapNode;
//
///**
// *
// * @author chdelmas
// */
//@ManagedBean
//@ViewScoped
//public class AssignationBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//    private static final Logger log = Logger.getLogger(AssignationBean.class.getName());
//     @Transient
//    private BureauDAO bDAO ;
//      @Transient
//    private UtilisateurDAO uDAO ;
//     @Transient
//    private UserBureauxDAO aDAO;
//    private TUtilisateurs selectedUtilisateur ;
//    private TUtilisateurs connectedUser;
//    private List<TUserBureaux> listUserBureaux;
//    private List<TUtilisateurs> listUtilisateurs ;  
//    
//    private TBureaux selectedItemBureauAssigne;
//    private TFontaines selectedItemFontaineAssigne;
//    private TFontaines selectedFontaines; 
//    //private LoginBean loginBean = new LoginBean();
//     //Liste la liste de Bureaux assignes a l' utilisateur encours
//    protected  List<TBureaux> listBureauxAssignes;
//    protected  List<TFontaines> listFontainesAssignes;
////    @Transient
////    LoginBean loginBean = new LoginBean();
//    // private TBureaux selectedBureau ;
//    //private TBureaux[] selectedBureaux ;
//    private List<TBureaux>   listBureaux ;  
//    private List<SelectItem> utilisateursItems ;
//    private List<SelectItem> bureauxItems;    
//    private List<SelectItem> bureauxAssignesItems;    
//    private List<SelectItem> fontainesAssignesItems; 
//    private DualListModel<TBureaux> bureaux;
// 
//    private boolean desactive;
//    //User
//    private TreeNode rootUser;
//    private TreeNode selectedNodesUser;
//    private List<Object> listNodes;
//    //MindMap
//    private MindmapNode root;  
//    private Map<String, TUtilisateurs> hashMap = new HashMap<String, TUtilisateurs>();
//    private MindmapNode selectedNode;  
//      
//      public AssignationBean(){
//         
//               
//     
//      }
//    
//
//// <editor-fold defaultstate="collapsed" desc="Initialisation des objets dans inti">
//
//@PostConstruct
//public void init(){
//       //Initialisation du Dual List//DualList
//           List<TBureaux> source = new ArrayList<TBureaux>();
//	   List<TBureaux> target = new ArrayList<TBureaux>();
//           listBureauxAssignes = new ArrayList<TBureaux>();
//           listUserBureaux = new ArrayList<TUserBureaux>();
//           connectedUser = new TUtilisateurs();
//           root = new DefaultMindmapNode("Animateur(s)", "Réseau Quartier", "FFCC00", false);  
//           //SectedItems Manipulations
//           this.fontainesAssignesItems=new LinkedList<SelectItem>();
//           this.utilisateursItems= new ArrayList<SelectItem>();
//           bureauxAssignesItems= new LinkedList<SelectItem>();
//           
//           this.selectedUtilisateur = new TUtilisateurs();
//           aDAO = new UserBureauxDAO();
//           selectedItemBureauAssigne = new TBureaux();
//           
//           
//           listUtilisateurs = new ArrayList<TUtilisateurs>();   
//           selectedFontaines = new TFontaines();
//            fillUtilisateursItems();
//       // 
//             rootUser = new DefaultTreeNode("Utilisateur(s)", null);
//             
//             for(TBureaux b:(new UserBureauxDAO()).getListBureauxNonAssigner()){
//                    source.add(b);
//                }
//              //DataGrid UserBureaux
//             listUserBureaux =(new UserBureauxDAO()).getAll();
//             
//            bureaux = new DualListModel<TBureaux>(source, target);     
//     
//      desactive=true;
//      MindDisplay();
//      // String username="chdelmas"; //ReadCookie("username");
//         String username= ReadCookie("username");
//      fillListBureauxAssignes(username);     
//      if (!username.isEmpty()){
//         TreeNode  nodeUser = new DefaultTreeNode(username, rootUser);
//                    fillNodeListBureauxAssignes(username,nodeUser);
//      }
//     // fillListFontainesAssignes(username);
//}
//
//
//
//// </editor-fold>
//    
//private void MindDisplay(){
//   TreeNode node;
//                  if(!root.getChildren().isEmpty()) 
//                       root.getChildren().clear();
//             
//                int i=0;
//               for(TUtilisateurs u : (new UtilisateurDAO()).getAllAnimateurs()){
//                   hashMap.put(u.getUsername(), u);
//                    MindmapNode ips = new DefaultMindmapNode(u.getUsername(), "Animateur", "6e9ebf", true);  
//                    root.addNode(ips);
//                }
//}
//
//  private void addFontainetoMindMap(TBureaux b, MindmapNode nf){
//       MindmapNode node=null;
//      for(TFontaines ft: (new FontainesDAO()).getAllParBureau(b)){
//            String key=  " Fontane #:" + ft.getNumeroFontaine().toString();
//            String key_detail= "Quartier :" + ft.getQuartier().toString() + "Fontaine  #: " + ft.getNumeroFontaine().toString();
//           nf.addNode(new DefaultMindmapNode(key ,key_detail, "82c542"));  
//       }
//  }
//
// public void onNodeSelect(SelectEvent event) {  
//        MindmapNode node = (MindmapNode) event.getObject();  
//          
//        //populate if not already loaded  
//        if(node.getChildren().isEmpty()) {  
//            Object label = node.getLabel();  
//                  TUtilisateurs ut = (TUtilisateurs)hashMap.get(label.toString());
//                   for(TBureaux b :(new UserBureauxDAO()).getListBureauxAssign(ut)){
//                       MindmapNode onode =new DefaultMindmapNode(b.getQuartier() , b.getQuartier(), "82c542");
//                       node.addNode(onode);
//                       //  node.addNode(new DefaultMindmapNode(b.getQuartier() , b.getQuartier(), "82c542"));  
//                             addFontainetoMindMap( b, onode);
//                    }
//         }  
//          
//    }  
// 
////   private void populateNode(String username){
////          for(TBureaux b :(new UserBureauxDAO()).getListBureauxAssign(u)){
////                           TreeNode nodeSub = new DefaultTreeNode(b.getQuartier(),node);
////                     }
////   }
//      
//  public void onNodeDblselect(SelectEvent event) {  
//        this.selectedNode = (MindmapNode) event.getObject();          
//    }  
//    
//private void fillListBureauxAssignes(String username){
//             if(!username.isEmpty()) {
//                 connectedUser = uDAO.find(username);
//              this.listBureauxAssignes = aDAO.getListBureauxAssign(this.connectedUser); 
//                    for(TBureaux b: listBureauxAssignes ){
//                        SelectItem item = new SelectItem(b.getCodeBureau().toString(),b.getQuartier());
//                           this.bureauxAssignesItems.add(item);
//                    }
//             }  else {
//                  this.listBureauxAssignes = new ArrayList<TBureaux>();
//             }
//}
//
//
//private void fillListFontainesAssignes(String username){
//             if(!username.isEmpty()) {
//                 connectedUser = uDAO.find(username);
//              this.listFontainesAssignes = (new FontainesDAO()).getAllParBureau(this.selectedItemBureauAssigne);//aDAO.getListBureauxAssign(this.connectedUser); 
//                    for(TFontaines f: listFontainesAssignes){
//                        SelectItem item = new SelectItem(f.getCodeFontaine().toString(),f.getCodeFontaine().toString());
//                           this.fontainesAssignesItems.add(item);
//                    }
//             }  else {
//                
//                     this.fontainesAssignesItems=new LinkedList<SelectItem>();;
//             }
//}
//
//public void onSelectBureauAssigne(){
//     
//                 
//    fillListFontainesAssignes(connectedUser.getUsername());
// 
//}
//private void refreshDualList(){
//     List<TBureaux> source = new ArrayList<TBureaux>();
//     List<TBureaux> target = new ArrayList<TBureaux>();
//     
//     for(TBureaux b:(new UserBureauxDAO()).getListBureauxNonAssigner()){
//                    source.add(b);
//                }
//                
//     if(this.selectedUtilisateur.getUserId()!=0) {
//    for(TBureaux b:(new UserBureauxDAO()).getListBureauxAssign(this.selectedUtilisateur)){
//                    target.add(b);
//                } 
//     }
//            bureaux = new DualListModel<TBureaux>(source, target);     
//     
//         
//}
//
//// Gestion de Node User
//  private void AddSubNodeUser(TreeNode baseNode, TreeNode subNode, String subNodeTitle){
//                  subNode = new DefaultTreeNode(subNodeTitle, baseNode);
//                  this.listNodes.add(subNode);
//              }
//      private void fillNodeListBureauxAssignes(String username,TreeNode treeNode){
//             if(!username.isEmpty()) {
//               connectedUser = uDAO.find(username);
//            // List<TBureaux> listBureauxAssignes = (new UserBureauxDAO()).getListBureauxAssign(connectedUser); 
//                    for(TBureaux b: (new UserBureauxDAO()).getListBureauxAssign(connectedUser) ){
//                            TreeNode nodeUser =  new DefaultTreeNode(b.getQuartier(), treeNode);
//                                  fillNodeFontaine(b,nodeUser);
//                          
//                    }
//             }  else {
//                  //this.listBureauxAssignes = new ArrayList<TBureaux>();
//             }
//}  
//      private void fillNodeFontaine(TBureaux bureau,TreeNode subNode){
//           //List<TFontaines>  listFontainesAssignes = (new FontainesDAO()).getAllParBureau(bureau);//aDAO.getListBureauxAssign(this.connectedUser); 
//                    for(TFontaines f: (new FontainesDAO()).getAllParBureau(bureau)){
//                        String key=  " Fontane #:" + f.getNumeroFontaine().toString();
//            String key_detail= "Quartier : " + f.getQuartier().toString() + " Fontaine  #: " + f.getNumeroFontaine().toString();
//                        TreeNode nodeUser = new DefaultTreeNode(key,subNode);                    }
//      }
//
////Ajax
//public void genSpecializations(AjaxBehaviorEvent event) {
//     
//    if(this.selectedUtilisateur.getUserId()!=0) {
//        this.desactive=false;
//     this.selectedUtilisateur=uDAO.find(this.selectedUtilisateur);
//    } else {
//        this.desactive=true;
//    }
//    
//    this.refreshDualList();
//    
//    }
//
//private void fillUtilisateursItems(){
//    uDAO = new UtilisateurDAO();
//    for(TUtilisateurs t : uDAO.getAllAnimateurs()){
//         this.utilisateursItems.add(new SelectItem(t.getUserId(),t.getUsername()));
//    }
//    
//}
//public void onTransfer(TransferEvent event) {
//            boolean ret=false;
//            TBureaux itemSelect=new TBureaux();
//            String info="Bureau";
//            String msg_act=null;
//          FacesMessage msg = new FacesMessage();
//            if (event.isAdd()){
//                for(Object item : event.getItems() ) {
//                      itemSelect= (TBureaux) item;
//                       info=itemSelect.getQuartier();
//                   msg_act = "Assigner à l' Animateur ";
//                       AssignUser(itemSelect);
//                   }
//                 
//               } else if (event.isRemove()){
//                   for(Object item : event.getItems() ) {
//                          itemSelect= (TBureaux) item;
//                           info=itemSelect.getQuartier();
//                        msg_act = "Désassigner à l' Animateur ";
//                  
//                   desassigner(itemSelect);
//                   }
//               }
//        // listSurvey = surveyDAO.getSurveysBy(collecteID) ;
//            this.refreshDualList();
//            MindDisplay();
// 
//        msg.setSeverity(FacesMessage.SEVERITY_INFO);
//        msg.setSummary(msg_act + selectedUtilisateur.getUsername()  );
//        msg.setDetail(info.trim());
//        
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
// 
//private void message(String texte){
//    FacesMessage msg = new FacesMessage();
//    
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//}
//// addIntoUserTable((ActivityUserDTO) user); // this add the object to a List
//    
//   
//    private void desassigner(TBureaux b) {
//         TUserBureaux userb = new TUserBureaux();
//          // aDAO=new UserBureauxDAO();
//              userb.setUserId(this.selectedUtilisateur.getUserId());
//              userb.setCodeBureau(b.getCodeBureau());
//              aDAO.removeFromAssign(userb);
//              //userb =aDAO.find(this.selectedUtilisateur.getUserId(), b.getCodeBureau());
//              //aDAO.delete(userb);
//    }
//   
//
//    public void AssignUser(TBureaux b){
//            TUserBureaux userb = new TUserBureaux();
//              userb.setUserId(this.selectedUtilisateur.getUserId());
//              userb.setCodeBureau(b.getCodeQuartier());
//               aDAO=new UserBureauxDAO();
//               aDAO.create(userb);
//    }
//    private void fillBureauxItems(){
//            bDAO = new BureauDAO();
//    
//        for(TBureaux t : bDAO.getAll()){
//             this.bureauxItems.add(new SelectItem(t.getCodeBureau(),t.getQuartier()));
//        }
//    
//    }
// 
//   public String ReadCookie(String cookie_name){
//        String cookieValue="";
//         HttpServletRequest request =    (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();   
//          Cookie[] cookies =  request.getCookies();//       new Cookie(cookie_name,value);
//          if (cookies != null) {   
//              for(int i=0; i<cookies.length; i++){    
//                  if (cookies[i].getName().equalsIgnoreCase(cookie_name)){
//                       cookieValue = cookies[i].getValue();     
//                     }   
//                   }  
//             }
//              return cookieValue.trim();
//   }
//    
//       
//    //Settet and Getter
//    public BureauDAO getbDAO() {
//        return bDAO;
//    }
//
//    public void setbDAO(BureauDAO bDAO) {
//        this.bDAO = bDAO;
//    }
//
//    public UtilisateurDAO getuDAO() {
//        return uDAO;
//    }
//
//    public void setuDAO(UtilisateurDAO uDAO) {
//        this.uDAO = uDAO;
//    }
//
//    public UserBureauxDAO getaDAO() {
//        return aDAO;
//    }
//
//    public void setaDAO(UserBureauxDAO aDAO) {
//        this.aDAO = aDAO;
//    }
//
//    public TUtilisateurs getSelectedUtilisateur() {
//        return selectedUtilisateur;
//    }
//
//    public void setSelectedUtilisateur(TUtilisateurs selectedUtilisateur) {
//        this.selectedUtilisateur = selectedUtilisateur;
//    }
//
//   
//
//    public List<TUtilisateurs> getListUtilisateurs() {
//        return listUtilisateurs;
//    }
//
//    public void setListUtilisateurs(List<TUtilisateurs> listUtilisateurs) {
//        this.listUtilisateurs = listUtilisateurs;
//    }
//
//    public List<TBureaux> getListBureaux() {
//        return listBureaux;
//    }
//
//    public void setListBureaux(List<TBureaux> listBureaux) {
//        this.listBureaux = listBureaux;
//    }
//
//    public List<SelectItem> getUtilisateursItems() {
//        return utilisateursItems;
//    }
//
//    public void setUtilisateursItems(List<SelectItem> utilisateursItems) {
//        this.utilisateursItems = utilisateursItems;
//    }
//
//    public List<SelectItem> getBureauxItems() {
//        return bureauxItems;
//    }
//
//    public void setBureauxItems(List<SelectItem> bureauxItems) {
//        this.bureauxItems = bureauxItems;
//    }
//
//    public DualListModel<TBureaux> getBureaux() {
//        return bureaux;
//    }
//
//    public void setBureaux(DualListModel<TBureaux> bureaux) {
//        this.bureaux = bureaux;
//    }
//
//    public boolean isDesactive() {
//        return desactive;
//    }
//
//    public void setDesactive(boolean desactive) {
//        this.desactive = desactive;
//    }
//
//    public MindmapNode getRoot() {
//        return root;
//    }
//
//    public void setRoot(MindmapNode root) {
//        this.root = root;
//    }
//
//    public MindmapNode getSelectedNode() {
//        return selectedNode;
//    }
//
//    public void setSelectedNode(MindmapNode selectedNode) {
//        this.selectedNode = selectedNode;
//    }
//
//    public List<TUserBureaux> getListUserBureaux() {
//        return listUserBureaux;
//    }
//
//    public void setListUserBureaux(List<TUserBureaux> listUserBureaux) {
//        this.listUserBureaux = listUserBureaux;
//    }
//
//    public Map<String, TUtilisateurs> getHashMap() {
//        return hashMap;
//    }
//
//    public void setHashMap(Map<String, TUtilisateurs> hashMap) {
//        this.hashMap = hashMap;
//    }
//
//    public TUtilisateurs getConnectedUser() {
//        return connectedUser;
//    }
//
//    public List<TBureaux> getListBureauxAssignes() {
//        return listBureauxAssignes;
//    }
//
//    public TBureaux getSelectedItemBureauAssigne() {
//        return selectedItemBureauAssigne;
//    }
//
//    public void setSelectedItemBureauAssigne(TBureaux selectedItemBureauAssigne) {
//        this.selectedItemBureauAssigne = selectedItemBureauAssigne;
//    }
//
//    public List<SelectItem> getBureauxAssignesItems() {
//        return bureauxAssignesItems;
//    }
//
//    public void setBureauxAssignesItems(List<SelectItem> bureauxAssignesItems) {
//        this.bureauxAssignesItems = bureauxAssignesItems;
//    }
//
//    public TFontaines getSelectedItemFontaineAssigne() {
//        return selectedItemFontaineAssigne;
//    }
//
//    public void setSelectedItemFontaineAssigne(TFontaines selectedItemFontaineAssigne) {
//        this.selectedItemFontaineAssigne = selectedItemFontaineAssigne;
//    }
//
//    public TFontaines getSelectedFontaines() {
//        return selectedFontaines;
//    }
//
//    public void setSelectedFontaines(TFontaines selectedFontaines) {
//        this.selectedFontaines = selectedFontaines;
//    }
//
//    public List<TFontaines> getListFontainesAssignes() {
//        return listFontainesAssignes;
//    }
//
//    public void setListFontainesAssignes(List<TFontaines> listFontainesAssignes) {
//        this.listFontainesAssignes = listFontainesAssignes;
//    }
//
//    public List<SelectItem> getFontainesAssignesItems() {
//        return fontainesAssignesItems;
//    }
//
//    public void setFontainesAssignesItems(List<SelectItem> fontainesAssignesItems) {
//        this.fontainesAssignesItems = fontainesAssignesItems;
//    }
//
//    public TreeNode getRootUser() {
//        return rootUser;
//    }
//
//    public void setRootUser(TreeNode rootUser) {
//        this.rootUser = rootUser;
//    }
//
//    public TreeNode getSelectedNodesUser() {
//        return selectedNodesUser;
//    }
//
//    public void setSelectedNodesUser(TreeNode selectedNodesUser) {
//        this.selectedNodesUser = selectedNodesUser;
//    }
//
//     
//
//    public List<Object> getListNodes() {
//        return listNodes;
//    }
//
//    public void setListNodes(List<Object> listNodes) {
//        this.listNodes = listNodes;
//    }
//
//    
//    
//   
//   
//    
//}
