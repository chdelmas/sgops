/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author chdelmas
 */
@ManagedBean
public class DashboardBean implements Serializable {

    private static final long serialVersionUID = 1L;   
    private DashboardModel model;
        
        public DashboardBean() {
                model = new DefaultDashboardModel();
                DashboardColumn column1 = new DefaultDashboardColumn();
                DashboardColumn column2 = new DefaultDashboardColumn();
                DashboardColumn column3 = new DefaultDashboardColumn();
             //   DashboardColumn column3 = new DefaultDashboardColumn();
                
                column1.addWidget("Fournisseurs");
                column1.addWidget("Collaborateurs");
                
                column2.addWidget("Consultants");
                column2.addWidget("Firmes");
                
                column3.addWidget("politique");
                column3.addWidget("Autre");

                model.addColumn(column1);
                model.addColumn(column2);
                model.addColumn(column3);
        }
        
        public void handleReorder(DashboardReorderEvent event) {
                FacesMessage message = new FacesMessage();
                message.setSeverity(FacesMessage.SEVERITY_INFO);
                message.setSummary("Reordered: " + event.getWidgetId());
                message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());
                
                addMessage(message);
        }
        
        
        private void addMessage(FacesMessage message) {
                FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
        public DashboardModel getModel() {
                return model;
        }
}