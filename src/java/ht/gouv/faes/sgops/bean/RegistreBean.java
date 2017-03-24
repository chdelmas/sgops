/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.sql.Blob;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class RegistreBean {
   String username;
   String password;
   String confirmPassword;
   String passKey;
   String email;
   int organismeID;
   boolean saisie;
   boolean consultation;
   boolean analyse;
   boolean parametres;
   boolean active;
   Blob photo;
   String photo_path ="/profile/profile_picture.png";
    public RegistreBean() {
       
    }

    public void validateSamePassword(ActionEvent evt) {
     // RequestContext context = RequestContext.getCurrentInstance();
    if (!confirmPassword.equals(password)){
      FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passwords do not match!", "Passwords do not match!");
          
            FacesContext.getCurrentInstance().addMessage(null, message);  
    }
    
    }
    public String Save() {
        
        
        return "UserManager";
        
    }
    
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPassKey() {
        return passKey;
    }

    public void setPassKey(String passKey) {
        this.passKey = passKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOrganismeID() {
        return organismeID;
    }

    public void setOrganismeID(int organismeID) {
        this.organismeID = organismeID;
    }

    public boolean isSaisie() {
        return saisie;
    }

    public void setSaisie(boolean saisie) {
        this.saisie = saisie;
    }

    public boolean isConsultation() {
        return consultation;
    }

    public void setConsultation(boolean consultation) {
        this.consultation = consultation;
    }

    public boolean isAnalyse() {
        return analyse;
    }

    public void setAnalyse(boolean analyse) {
        this.analyse = analyse;
    }

    public boolean isParametres() {
        return parametres;
    }

    public void setParametres(boolean parametres) {
        this.parametres = parametres;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

  

//  public void imageWrite(File file) {
//try { 
//      FileInputStream io = new FileInputStream(file);
//            String query = "insert into image(IMG) values(?)";
//               java.sql.PreparedStatement stmt = con.prepareStatement(query);
//             stmt.setBinaryStream(1, (InputStream)io,(int)file.length());
//           stmt.executeUpdate();
//}
//catch(Exception ex) {
//System.out.println(ex.getMessage());
//}
//}
  
  
//public BufferedImage getImageById(int id) {
//
//BufferedImage buffimg = null;
//try {
//    InputStream is = image.getBinaryStream(); // reading image as InputStream
//     buffimg= ImageIO.read(image); // decoding the inputstream as BufferedImage
//      int length = (int) image.length();
//  int bufferSize = 1024;
//  byte[] buffer = new byte[bufferSize];
//  while ((length = in.read(buffer)) != -1) {
//  out.write(buffer, 0, length);
//  }
//
//}
//catch(Exception ex) {
//System.out.println(ex.getMessage());
//}
//return buffimg;
//}

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }


}
