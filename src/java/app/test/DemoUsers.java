package app.test;


import ht.gouv.faes.sgops.controller.UtilisateurDAO;
import ht.gouv.faes.sgops.model.TblAdmComptes;
import java.util.ArrayList;
import java.util.List;


 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
public class DemoUsers {
    static  TblAdmComptes connectedUser= new TblAdmComptes();
     static UtilisateurDAO uDAO = new UtilisateurDAO(); 
  // static  List<TBureaux> listBureauxAssignes = new ArrayList<TBureaux>();
  // static  UserBureauxDAO ub = new UserBureauxDAO();
    public static void main(String[] args) {
       connectedUser.setIdentifiant("oper");
       connectedUser.setMotDePasse("oper");
      // connectedUser =  uDAO.find(connectedUser);
             uDAO.authenticate(connectedUser);
        if(connectedUser !=null ) {
            System.out.println("User Logon True");
        } else {
                System.out.println("User Logon False");
        }
//         listBureauxAssignes = ub.getListBureauxAssign(connectedUser);
//         
//         for(TBureaux b : listBureauxAssignes){
//             System.out.println(b.getQuartier());
//         }
           
    }
    
   
    
//     public List<TBureaux> getListBureauxAssignes() {
//        this.connectedUser.setUserId(2);
//          this.connectedUser=   uDAO.find(this.connectedUser);
//        if(this.connectedUser !=null ) {
//        this.listBureauxAssignes = (new UserBureauxDAO()).getListBureauxAssign(this.connectedUser);
//            return this.listBureauxAssignes;
//            } else {
//                 
//        return null;
//        }
  
}
