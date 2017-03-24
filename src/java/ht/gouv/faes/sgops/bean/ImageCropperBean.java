/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
 
import org.primefaces.model.CroppedImage;

/**
 *
 * @author chdelmas
 */
public class ImageCropperBean {
    
private CroppedImage croppedImage;
	
	public CroppedImage getCroppedImage() {
		return croppedImage;
	}

	public void setCroppedImage(CroppedImage croppedImage) {
		this.croppedImage = croppedImage;
	}

//        public void CreateFolder(String bureau){
//            ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//		String dossier = servletContext.getRealPath("") + File.separator + "uploads" +  bureau;
//                File file = new File(dossier);
//                     file.mkdir();
//                //+ File.separator + "barca" + File.separator+ "croppedImage.jpg";
//		
//		FileImageOutputStream imageOutput;
//        }
//	public String crop() {
//		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//		String newFileName = servletContext.getRealPath("") + File.separator + "images" + File.separator + "barca" + File.separator+ "croppedImage.jpg";
//		
//		FileImageOutputStream imageOutput;
//		try {
//			imageOutput = new FileImageOutputStream(new File(newFileName));
//			imageOutput.write(croppedImage.getBytes(), 0, croppedImage.getBytes().length);
//			imageOutput.close();
//		} catch (FileNotFoundException e) {
//		} catch (IOException e) {
//		}
//		
//		return null;
//	}
}
			