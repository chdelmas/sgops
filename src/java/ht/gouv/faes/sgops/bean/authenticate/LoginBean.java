package ht.gouv.faes.sgops.bean.authenticate;

 
import ht.gouv.faes.sgops.controller.UtilisateurDAO;
import ht.gouv.faes.sgops.model.TblAdmComptes;
import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.persistence.Transient;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
@ManagedBean 
@RequestScoped 
public   class LoginBean implements Serializable{
    private static final long serialVersionUID = 1L; 
    private LoginUser loginUser;
    private String username;
    private String password;
    private TblAdmComptes utilisateur;
     private HttpSession session;
    private static final Logger log = Logger.getLogger(LoginBean.class.getName());
    
	private boolean UserLoggedIn; 
        private boolean rememberMe = false;
        private List<SelectItem> languageItems; 
     @Transient
       private  UtilisateurDAO  uDAO=null; 
        
     FacesContext ctx ;
     Locale locale, currentLocale ;
     ResourceBundle rb;
     ResourceBundle messages;
     String value;
     String langue ;
     
    
    public void Save(String username, String password, int organismeId,String courriel){
        Calendar cal;
        TblAdmComptes u = new TblAdmComptes();
        cal = Calendar.getInstance();
        u.setIdentifiant(username);
        u.setMotDePasse(password);
        
         UtilisateurDAO udao = new UtilisateurDAO();
                       
             if(udao.save(u))
             
                 {
              log.info("Initialisation avec succès");
            
       } else {
                log.warning("Erreur de doublon");
             }

       
         
   }
  @PostConstruct
public void init() {
         //  Save("admin","admin",1,"sys@dm!n");
           uDAO= new UtilisateurDAO ();
           utilisateur= new TblAdmComptes();   
           fillLanguages();
           frenchAction();
           ctx = FacesContext.getCurrentInstance();
           locale = ctx.getViewRoot().getLocale();
           
           messages = ResourceBundle.getBundle("i18n.msgs", Locale.FRANCE);
           
          String renderKitId = FacesContext.getCurrentInstance().getViewRoot().getRenderKitId();        
        if(renderKitId.equalsIgnoreCase("PRIMEFACES_MOBILE")){
            //REDIRECT TO YOUR MOBILE PAGE
        }
         
}

  public void frenchAction() {
      FacesContext context = FacesContext.getCurrentInstance();
      context.getViewRoot().setLocale(Locale.FRANCE);
      
   }
  private void fillLanguages(){
      languageItems=new LinkedList<>();
      languageItems.add(new SelectItem(1,"Francais"));
      languageItems.add(new SelectItem(1,"Anglais"));
      
  }
    
  private boolean isValidate() {
//      BasicPasswordEncryptor passwordEncryptor;
//      passwordEncryptor = new BasicPasswordEncryptor();
       this.UserLoggedIn = false;
       
       try {
           utilisateur = uDAO.find(username,password);
             if ( utilisateur != null) {
          UserLoggedIn =true;
             }
        
       }
       catch (Exception ex){
           log.log(Level.WARNING, "erreur de validation {0}", ex.toString());
           
          this.UserLoggedIn = false;
      }
     
       return this.UserLoggedIn;
  }

   

   public void rememberMePlease(){ 
       this.rememberMe=false;
       this.username= "";
         SaveCookie("rememberMe",Remember2String(rememberMe));
         SaveCookie("username",username);
   }
  
   
   private String mobileHome(){
       RequestContext context = RequestContext.getCurrentInstance();
                ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
                externalContext.invalidateSession();
		FacesMessage msg;
                String   outcome = "appMobile?faces-redirect=true&amp;includeViewParams=true";
            return outcome;
   }
   public String login() {
		RequestContext context = RequestContext.getCurrentInstance();
                ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
                externalContext.invalidateSession();
		FacesMessage msg=null;
                String outcome ;
             
                if(isValidate()==true) {
		     msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
                     outcome = "app?faces-redirect=true&amp;includeViewParams=true";
                     externalContext.getSessionMap().put("user", this.utilisateur);
                     externalContext.getSessionMap().put("username", username);
                       SaveCookie("username",username);
//                     FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", this.utilisateur);
//                     FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username", username);
                
                    } else {
		      msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
                      outcome = "error?faces-redirect=true&amp;includeViewParams=true";
                      externalContext.getSessionMap().put("user", this.utilisateur);
                      externalContext.getSessionMap().put("username", username);
//                    
                
		}
                externalContext.getSessionMap().put("isLogin", UserLoggedIn );
//               FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("isLogin", UserLoggedIn );
	       FacesContext.getCurrentInstance().addMessage(null, msg);
              
              SaveCookie("rememberMe",Remember2String(rememberMe));
              //SaveCookie("username",username);
              context.addCallbackParam("loggedIn",  UserLoggedIn);
           return outcome;
	}
 
   public void SaveCookie(String cookie_name, String value){
         HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
          Cookie cookie = new Cookie(cookie_name,value);
          cookie.setMaxAge(3600);     
          cookie.setPath("/");
         response.addCookie(cookie);
       
   }
   public String ReadCookie(String cookie_name){
        String cookieValue="";
         HttpServletRequest request =    (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();   
          Cookie[] cookies =  request.getCookies();//       new Cookie(cookie_name,value);
          if (cookies != null) {   
              for(int i=0; i<cookies.length; i++){    
                  if (cookies[i].getName().equalsIgnoreCase(cookie_name)){
                       cookieValue = cookies[i].getValue();     
                     }   
                   }  
             }
              return cookieValue;
   }
    private String Remember2String(boolean value){
                 if(value == false){
                     return  "false";
                   } 
                  else{
                   return  "true";
               }
        }
   
     public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
           UserLoggedIn=false; 
        username=""; 
        password=""; 
        return "login?faces-redirect=true";
    }
public String sendByEmail(){
    FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
           UserLoggedIn=false; 
        
        return "emailSend?faces-redirect=true";
}
    
public String sendBySMS(){
    FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
          
        return "smsSend?faces-redirect=true";
}
     // Getter and Setter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TblAdmComptes getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(TblAdmComptes utilisateur) {
        this.utilisateur = utilisateur;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public boolean isUserLoggedIn() {
        return UserLoggedIn;
    }

    public void setUserLoggedIn(boolean UserLoggedIn) {
        this.UserLoggedIn = UserLoggedIn;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public List<SelectItem> getLanguageItems() {
        return languageItems;
    }

    public void setLanguageItems(List<SelectItem> languageItems) {
        this.languageItems = languageItems;
    }

    public UtilisateurDAO getuDAO() {
        return uDAO;
    }

    public void setuDAO(UtilisateurDAO uDAO) {
        this.uDAO = uDAO;
    }

    public FacesContext getCtx() {
        return ctx;
    }

    public void setCtx(FacesContext ctx) {
        this.ctx = ctx;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Locale getCurrentLocale() {
        return currentLocale;
    }

    public void setCurrentLocale(Locale currentLocale) {
        this.currentLocale = currentLocale;
    }

    public ResourceBundle getRb() {
        return rb;
    }

    public void setRb(ResourceBundle rb) {
        this.rb = rb;
    }

    public ResourceBundle getMessages() {
        return messages;
    }

    public void setMessages(ResourceBundle messages) {
        this.messages = messages;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
     
     
}
						