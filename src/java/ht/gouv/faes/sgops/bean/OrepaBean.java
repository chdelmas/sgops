/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;
 
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hubert
 */
@ManagedBean
@RequestScoped
public class OrepaBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//    private OrepaDAO orepaDAO;
//    private List<TOrepa> listOrepa;
//private TOrepa selectedOrepa;
//private TOrepa[] selectedOrepas;
//private OrepaDataModel orepaDataModel;
//public OrepaBean() {
//    orepaDAO=new OrepaDAO();
//    
//listOrepa = new ArrayList<TOrepa>();
//listOrepa=orepaDAO.getAll();
//}
//
//public String create(){
//    FacesMessage mes=null;
//    boolean ret=false;
//    String outcome=null;
//    try{
//    ret=orepaDAO.create(selectedOrepa);
//    if(ret==true){
//        mes=new FacesMessage(FacesMessage.SEVERITY_INFO, "Enregistrement", "Avec succes");
//    }else{
//     mes=new FacesMessage(FacesMessage.SEVERITY_WARN, "Enregistrement", "Echec de sauvegarde");
//     outcome="error?faces-redirect=true&amp;includeViewParams=true";
//    }
//    }catch(Exception e){
//    mes=new FacesMessage(FacesMessage.SEVERITY_WARN, "Enregistrement", "Echec de sauvegarde");
//     outcome="error?faces-redirect=true&amp;includeViewParams=true";
//    }
//    FacesContext.getCurrentInstance().addMessage(null, mes);
//    return outcome;
//
//}
////getters and setters
//
//    public OrepaDAO getOrepaDAO() {
//        return orepaDAO;
//    }
//
//    public void setOrepaDAO(OrepaDAO orepaDAO) {
//        this.orepaDAO = orepaDAO;
//    }
//
//    public List<TOrepa> getListOrepa() {
//        return listOrepa;
//    }
//
//    public void setListOrepa(List<TOrepa> listOrepa) {
//        this.listOrepa = listOrepa;
//    }
//
//    public TOrepa getSelectedOrepa() {
//        return selectedOrepa;
//    }
//
//    public void setSelectedOrepa(TOrepa selectedOrepa) {
//        this.selectedOrepa = selectedOrepa;
//    }
//
//    public TOrepa[] getSelectedOrepas() {
//        return selectedOrepas;
//    }
//
//    public void setSelectedOrepas(TOrepa[] selectedOrepas) {
//        this.selectedOrepas = selectedOrepas;
//    }
//
//    public OrepaDataModel getOrepaDataModel() {
//        return orepaDataModel;
//    }
//
//    public void setOrepaDataModel(OrepaDataModel orepaDataModel) {
//        this.orepaDataModel = orepaDataModel;
//    }
//
//   
//   
//    // Manage Event
//    public void onRowSelect(SelectEvent event){
//        //FacesMessage msg=new FacesMessage("TOrepa Selected",((TOrepa) event.getObject()).getCodeBureau());
//        //FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
//    public void onRowSelect(UnselectEvent event){
//        //FacesMessage msg=new FacesMessage("TOrepa Selected",((TOrepa) event.getObject()).getCodeBureau());
//        //FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
//    public String onRowSelectNavigate(SelectEvent event){
//    FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedTOrepa", event.getObject());
//    return "editBureau?faces-redirect=true";
//    }
//    
}

