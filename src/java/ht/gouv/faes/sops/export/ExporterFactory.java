/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sops.export;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author chdelmas
 */
public class ExporterFactory {
    
//    
//    
//    public void createPDF() {
//    try { //catch better your exceptions, this is just an example
//        FacesContext context = FacesContext.getCurrentInstance();
//        Document document = new Document();
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PdfWriter.getInstance(document, baos);
//
//        if (!document.isOpen()) {
//            document.open();
//        }
//
//        PdfPTable pdfTable = exportPDFTable();
//        document.add(pdfTable);
//
//        //Keep modifying your pdf file (add pages and more)
//
//        document.close();
//        String fileName = "PDFFile";
//
//        writePDFToResponse(context.getExternalContext(), baos, fileName);
//
//        context.responseComplete();
//
//    } catch (Exception e) {
//        //e.printStackTrace();          
//    }
//}
//    
////    private PdfPTable exportPDFTable() {
////    int numberOfColumns = 1;
////    itemOfList item = null;
////    PdfPTable pdfTable = new PdfPTable(numberOfColumns);
////    pdfTable.setWidthPercentage(100);
////    BaseFont helvetica = null;
////    try {
////        helvetica = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.EMBEDDED);
////    } catch (Exception e) {
////        //font exception
////    }
////    Font font = new Font(helvetica, 8, Font.NORMAL);
////    pdfTable.addCell(new Paragraph("columnName", font));        
////
////    for (int i = 0; i < lstPdfTable.size(); i++) { //lstPdfTable is the list from your datatable. A List of "itemOfList" type
////        item = new itemOfList();
////        item = lstPdfTable.get(i);
////        //pdfTable.addCell(new Paragraph('any_string_field', font));
////        pdfTable.addCell(new Paragraph(item.getStringField(), font));           
////    }
////    return pdfTable;
////}
////    
//    
//    private void writePDFToResponse(ExternalContext externalContext, ByteArrayOutputStream baos, String fileName) {
//    try {
//        externalContext.responseReset();
//        externalContext.setResponseContentType("application/pdf");
//        externalContext.setResponseHeader("Expires", "0");
//        externalContext.setResponseHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
//        externalContext.setResponseHeader("Pragma", "public");
//        externalContext.setResponseHeader("Content-disposition", "attachment;filename=" + fileName + ".pdf");
//        externalContext.setResponseContentLength(baos.size());
//        OutputStream out = externalContext.getResponseOutputStream();
//        baos.writeTo(out);
//        externalContext.responseFlushBuffer();
//    } catch (Exception e) {
//        //e.printStackTrace();
//    }
//}
//    
//    
}
