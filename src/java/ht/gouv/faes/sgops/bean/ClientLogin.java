package ht.gouv.faes.sgops.bean;


 
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
@ManagedBean 
@SessionScoped 
public class ClientLogin implements Serializable{
//    private String username;
//     private String password;
//     private String registrationPasswordConfirm;
//     RegistreBean registreBean;
//        public ClientLogin(){
//            
//            if(ReadCookie("username")!=null) {
//                this.rememberMe = ((ReadCookie("rememberMe").equals("true")) ?  true : false);
//               username =   ((this.rememberMe==true) ?  ReadCookie("username") : "");
//              
//            }
//         }
// 	
// 
//
//    public boolean isUserLoggedIn() {
//        return UserLoggedIn;
//    }
//
//    public void setUserLoggedIn(boolean UserLoggedIn) {
//        this.UserLoggedIn = UserLoggedIn;
//    }
//
//   
//    public String getRegistrationPasswordConfirm() {
//        return registrationPasswordConfirm;
//    }
//
//    public void setRegistrationPasswordConfirm(String registrationPasswordConfirm) {
//        this.registrationPasswordConfirm = registrationPasswordConfirm;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public RegistreBean getRegistreBean() {
//        return registreBean;
//    }
//
//    public void setRegistreBean(RegistreBean registreBean) {
//        this.registreBean = registreBean;
//    }
//
////     public void Save(String username, String password, int organismeId){
////        Calendar cal;
////       TUtilisateurs u = new TUtilisateurs();
////         cal = Calendar.getInstance();
////         u.setUsername(username);
////         u.setCreeLe(cal.getTime());
////        u.setPassword(password);
////        u.setOrganismeId(organismeId);
////         UtilisateurDAO udao = new UtilisateurDAO();
//// 
////             if(udao.save(u)) {
////           System.out.println("Initialisation avec succès");
////            
////       } else {
////                 System.out.println("Erreur de Soublon");
////             }
//////       }
////      
//////       catch(SQLException e){
//////            System.out.println(username + " existe Déja " + e.toString());
//////       }
//////       catch(Exception ex) {
//////         System.out.println(ex.toString());    
//////       }
////       
////         
////   }
//  @PostConstruct
//public void init() {
//         //  Save("admin","admin",1);
//           // Save("Paul","Paul",1);
//}
//
//    
//    
//  private boolean isValidate() {
//       UtilisateurDAO  uDAO= new UtilisateurDAO();
//       TUtilisateurs userToFind= new TUtilisateurs();
//        TUtilisateurs userFind;
//         BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
//      // String encryptedPassword = passwordEncryptor.encryptPassword(_user.getPassword());
//      
//      try {
//           userToFind.setUsername(username);
//          userFind = uDAO.find(userToFind);
//          UserLoggedIn  = passwordEncryptor.checkPassword(password,userFind.getPassword()) ?    true :  false;
//        
//      }
//       catch (Exception ex){
//           System.out.println("Erreur : " + ex.toString());
//          this.UserLoggedIn = false;
//      }
//     
//       return this.UserLoggedIn;
//  }
//
//   
//
//    public boolean isRememberMe() {
//        return rememberMe;
//    }
//
//    public void setRememberMe(boolean rememberMe) {
//        this.rememberMe = rememberMe;
//    }
//  
//   public void rememberMePlease(){ 
//       this.rememberMe=false;
//       this.username= "";
//         SaveCookie("rememberMe",Remember2String(rememberMe));
//         SaveCookie("username",username);
//   }
//   public String login() {
//		RequestContext context = RequestContext.getCurrentInstance();
//		FacesMessage msg;
//                String outcome ;
////		 HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();  
////		 HttpSession session = request.getSession(true);
//		if(isValidate()==true) {
//			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
//                          outcome = "app?faces-redirect=true&amp;includeViewParams=true";
//                          
//		} else {
//		   msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
//                       outcome = "error?faces-redirect=true&amp;includeViewParams=true";
//		}
//          
//               FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("isLogin", UserLoggedIn );
//	       FacesContext.getCurrentInstance().addMessage(null, msg);
//              
//              SaveCookie("rememberMe",Remember2String(rememberMe));
//              SaveCookie("username",username);
//              context.addCallbackParam("loggedIn",  UserLoggedIn);
//           return outcome;
//	}
// 
//   
//    private void SaveCookie(String cookie_name, String value){
//         HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
//          Cookie cookie = new Cookie(cookie_name,value);
//          cookie.setMaxAge(3600);     
//          cookie.setPath("/");
//         response.addCookie(cookie);
//       
//   }
//   private String ReadCookie(String cookie_name){
//        String cookieValue="";
//         HttpServletRequest request =    (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();   
//          Cookie[] cookies =  request.getCookies();//       new Cookie(cookie_name,value);
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
//     public String logout() {
//        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
//           UserLoggedIn=false; 
//        username=""; 
//        password=""; 
//        return "login?faces-redirect=true";
//    }
//     
//     // Variables
//    
	private boolean UserLoggedIn; 
        private boolean rememberMe = false;
     
}
						