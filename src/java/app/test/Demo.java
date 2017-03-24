package app.test;


import ht.gouv.faes.sgops.controller.PrestataireDAO;
import ht.gouv.faes.sgops.model.TblPrestataire;


 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
public class Demo {
// private final FormeLegaleDAO formeLegaleDAO = new FormeLegaleDAO();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        // TODO code application logic here
        
             PrestataireDAO pDAO = new PrestataireDAO();
        for(TblPrestataire  o : pDAO.getAll()){
            System.out.println(o.getPrestataireId().toString() + "  "  +  o.getPrestataireFirme());
        }
 
    }
}