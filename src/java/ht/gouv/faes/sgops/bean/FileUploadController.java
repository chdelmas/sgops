/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class FileUploadController {
    File file;
    private static final int BUFFER_SIZE = 6124;
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
   
    public void uploadFile(FileUploadEvent event) {
         byte[] files = event.getFile().getContents();

         System.out.println("MADE IT INTO FILE UPLOAD !!! ");
    }

    
    public void upload(FileUploadEvent event) throws IOException {
        String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
         String name = fmt.format(new Date())+ event.getFile().getFileName().substring(event.getFile().getFileName().lastIndexOf('.'));
         File file = new File(path + "uploads" + name);
         InputStream is = event.getFile().getInputstream();
         OutputStream out = new FileOutputStream(file);
         byte buf[] = new byte[1024];
         int len;
         while ((len = is.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
         is.close();
         out.close();
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
    
 public void handleFileUpload(FileUploadEvent event){
        ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();

        File result = new File(extContext.getRealPath("//uploads//files//"+event.getFile().getFileName()));
        System.out.println(extContext.getRealPath("//uploads//files//"+event.getFile().getFileName()));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(result);
            byte[] buffer = new byte[BUFFER_SIZE];
            int bulk;
            InputStream inputStream = event.getFile().getInputstream();
            while(true){
                bulk = inputStream.read(buffer);
                if (bulk < 0){
                    break;
                }
                fileOutputStream.write(buffer,0,bulk);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            inputStream.close();
            FacesMessage msg = new FacesMessage("File Description", "file name: " + event.getFile().getFileName() +" File size: "+ event.getFile().getSize()/1024 +" Kb Content type: "+ event.getFile().getContentType() + " the file was uploaded.");
        } catch(IOException e){
            FacesMessage error = new FacesMessage(FacesMessage.SEVERITY_ERROR, " the files were not uploaded!", "");
            FacesContext.getCurrentInstance().addMessage(null, error);
        }
    }

//public void oncapture(CaptureEvent captureEvent) {
//        byte[] data = captureEvent.getData();
//        
//FacesContext.getCurrentInstance().getExternalContext().getContext();
// String  newFileName  =  servletContext.getRealPath("")  +  File.separator  + "photocam" + File.separator + "captured.png";
//FileImageOutputStream  imageOutput;
// try  {
//	 	 	 imageOutput  =  new  FileImageOutputStream(new  File(newFileName));
//imageOutput.write(data,  0,  data.length);
//imageOutput.close();
//	 	 }
//        catch(Exception e) {
//	 	 	 throw  new  FacesException("Error  in  wri   ting  captured  image.");
//	 	 }
//    }

}

