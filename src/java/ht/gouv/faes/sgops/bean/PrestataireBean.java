/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;
import ht.gouv.faes.sgops.controller.PrestataireDAO;
import ht.gouv.faes.sgops.model.TblPrestataire;
import ht.gouv.faes.sgops.dataModel.PrestataireDataModel;
import app.util.AFileUpLoad;
import com.lowagie.text.BadElementException;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.draw.LineSeparator;
import java.awt.Color;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.component.export.ExcelOptions;
import org.primefaces.component.export.PDFOptions;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Delmas
 */
@ManagedBean
@ViewScoped
public class PrestataireBean  extends AFileUpLoad implements Serializable  {
    private static final long serialVersionUID = 1L; 
    private PrestataireDAO prestataireDAO;
    private List<TblPrestataire> listPrestataires;
    private List<TblPrestataire> listParDatePrestataires;
    
    private TblPrestataire selectedPrestataire;
    private TblPrestataire[] selectedPrestataires;
    private PrestataireDataModel prestataireDataModel;
    private int tabActiveIndex=0;
    private ExcelOptions excelOpt;
     
     // Gestion des Range de Date
     private Date dateDebut;
     private Date dateFin;
     
    private PDFOptions pdfOpt;
    
    public PrestataireBean() {
        super();
        
    prestataireDAO=new PrestataireDAO();
    this.selectedPrestataire= new TblPrestataire();
    listPrestataires = new ArrayList<>();
    listPrestataires= prestataireDAO.getAll();
    prestataireDataModel = new PrestataireDataModel(listPrestataires);
      this.selectedPrestataire= this.listPrestataires.get(0);
      customizationOptions();
      
      dateDebut = prestataireDAO.getDateDebut();
      dateFin= prestataireDAO.getDateFin();
      this.listParDatePrestataires = prestataireDAO.findByDateBetween(dateDebut, dateFin);
    }

    
    public void findByDate(){
         prestataireDAO=new PrestataireDAO();
        // Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
         this.setDateDebut(dateDebut);
         this.setDateFin(dateFin);
         this.listParDatePrestataires = prestataireDAO.findByDateBetween(this.getDateDebut(), this.getDateFin());
         
    }
    
