/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean.utilisateurs;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author chdelmas
 */
@ManagedBean
@SessionScoped
public class UtilisateurBean implements Serializable{
//    private static final Logger log = Logger.getLogger(UtilisateurBean.class.getName());
//    private static final long serialVersionUID = 1L; 
//    private TUtilisateurs selectedUtilisateur ;
//    private List<TUtilisateurs> listUtilisateurs ;
//   
//    TUtilisateurs  activeUtilisateur;
//    @Transient
//     private UtilisateurDAO utilisateurDAO;
//       //DataModel
//    @Transient
//    private UtilisateurDataModel utilisateurDataModel=null; 
//  
//   private boolean skip;
//  //Visible hide panel
//   private String sujet;
//   private String text;
//   private boolean saisie;
//   private boolean consultation;
//   private boolean analyse;
//   private boolean parametres;
//   private boolean active;
//   private boolean encrypter;
//   private boolean animateur;
//   @Transient
//   private RecordAction action;
//   private int tabActiveIndex=0;
//   private String confirmPassword;
//   private String destination;
//   private String filename;
// 
//   public UtilisateurBean(){
//  }
//// 
// @PostConstruct
//void init() {
//    FacesContext.getCurrentInstance().getExternalContext().getSession(true);
//      listUtilisateurs = new ArrayList<TUtilisateurs>();
//       selectedUtilisateur = new TUtilisateurs();
//       activeUtilisateur = new TUtilisateurs();
//       utilisateurDAO = new UtilisateurDAO();
//       listUtilisateurs =(new UtilisateurDAO()).getAll();
//       utilisateurDataModel = new  UtilisateurDataModel( listUtilisateurs);
//       action=RecordAction.Nouveau;
//      this.selectedUtilisateur = this.listUtilisateurs.get(0);
//}
// 
// 
// 
// public void upload(FileUploadEvent event) {  
//       FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
//        FacesContext.getCurrentInstance().addMessage(null, msg);  
//        this.filename= event.getFile().getFileName() ;
//        // Do what you want with the file        
////        try {
////            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
////        } catch (IOException e) {
////        }
//
//    }  
//
////    private void copyFile(String fileName, InputStream in) {
////           try {
////              ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();
////                  destination =  extContext.getRealPath("uploads//files//");
////              
////                // write the inputStream to a FileOutputStream
////                OutputStream out = new FileOutputStream(new File(destination + fileName));
////             
////                int read = 0;
////                byte[] bytes = new byte[1024];
////             
////                while ((read = in.read(bytes)) != -1) {
////                    out.write(bytes, 0, read);
////                }
////             
////                in.close();
////                out.flush();
////                out.close();
////             
////                System.out.println("New file created!");
////                } catch (IOException e) {
////                System.out.println(e.getMessage());
////                } 
////           this.selectedUtilisateur.setPhotoPath(this.filename);
////         // updatePhoto();
////    }
//private void saveUserEvent(TUtilisateurs u){
//     String username;
//     ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//     Calendar cal;   cal = Calendar.getInstance();
//     username  = (String)externalContext.getSessionMap().get("username");
//   if( username !=null) {
//          log.log(Level.INFO, "The Current User is : {0}", username);
//          u.setCreePar(username.trim());
//     }
//      u.setCreeLe(cal.getTime());      
// }
//
//private void updateUserEvent(TUtilisateurs u){
//     String username;
//     ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//     Calendar cal;   cal = Calendar.getInstance();
//     username  = (String)externalContext.getSessionMap().get("username");
//   if( username !=null) {
//          log.log(Level.INFO, "The Current User is : {0}", username);
//          u.setModifiePar(username.trim());
//     }
//      u.setModifieLe(cal.getTime());      
//}
// //Action 
//       public void save( ){
//    FacesMessage message ;
//        //utilisateurDAO= new UtilisateurDAO();
//     try{
//           saveUserEvent(selectedUtilisateur);
//            (new UtilisateurDAO()).create(selectedUtilisateur);
//             message= new FacesMessage(FacesMessage.SEVERITY_INFO, "Enregistrement", "Avec succes");
//             this.tabActiveIndex=0;
//     } catch(Exception e){
//        
//         message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Enregistrement", "Echec de Sauvegarde");
//             
//     }
//      FacesContext.getCurrentInstance().addMessage(null,message);
//      
//    }
//       public void updatePhoto(){
//          FacesMessage message = null;
//              boolean ret = false; 
//      String outcome;
//       Calendar cal;
//        cal = Calendar.getInstance();
//        
//          this.selectedUtilisateur.setModifiePar(this.activeUtilisateur.getUsername());
//          this.selectedUtilisateur.setModifieLe(cal.getTime());
//        try{
//             
//             (new UtilisateurDAO()).update(selectedUtilisateur);
//              action=RecordAction.Actualiser;
//              message= new FacesMessage(FacesMessage.SEVERITY_INFO, "Modifier", "Avec succes");
//               
//         } 
//         catch(Exception ex){
//              message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Modification", "Echec de Modification");
//               
//         }
//             FacesContext.getCurrentInstance().addMessage(null,message);
//        
//    }
//  
//   public String update( ) {
//     
//      FacesMessage message = null;
//      boolean ret = false; 
//      String outcome;
//       Calendar cal;
//        cal = Calendar.getInstance();
//        
//          this.selectedUtilisateur.setModifiePar(this.activeUtilisateur.getUsername());
//          this.selectedUtilisateur.setModifieLe(cal.getTime());
//        try{
//              saveUserEvent(selectedUtilisateur);
//              (new UtilisateurDAO()).update(selectedUtilisateur);
//              action=RecordAction.Actualiser;
//              message= new FacesMessage(FacesMessage.SEVERITY_INFO, "Modifier", "Avec succes");
//               outcome = "app?faces-redirect=true&amp;includeViewParams=true";
//         } 
//         catch(Exception ex){
//              message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Modification", "Echec de Modification");
//              outcome = "error?faces-redirect=true&amp;includeViewParams=true";
//         }
//             FacesContext.getCurrentInstance().addMessage(null,message);
//        return outcome;
//    }
//   
//   
//  public void onRowSelect(SelectEvent event) {  
//        this.selectedUtilisateur = (TUtilisateurs) event.getObject();
//        FacesMessage msg = new FacesMessage("Utilisateur Selected", ((TUtilisateurs) event.getObject()).getUsername());  
//         // FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedUtilisateur", selectedUtilisateur);
//        FacesContext.getCurrentInstance().addMessage(null, msg);  
//        
//         this.tabActiveIndex=1;
//    }  
//  
//    public void onRowUnselect(UnselectEvent event) {  
//        FacesMessage msg = new FacesMessage("Tblprestataire Unselected", ((TUtilisateurs) event.getObject()).getUsername());  
//      
//        FacesContext.getCurrentInstance().addMessage(null, msg);  
//    }  
//  
//
//    
//
//
//
//
//    
//     
//    
//      
//    public String onFlowProcess(FlowEvent event) {  
//   
//        
//        if(skip) {  
//            skip = false;   //reset in case user goes back  
//            return "confirm";  
//        }  
//        else {  
//            return event.getNewStep();  
//        }  
//    }  
//
//     public void onTabChange(TabChangeEvent event) {  
//        FacesMessage message = new FacesMessage("Tab Changed", "Active Tab" + event.getTab().getId());  
//         FacesContext.getCurrentInstance().addMessage(null, message);  
//    }  
//
//   
// 
//
//  public String abandonner(){
//         
//       this.selectedUtilisateur = null;
//        return "app?faces-redirect=true";
//      
//    }
//     
//private void getUserDataInfo(){
//    TUtilisateurs u;
//     try{
//         
//     
//    u=(  TUtilisateurs) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
//       
//      log.info(u.getUsername());  
//        activeUtilisateur =(u!=null ? u : null);
//     }
//       catch(Exception e){
//           activeUtilisateur=null;
//           log.warning(e.toString());
//       }
//}
//    
//
//  
//  private String ReadCookie(String cookie_name){
//        String cookieValue="";
//         HttpServletRequest request =    (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();   
//          Cookie[] cookies =  request.getCookies();
//          if (cookies != null) {   
//              for(int i=0; i<cookies.length; i++){    
//                  if (cookies[i].getName().equalsIgnoreCase(cookie_name)){
//                       cookieValue = cookies[i].getValue();     
//                     }   
//                   }  
//             }
//              return cookieValue;
//   }
//    private String Remember2String(boolean value){
//                 if(value == false){
//                     return  "false";
//                   } 
//                  else{
//                   return  "true";
//               }
//        }
//     
//   
//  public void addMessage(String sumprestataireDAOry) { 
//     //  RequestContext context = RequestContext.getCurrentInstance();
//         FacesMessage message = null;
//          message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome",sumprestataireDAOry);
//        FacesContext.getCurrentInstance().addMessage(null, message);
//        //context.addCallbackParam("loggedIn", loggedIn);
//    }  
//  
// 
//    public TUtilisateurs getSelectedUtilisateur() {
//        if (selectedUtilisateur== null)
//        {
//            selectedUtilisateur= listUtilisateurs.get(0);
//        }
//        
//        return selectedUtilisateur;
//    }
//
//    public void setSelectedUtilisateur(TUtilisateurs selectedUtilisateur) {
//        this.selectedUtilisateur = selectedUtilisateur;
//    }
//
//    public List<TUtilisateurs> getListUtilisateurs() {
//        return listUtilisateurs;
//    }
//
//    public void setListUtilisateurs(List<TUtilisateurs> listUtilisateurs) {
//        this.listUtilisateurs = listUtilisateurs;
//    }
//
//    public TUtilisateurs getActiveUtilisateur() {
//        return activeUtilisateur;
//    }
//
//    public void setActiveUtilisateur(TUtilisateurs activeUtilisateur) {
//        this.activeUtilisateur = activeUtilisateur;
//    }
//
//    
// 
//
//    public UtilisateurDataModel getUtilisateurDataModel() {
//        return utilisateurDataModel;
//    }
//
//    public void setUtilisateurDataModel(UtilisateurDataModel utilisateurDataModel) {
//        this.utilisateurDataModel = utilisateurDataModel;
//    }
//
//   
//
//    public boolean isSkip() {
//        return skip;
//    }
//
//    public void setSkip(boolean skip) {
//        this.skip = skip;
//    }
//
//    public String getSujet() {
//        return sujet;
//    }
//
//    public void setSujet(String sujet) {
//        this.sujet = sujet;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String getConfirmPassword() {
//       
//        return confirmPassword;
//    }
//
//    public void setConfirmPassword(String confirmPassword) {
//        this.confirmPassword = confirmPassword;
//    }
//
//    public boolean isSaisie() {
//        this.saisie=(selectedUtilisateur.getSaisie()==1 ? true: false);
//        return saisie;
//    }
//
//    public void setSaisie(boolean saisie) {
//        this.saisie = saisie;
//         if(saisie==true){
//            this.selectedUtilisateur.setSaisie((short)1);
//          } else{
//              this.selectedUtilisateur.setSaisie((short)0);
//          }
//    }
//
//    public boolean isConsultation() {
//        this.consultation=(selectedUtilisateur.getConsultation()==1 ? true: false);
//        
//        return consultation;
//    }
//
//    public void setConsultation(boolean consultation) {
//        this.consultation = consultation;
//         if(consultation==true){
//            this.selectedUtilisateur.setConsultation((short)1);
//          } else{
//              this.selectedUtilisateur.setConsultation((short)0);
//          }
//   
//    }
//
//    public boolean isAnalyse() {
//        this.analyse=(selectedUtilisateur.getAnalyse()==1 ? true: false);
//        return analyse;
//    }
//
//    public void setAnalyse(boolean analyse) {
//       
//          if(analyse==true){
//            this.selectedUtilisateur.setAnalyse((short)1);
//          } else{
//              this.selectedUtilisateur.setAnalyse((short)0);
//          }
//       
//    }
//
//    public boolean isParametres() {
//        this.parametres=(selectedUtilisateur.getParametres()==1 ? true: false);
//        return parametres;
//    }
//
//    public void setParametres(boolean parametres) {
//         
//        
//         if(parametres==true){
//            this.selectedUtilisateur.setParametres((short)1);
//          } else{
//              this.selectedUtilisateur.setParametres((short)0);
//          }
//        this.parametres = parametres;
//    }
//
//    public boolean isActive() {
//        this.active=(selectedUtilisateur.getActive()==1 ? true: false);
//        return active;
//    }
//
//    public void setActive(boolean active) {
//         if(active==true){
//            this.selectedUtilisateur.setActive((short)1);
//          } else{
//              this.selectedUtilisateur.setActive((short)0);
//          }
//        this.active =active;
//        
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
//    public boolean isEncrypter() {
//        this.encrypter=(selectedUtilisateur.getEncrypter()==1 ? true: false);
//        
//        return encrypter;
//    }
//
//    public void setEncrypter(boolean encrypter) {
//        
//         if(encrypter==true){
//            this.selectedUtilisateur.setEncrypter((short)1);
//          } else{
//              this.selectedUtilisateur.setEncrypter((short)0);
//          }
//        this.encrypter = encrypter;
//    }
//
//    public boolean isAnimateur() {
//        this.animateur=(selectedUtilisateur.getAnimateur()==1?true:false);
//        return animateur;
//    }
//
//    public void setAnimateur(boolean animateur) {
//        if(animateur==true){
//             this.selectedUtilisateur.setAnimateur((short)1);
//        } else {
//             this.selectedUtilisateur.setAnimateur((short)0);
//        }
//        this.animateur = animateur;
//    }
//
//    
//    
//    
//    public RecordAction getAction() {
//        return action;
//    }
//
//    public void setAction(RecordAction action) {
//        this.action = action;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public String getFilename() {
//        filename = (this.selectedUtilisateur.getPhotoPath().isEmpty() ? "profile_picture.png" : this.selectedUtilisateur.getPhotoPath());
//        return filename;
//    }
//
//    public void setFilename(String filename) {
//        
//        this.selectedUtilisateur.setPhotoPath(filename);
//        this.filename = filename;
//    }
//  


 
}
