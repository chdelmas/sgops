package ht.gouv.faes.sgops.bean;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chdelmas
 */
public class MediaController {
  
    private StreamedContent media; 
    private StreamedContent file; 
    private UploadedFile ufile;
       public MediaController() {
        InputStream stream = this.getClass().getResourceAsStream("song/02 - King Posse - Bot La.mp3");
        media = new DefaultStreamedContent(stream, "video/quicktime");
       }           
       public StreamedContent getMedia() {
           return media; 
       }            
       public void setMedia(StreamedContent media) { 
           this.media = media;
       }    
       
      
    private List<String> photos = new ArrayList<String>();
    
    private String getRandomImageName() {
		int i = (int) (Math.random() * 10000000);
		
		return String.valueOf(i);
	}

    public List<String> getPhotos() {
        return photos;
    }    
   

    public UploadedFile getUFile() {
        return ufile;
    }

    public void setUFile(UploadedFile file) {
        this.ufile = file;
    }

    public void upload() {
        if(ufile != null) {
            FacesMessage msg = new FacesMessage("Succesful", ufile.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }  
//    public void Save(String filename,FileUploadEvent event) {
//        String photo = getRandomImageName();
////        UploadFile ufile = new UploadFile();
////        this.photos.add(0,photo);
////        byte[] data = event.getFile()
//        
//		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//		String newFileName = servletContext.getRealPath("") + File.separator + "Projets" + File.separator + event.getFile().getFileName()+ ".png";
//		
//		FileImageOutputStream imageOutput;
//		try {
//			imageOutput = new FileImageOutputStream(new File(newFileName));
//			imageOutput.write(data, 0, data.length);
//			imageOutput.close();
//		}
//        catch(Exception e) {
//			throw new FacesException("Error in writing captured image.");
//		}
//    }
       
       
    public void FileDownloadController() {          
        InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/images/optimusprime.jpg");  
        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus.jpg");  
    }  
  
    public StreamedContent getFile() {  
        return file;  
    }       
       
       
       
}
