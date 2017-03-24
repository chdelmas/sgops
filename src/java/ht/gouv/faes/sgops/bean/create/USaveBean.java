/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean.create;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author chdelmas
 */
@ManagedBean
@RequestScoped
public class USaveBean implements Serializable{
//   private static final long serialVersionUID = 1L; 
//    private TUtilisateurs selectedUtilisateur ; 
//    private static final Logger log = Logger.getLogger(USaveBean.class.getName());
//   
//  //Visible hide panel
//   private String sujet;
//   private String text;
//   private boolean saisie;
//   private boolean consultation;
//   private boolean analyse;
//   private boolean parametres;
//   private boolean active;
//   private boolean encrypter;
//   private int tabActiveIndex=0;
//   private String photoPath;
//   private Image  photoBin;
// private String confirmPassword;
// public USaveBean(){
//       selectedUtilisateur = new TUtilisateurs();
//      
//  
// }
// 
//	
// 
// private void saveUserEvent(TUtilisateurs u){
//     String username="";
//     ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//     Calendar cal;   cal = Calendar.getInstance();
//     username  = (String)externalContext.getSessionMap().get("username");
//   if( username !=null) {
//          log.log(Level.INFO, "The Current User is : {0}", username);
//          u.setCreePar(username.trim());
//     }
//      u.setCreeLe(cal.getTime());      
// }
// //Action 
//    public void save( ){
//    FacesMessage message ;
//        UtilisateurDAO utilisateurDAO= new UtilisateurDAO();
//     try{
//           saveUserEvent(selectedUtilisateur);
//            utilisateurDAO.create(selectedUtilisateur);
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
//  
//  
////     
////private void getUserDataInfo(){
////         activeUtilisateur =(  TUtilisateurs) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
////      
////}
//    
//  
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
////Setter and User
//  
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
//    public String getPhotoPath() {
//        return photoPath;
//    }
//
//    public void setPhotoPath(String photoPath) {
//        this.photoPath = photoPath;
//    }
//
//    public Image getPhotoBin() {
//        return photoBin;
//    }
//
//    public void setPhotoBin(Image photoBin) {
//        this.photoBin = photoBin;
//    }
//
//   
//  
 
}
