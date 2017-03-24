/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

/**
 *
 * @author chdelmas
 */
public class PrintSolve {
//    public void print(){
//
//        try
//        {
//        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(getObjPrintList());
//
//        String  reportPath=  FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reports/Receipt.jasper");     
//
//        JasperPrint jasperPrint=JasperFillManager.fillReport(reportPath,getReportParameters(), beanCollectionDataSource);  
//
//        HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
//        httpServletResponse.setContentType("application / pdf");
//        httpServletResponse.addHeader("Content-disposition", "inline; filename=Receipt_" +objPrint.getDateNp()+".pdf");
//        ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
//
//        servletOutputStream.write(JasperExportManager.exportReportToPdf(jasperPrint));
//        servletOutputStream.flush();
//        servletOutputStream.close();
//        FacesContext.getCurrentInstance().renderResponse();
//        FacesContext.getCurrentInstance().responseComplete();
//        }
//        catch(JRException e){
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
