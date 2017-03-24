/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.view;

 
import javax.faces.bean.ManagedBean;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class TreeBean {
//    private TreeNode rootUser;
//     @Transient
//    private BureauDAO bDAO ;
//      @Transient
//    private UtilisateurDAO uDAO ;
//     @Transient
//    private UserBureauxDAO aDAO;
//	
//	private TreeNode[] selectedNodesUser;
//        private List<Object> listNodes;
//
//	public TreeBean() {
//          //   listNodes = new ArrayList<Object>();
//		rootUser = new DefaultTreeNode("Utilisateurs", null);
//                TreeNode nodeUser;
//                int i=0;
//               for(TUtilisateurs u : (new UtilisateurDAO()).getAllAnimateurs()){
//                    nodeUser = new DefaultTreeNode(u.getUsername(), rootUser);
//                    fillNodeListBureauxAssignes(u.getUsername(),nodeUser);
//               }
// 		 
//	}
//
//     
//    	public void displaySelectedMultiple(ActionEvent event) {
//            if(selectedNodesUser != null && selectedNodesUser.length > 0) {
//                StringBuilder builder = new StringBuilder();
//    
//                for(TreeNode nodeUser : selectedNodesUser) {
//                    builder.append(nodeUser.getData().toString());
//                    builder.append("<br />");
//                }
//    
//                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", builder.toString());
//    
//                FacesContext.getCurrentInstance().addMessage(null, message);
//            }
//    	}
//        
//        
//        private void AddSubNodeUser(TreeNode baseNode, TreeNode subNode, String subNodeTitle){
//                  subNode = new DefaultTreeNode(subNodeTitle, baseNode);
//                  this.listNodes.add(subNode);
//              }
//      private void fillNodeListBureauxAssignes(String username,TreeNode treeNode){
//             if(!username.isEmpty()) {
//                TUtilisateurs  connectedUser =(new UtilisateurDAO()).find(username);
//             List<TBureaux> listBureauxAssignes = (new UserBureauxDAO()).getListBureauxAssign(connectedUser); 
//                    for(TBureaux b: listBureauxAssignes ){
//                            TreeNode nodeUser =  new DefaultTreeNode(b.getQuartier(), treeNode);
//                                   fillNodeFontaine(b,nodeUser);
//                          
//                    }
//             }  else {
//                  //this.listBureauxAssignes = new ArrayList<TBureaux>();
//             }
//}  
//      private void fillNodeFontaine(TBureaux bureau,TreeNode subNode){
//           List<TFontaines>  listFontainesAssignes = (new FontainesDAO()).getAllParBureau(bureau);//aDAO.getListBureauxAssign(this.connectedUser); 
//                    for(TFontaines f: listFontainesAssignes){
//                        String key=  " Fontane #:" + f.getNumeroFontaine().toString();
//            String key_detail= "Quartier : " + f.getQuartier().toString() + " Fontaine  #: " + f.getNumeroFontaine().toString();
//                        TreeNode nodeUser = new DefaultTreeNode(key,subNode);                    }
//      }
//
//    //      private void fillListFontainesAssignes(String username){
//    //             if(!username.isEmpty()) {
//    //               TUtilisateurs  connectedUser = (new UtilisateurDAO()).find(username);
//    //           List<TFontaines>  listFontainesAssignes = (new FontainesDAO()).getAllParBureau(this.selectedItemBureauAssigne);//aDAO.getListBureauxAssign(this.connectedUser);
//    //                    for(TFontaines f: listFontainesAssignes){
//    //                        SelectItem item = new SelectItem(f.getCodeFontaine().toString(),f.getCodeFontaine().toString());
//    //                           this.fontainesAssignesItems.add(item);
//    //                    }
//    //             }  else {
//    //
//    //                     this.fontainesAssignesItems=new LinkedList<SelectItem>();;
//    //             }
//    //      }
//    public TreeNode getRootUser() {
//        return rootUser;
//    }
//
//    public void setRootUser(TreeNode rootUser) {
//        this.rootUser = rootUser;
//    }
//
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
//    public TreeNode[] getSelectedNodesUser() {
//        return selectedNodesUser;
//    }
//
//    public void setSelectedNodesUser(TreeNode[] selectedNodesUser) {
//        this.selectedNodesUser = selectedNodesUser;
//    }
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
        
        
        
}
					