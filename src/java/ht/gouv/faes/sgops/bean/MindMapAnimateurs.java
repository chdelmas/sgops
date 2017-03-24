/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author chdelmas
 */
@ManagedBean
@ViewScoped
public class MindMapAnimateurs implements Serializable{
//     private static final long serialVersionUID = 1L; 
//    private static final Logger log = Logger.getLogger(MindMapAnimateurs.class.getName());
//     @Transient
//    private BureauDAO bDAO ;
//      @Transient
//    private UtilisateurDAO uDAO ;
//     @Transient
//    private UserBureauxDAO aDAO;
//    private TUtilisateurs selectedUtilisateur ;
//    private List<TUtilisateurs> listUtilisateurs ;  
//    private List<TBureaux> listBureaux ;  
//    private boolean desactive;
//    private MindmapNode root;  
//    private  Map<String, TUtilisateurs> hashMap = new HashMap<String, TUtilisateurs>();
//    private MindmapNode selectedNode;  
//   
//@PostConstruct
//public void init(){
//    
//      //Initialisation du MindMAp
//            root = new DefaultMindmapNode("Animateur", "Réseau Quartier", "FFCC00", false);  
//           this.selectedUtilisateur = new TUtilisateurs();
//           aDAO = new UserBureauxDAO();
//          desactive=true;
//      MindDisplay();
// 
//}
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
//                  
//               }
//}
//
// private void addFontainetoMindMap(TBureaux b, MindmapNode nf){
//      // MindmapNode node=null;
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
//           
//        }  
//          
//    }  
// 
////   private void populateNode(String username){
////          for(TBureaux b :(new UserBureauxDAO()).getListBureauxAssign(u)){
////                           TreeNode nodeSub = new DefaultTreeNode(b.getQuartier(),node);
////                     }
////   }
//      
//    public void onNodeDblselect(SelectEvent event) {  
//        this.selectedNode = (MindmapNode) event.getObject();          
//    }  
//// </editor-fold>
// 
////Ajax
//public void genSpecializations(AjaxBehaviorEvent event) {
//        if(this.selectedUtilisateur.getUserId()!=0) {
//             this.desactive=false;
//             this.selectedUtilisateur=uDAO.find(this.selectedUtilisateur);
//          } else {
//           this.desactive=true;
//        }
//   }
//
// 
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
////                       AssignUser(itemSelect);
//                   }
//                 
//               } else if (event.isRemove()){
//                   for(Object item : event.getItems() ) {
//                          itemSelect= (TBureaux) item;
//                           info=itemSelect.getQuartier();
//                        msg_act = "Désassigner à l' Animateur ";
//                  
//  //                 desassigner(itemSelect);
//                   }
//               }
//        // listSurvey = surveyDAO.getSurveysBy(collecteID) ;
//          //  this.refreshDualList();
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
//   
//   
       
}
