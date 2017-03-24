/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author chdelmas
 */
public class StreamedContent {
    private  StreamedContent image = null;

    public StreamedContent getImage() {
        return image;
    }

    public void setImage(StreamedContent image) {
        this.image = image;
    }

//public void enterImage(FileUploadEvent e) {
//        try {
//            UploadedFile file = e.getFile();
//            
//           image = new  DefaultStreamedContent(file.getInputstream(), "image/jpeg");
//        } catch (Exception ex) {   }
//}

        
}
