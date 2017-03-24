package ht.gouv.faes.sgops.objectHandle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.activation.MimetypesFileTypeMap;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author chdelmas
 */
public abstract class AFileUpload {
     private String filename; 
     private StreamedContent streamFile;
     private StreamedContent image = null;
     private String destination="uploads";
     private String realPath ;
     private String tempPath="/temp";
     private static final int BUFFER_SIZE =8 * 1024;
     MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
     public AFileUpload() {
          ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();
          realPath = extContext.getRealPath("") + File.separator + destination + File.separator + "files";
     }
  
   public static String getFileExtension(String filePath)
    {
        File f = new File(filePath);
        String name = f.getName();
        int k = name.lastIndexOf(".");
        String ext = null;
        if(k != -1)
            ext = name.substring(k + 1, name.length());
        return ext;
    }
     
     //   image = new DefaultStreamedContent(stream, "image/jpeg");
      
public void handleFile(FileUploadEvent e){
     try {
            UploadedFile file = e.getFile();
            InputStream stream = this.getClass().getResourceAsStream(file.getFileName());
           // String mimeType = MimeTypes.getMimeType(getFileExtension(file.getFileName()));
            //mimeTypesMap.getContentType(fileName)
            // streamFile= new DefaultStreamedContent(stream, mimeType);
            streamFile= new DefaultStreamedContent(stream,  mimeTypesMap.getContentType(file.getFileName()));
        } catch (Exception ex) {
      }           
}

    public void handlePDF(FileUploadEvent e){
         try {
            UploadedFile file = e.getFile();
            InputStream stream = this.getClass().getResourceAsStream(file.getFileName());
                      
             streamFile= new DefaultStreamedContent(stream, "application/pdf");
        } catch (Exception ex) {
        }
 }

   

    public void upload(FileUploadEvent event) {  
        FacesMessage msg ;
         // Do what you want with the file        
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
            msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");  
          } catch (IOException e) {
              msg = new FacesMessage("Erreur ! ", event.getFile().getFileName() + " is uploaded.");  
            e.printStackTrace();
        }
           FacesContext.getCurrentInstance().addMessage(null, msg);
      }  

    public void copyFile(String fileName, InputStream in) {
           try {
               // write the inputStream to a FileOutputStream
                OutputStream out = new FileOutputStream(new File(realPath + File.separator + fileName));
                int read = 0;
                byte[] bytes = new byte[1024];
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
             
                in.close();
                out.flush();
                out.close();
             
                System.out.println("New file created!");
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
    }     
    
     public void handleFileUpload(FileUploadEvent event){
        ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();
         File result = new File(realPath + File.separator+ event.getFile().getFileName());
        filename= extContext.getRealPath(realPath + File.separator + event.getFile().getFileName());
       
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
            e.printStackTrace();
            FacesMessage error = new FacesMessage(FacesMessage.SEVERITY_ERROR, " the files were not uploaded!", "");
            FacesContext.getCurrentInstance().addMessage(null, error);
        }
    }
    
      public void handle_FileUpload(FileUploadEvent event) {
        try {
            File targetFolder = new File(realPath+ File.separator + "files" + File.separator);
            InputStream inputStream = event.getFile().getInputstream();
            OutputStream out = new FileOutputStream(new File(targetFolder, event.getFile().getFileName()));
            //fileCopy1()
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
      
    public static void fileCopy1(String src, String dst) {
        try {
                FileInputStream in = new FileInputStream(new File(src));
                FileOutputStream out = new FileOutputStream(new File(dst));
                byte[] buffer = new byte[1024];
                int count = 0;
                do {
                    out.write(buffer, 0, count);
                    count = in.read(buffer, 0, buffer.length);
                    }
                while (count != -1);
                    in.close();
                    out.close();
                    } catch (IOException ex) {}
           }  
   
   public static void fileCopy2(String src, String dst) {
        try {
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst));
                byte[] buffer = new byte[8 * 1024];
                int count;
                    while ((count = in.read(buffer)) >= 0) {
                            out.write(buffer, 0, count);
                        }
                    in.close();
                out.close();
            } catch (IOException ex) {}
        }  
      
    public void FileDownloadController() {          
        InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/images/optimusprime.jpg");  
       streamFile = new DefaultStreamedContent(stream, "image/jpg");  
    }  
    
    
    public boolean Save(byte[]  stream) {
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		String newFileName = servletContext.getRealPath("") + File.separator + "images" + File.separator + "barca" + File.separator+ "croppedImage.jpg";
		boolean ret=false;
		FileImageOutputStream imageOutput;
		try {
			imageOutput = new FileImageOutputStream(new File(newFileName));
			imageOutput.write(stream, 0, stream.length);
			imageOutput.close();
                        ret=true;
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		
		return ret;
	}
    
    public void demoCreateFoler(){
        for(int i=0;i<=10;i++){
            CreateFolder("Colonie" + String.valueOf(i));
        }
    }
    public boolean CreateFolder(String folderName){
            ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		String dossier = servletContext.getRealPath("") + File.separator + "uploads" +  File.separator + folderName;
                File file = new File(dossier);
                  if(file.mkdir()==true){
                      System.out.println(dossier + " Cree");
                      return true;   
                   } else
                       
                       return false;
        }
    
    
     public void upload2(FileUploadEvent event) throws IOException {
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
    
 public void handleFileUpload2(FileUploadEvent event){
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
 
 private String readFileAsString(String filePath) throws java.io.IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
        return fileData.toString();
    }
//
// public StreamedContent getImage() throws SQLException {
//    Blob imgBlob;
//    try
//    {
//     //Select the blob from your database here. Use a PreparedStatement (I'll call it stmt here) for this.
//     
//     ResultSet res = stmt.executeQuery();
//     res.next();
//     imgBlob = res.getBlob("columnName");
//    }
//    catch(SQLException e){ throw e; }
//    byte[] img=imgBlob.getBytes(1, imgBlob.length()); //Get the blob as a byte array
//    InputStream in = new ByteArrayInputStream(img);
//    StreamedContent  image = new DefaultStreamedContent(in,"image/jpeg");
//    return image;
//}
 
//     public void dynamicTeacherImageController() {
//
//        InputStream stream;
//        stream = new ByteArrayInputStream(navigation.getCurrentImage()
//                .getImage());
//        teacherImage = new DefaultStreamedContent(stream, "image/png");
//    }

    //Getter / Setter
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public StreamedContent getStreamFile() {
        return streamFile;
    }

    public void setStreamFile(StreamedContent streamFile) {
        this.streamFile = streamFile;
    }

    public StreamedContent getImage() {
        return image;
    }

    public void setImage(StreamedContent image) {
        this.image = image;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
        
}
