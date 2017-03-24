/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author chdelmas
 */
@ManagedBean 
@SessionScoped 
public class CreateAccessPrivilegeBean implements Serializable { 
 
    private static final long serialVersionUID = 1L; 
    private String name = ""; 
 
 
    private boolean dialogBoxRendered = false; 
 
    public CreateAccessPrivilegeBean() { 
       //  setDialogBoxRendered(false); 
    } 
 
    public void createAccessPrivilege() { 
      //  List<Privileges> privilegesList = privilegeService.getAllPrivilegesByCategory(UIConstants.ACCESS_CATEGORY); 
 
//        ..... 
//        if (privilegeExists) { 
//            FacesContext context = FacesContext.getCurrentInstance(); 
//            context.addMessage(null, new FacesMessage("Error:" , 
//                      this.name + " Privilege with this name already exists")); 
//        } else { 
//            ...... 
//            FacesContext context = FacesContext.getCurrentInstance(); 
//            context.addMessage(null, new FacesMessage("Success:", 
//                    "Privilege successfully added")); 
//        } 
// 
//        this.setName(""); 
//        setDialogBoxRendered(true); 
    } 
 
    public void handleClose() { 
         
      //  setDialogBoxRendered(false); 
    } 
 
   public boolean isUserInRole(String role) {     
       return (FacesContext.getCurrentInstance().getExternalContext().isUserInRole(role)); 
   }
//   public void deleteRow(rowType row){    
//       this.tableDataList.remove(row); 
//   } 
} 