    // Manage Event
    public void onRowSelect(SelectEvent event){
         
        
        int select;
        this.selectedPrestataire =(TblPrestataire) event.getObject();
        select = this.selectedPrestataire.getPrestataireId();
 
        FacesMessage msg=new FacesMessage("Prestataire ",((TblPrestataire) event.getObject()).getPrestataireFirme()+ " Sélectionner");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public String onRowSelectNavigate(SelectEvent event){
    FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedTblPrestataire", event.getObject());
    return "editBureau?faces-redirect=true";
    }
     
    
//    public void preProcessExport(Object document) {
//    if (document instanceof com.lowagie.text.Document) {
//        // ...
//    }
//}
//
//public void postProcessExport(Object document) {
//    if (document instanceof com.lowagie.text.Document) {
//        // ...
//    }
//}
//    
    public void customizationOptions() {
        excelOpt = new ExcelOptions();
        excelOpt.setFacetBgColor("#F88017");
        excelOpt.setFacetFontSize("10");
        excelOpt.setFacetFontColor("#0000ff");
        excelOpt.setFacetFontStyle("BOLD");
        excelOpt.setCellFontColor("#00ff00");
        excelOpt.setCellFontSize("8");
         
        pdfOpt = new PDFOptions();
        pdfOpt.setFacetBgColor("#F88017");
        pdfOpt.setFacetFontColor("#0000ff");
        pdfOpt.setFacetFontStyle("BOLD");
        pdfOpt.setCellFontSize("8");
    }
    
    public void preProcessPDF(Object document) throws IOException,
        BadElementException, DocumentException {
       Document pdf = (Document) document;
        pdf.open();
//            pdf.setPageSize(PageSize.LETTER);
//            pdf.setMargins(1, 1, 1, 1);
//       
//    float[] widths = { 20f, 10f, 10f, 10f, 10f, 10f, 10f, 10f,10f, 10f };
//   // pdf..setWidths(widths);
//        
        pdf.addTitle("Liste OPS");
        pdf.addAuthor("SGOPS");
        pdf.addSubject("List des OPS");
        pdf.addHeader("Info", "Liste des OPS");
        pdf.addCreationDate();
     // pdf.add(Image.getInstance(logo));
         
        
        Paragraph paragraph = new Paragraph("Liste des OPS",FontFactory.getFont(FontFactory.HELVETICA,14 , Font.BOLD, new Color(0, 0, 0)));
         paragraph.setAlignment(Element.ALIGN_CENTER);
         pdf.add(paragraph);
         Paragraph p = new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA,14 , Font.BOLD, new Color(0, 0, 0)));
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        // Left with indentation
       // paragraph = new Paragraph( "This is left aligned text with indentation");
        p.setAlignment(Element.ALIGN_LEFT);
       // paragraph.setIndentationLeft(50);
         LineSeparator line = new LineSeparator();
        line.setOffset(-2);
        p.add(new Chunk(line));
        paragraph.setAlignment(Element.ROW);
        // Chunk c = new Chunk(separator);
        //paragraph.add(c);
        pdf.add(p);
        pdf.add(Chunk.NEWLINE );
        pdf.add(Chunk.NEWLINE );
    
        
//           ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//        String logo = externalContext.getRealPath("") + File.separator + "resources" + File.separator + "common" + File.separator + "images" + File.separator + "faes.jpg";
//         
//        pdf.add(Image.getInstance(logo));         
          
}      
    
    protected void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    //getters and setters

    public PrestataireDAO getPrestataireDAO() {
        return prestataireDAO;
    }

    public void setPrestataireDAO(PrestataireDAO prestataireDAO) {
        this.prestataireDAO = prestataireDAO;
    }

    public List<TblPrestataire> getListPrestataires() {
        return listPrestataires;
    }

    public void setListPrestataires(List<TblPrestataire> listPrestataires) {
        this.listPrestataires = listPrestataires;
    }

    public TblPrestataire getSelectedPrestataire() {
        return selectedPrestataire;
    }

    public void setSelectedPrestataire(TblPrestataire selectedPrestataire) {
        this.selectedPrestataire = selectedPrestataire;
    }

    public TblPrestataire[] getSelectedPrestataires() {
        return selectedPrestataires;
    }

    public void setSelectedPrestataires(TblPrestataire[] selectedPrestataires) {
        this.selectedPrestataires = selectedPrestataires;
    }

    public PrestataireDataModel getPrestataireDataModel() {
        return prestataireDataModel;
    }

    public void setPrestataireDataModel(PrestataireDataModel prestataireDataModel) {
        this.prestataireDataModel = prestataireDataModel;
    }

    public int getTabActiveIndex() {
        return tabActiveIndex;
    }

    public void setTabActiveIndex(int tabActiveIndex) {
        this.tabActiveIndex = tabActiveIndex;
    }

    public ExcelOptions getExcelOpt() {
        return excelOpt;
    }

    public void setExcelOpt(ExcelOptions excelOpt) {
        this.excelOpt = excelOpt;
    }

    public PDFOptions getPdfOpt() {
        return pdfOpt;
    }

    public void setPdfOpt(PDFOptions pdfOpt) {
        this.pdfOpt = pdfOpt;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = prestataireDAO.getDateFin();
    }

    public Date getDateFin() {
        return prestataireDAO.getDateFin();
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<TblPrestataire> getListParDatePrestataires() {
        return listParDatePrestataires;
    }

    public void setListParDatePrestataires(List<TblPrestataire> listParDatePrestataires) {
        this.listParDatePrestataires = listParDatePrestataires;
    }
    
 
    
       
}