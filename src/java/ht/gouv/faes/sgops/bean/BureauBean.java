/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

 

/**
 *
 * @author Hubert
 */

@ManagedBean
@ViewScoped
public class BureauBean implements Serializable{
//    private static final long serialVersionUID = 1L; 
//    private BureauDAO bureauDAO;
//    private List<TBureaux> listBureaux;
//    private TBureaux selectedBureau;
//    private TBureaux[] selectedBureaux;
//    private BureauDataModel bureauDataModel = null;
//    private ByteArrayOutputStream baos;
//    private int tabActiveIndex=0;
//    private RecordAction action;
//    private String title="Editer Bureau";
//    //private List<TFontaines> listFontaines;
//   
//   // private FontainesBean fontainesBean;
//public BureauBean() {
//    
//}
//
//@PostConstruct
//public void init(){
//    bureauDAO=new BureauDAO();
//    selectedBureau = new TBureaux();
//    listBureaux = new ArrayList<TBureaux>();
//    listBureaux=bureauDAO.getAll();
//    bureauDataModel = new BureauDataModel(listBureaux);
//    
//}
//
//
//// Manage Event
//    public void onRowSelect(SelectEvent event){
//        this.selectedBureau=new TBureaux();
//        this.selectedBureau= (TBureaux) event.getObject();
//        FacesMessage msg=new FacesMessage("TBureaux Selected",this.selectedBureau.getCodeBureau().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//        tabActiveIndex=1;
//        action = RecordAction.Actualiser;
//        title="Editer Bureau";
//        
////        ConfigurableNavigationHandler configurableNavigationHandler =
////             (ConfigurableNavigationHandler)FacesContext.
////               getCurrentInstance().getApplication().getNavigationHandler();
////       
////         configurableNavigationHandler.performNavigation("/includes/bureauEdit?faces-redirect=true");
//    
//    }
//public void onRowUnselect(UnselectEvent event) {  
//         this.selectedBureau= (TBureaux) event.getObject();
//         FacesMessage msg=new FacesMessage("TBureaux UnSelected",this.selectedBureau.getCodeBureau().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//        this.selectedBureau= new TBureaux();
//        
//    }
// 
// public Flash getFlash() {
//        // return getFacesContext().getExternalContext().getFlash();
//        return FacesContext.getCurrentInstance().getExternalContext().getFlash();
//    }
// 
//public void gotoUrl(String url){
//       
//       
//        try {
//            //redirection
//            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
//        } catch (IOException ex) {
//            //Logger.getLogger(TreeBean.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    } 
//public void postProcessXLS(Object document) {
//		HSSFWorkbook wb = (HSSFWorkbook) document;
//		HSSFSheet sheet = wb.getSheetAt(0);
//		HSSFRow header = sheet.getRow(0);
//		
//		HSSFCellStyle cellStyle = wb.createCellStyle();  
//		cellStyle.setFillForegroundColor(HSSFColor.GREEN.index);
//		cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
//		
//		for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
//			HSSFCell cell = header.getCell(i);
//			
//			cell.setCellStyle(cellStyle);
//		}
//	}
//	
//	public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
//		Document pdf = (Document) document;
//        pdf.open();
//        pdf.setPageSize(PageSize.A4);
//
//		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//		String logo = servletContext.getRealPath("") + File.separator + "images" + File.separator + "prime_logo.png";
//		
//		pdf.add(Image.getInstance(logo));
//	}
//
//
//    public int getTabActiveIndex() {
//        return tabActiveIndex;
//    }
//
//    public void setTabActiveIndex(int tabActiveIndex) {
//        this.tabActiveIndex = tabActiveIndex;
//    }
//
////Action 
//    public void save(){
//        this.bureauDAO.create(selectedBureau);
//    }
// public void newBureau(){
//    selectedBureau = new TBureaux();
//    action=RecordAction.Nouveau;
//    this.title = "Saisie Bureau";
//}
////getters and setters
//
//    public BureauDAO getBureauDAO() {
//        return bureauDAO;
//    }
//
//    public void setBureauDAO(BureauDAO bureauDAO) {
//        this.bureauDAO = bureauDAO;
//    }
//
//    public List<TBureaux> getListBureaux() {
//        return listBureaux;
//    }
//
//    public void setListBureaux(List<TBureaux> listBureaux) {
//        this.listBureaux = listBureaux;
//    }
//
//    public TBureaux getSelectedBureau() {
//        return selectedBureau;
//    }
//
//    public void setSelectedBureau(TBureaux selectedBureau) {
//        this.selectedBureau = selectedBureau;
//    }
//
//    public TBureaux[] getSelectedBureaux() {
//        return selectedBureaux;
//    }
//
//    public void setSelectedBureaux(TBureaux[] selectedBureaux) {
//        this.selectedBureaux = selectedBureaux;
//    }
//
//    public BureauDataModel getBureauDataModel() {
//        return bureauDataModel;
//    }
//
//    public void setBureauDataModel(BureauDataModel bureauDataModel) {
//        this.bureauDataModel = bureauDataModel;
//    }
//
//    public ByteArrayOutputStream getBaos() {
//        return baos;
//    }
//
//    public void setBaos(ByteArrayOutputStream baos) {
//        this.baos = baos;
//    }
//
//    public String SaisePage(){
//      return "/includes/bureauFlash?faces-redirect=true";
//    }
//
//    public RecordAction getAction() {
//        return action;
//    }
//
//    public void setAction(RecordAction action) {
//        this.action = action;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
// 
    
}
