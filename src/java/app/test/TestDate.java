/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.test;

import ht.gouv.faes.sgops.controller.PrestataireDAO;
import ht.gouv.faes.sgops.model.TblPrestataire;

/**
 *
 * @author chdelmas
 */
public class TestDate {
      public static void main(String[] args) {
        
   
        // TODO code application logic here
        
             PrestataireDAO pDAO = new PrestataireDAO();
                         System.out.println(pDAO.getDateDebut().toString());
 
    }
}
