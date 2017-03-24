/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author chdelmas
 */
@ManagedBean(eager=true)
@ApplicationScoped
public class App {
//    private String theme;
//    private int userConnecter;
//    private List<TUtilisateurs> listUtilisateurs;
//    private List<String> username;
//    private List<TUtilisateurs> users = new ArrayList<TUtilisateurs>();

    
    public App(){
        
    }
    
    @PostConstruct
     public void  init(){
//        username = new ArrayList <String>();
//        listUtilisateurs = new ArrayList<TUtilisateurs>();
      }

    //Getter / Setter
  
     
}
