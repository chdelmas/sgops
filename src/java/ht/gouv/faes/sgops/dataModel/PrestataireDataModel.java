/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.dataModel;

import ht.gouv.faes.sgops.model.TblPrestataire;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author chdelmas
 */
@SuppressWarnings("unchecked")
   public class PrestataireDataModel extends ListDataModel<TblPrestataire> implements SelectableDataModel<TblPrestataire> {
     public PrestataireDataModel() {
        
    }

    public PrestataireDataModel(List<TblPrestataire> data) {
        super(data);
    }
    
    @Override
    public TblPrestataire getRowData(String rowKey) {
     
      List<TblPrestataire>  opsList=  (List<TblPrestataire>)this.getWrappedData();

        
        for(TblPrestataire ops : opsList) {
            if(ops.getPrestataireId().toString().equals(rowKey))
                return ops;
        }
        
        return null;
    }

    @Override
    public Object getRowKey(TblPrestataire ops) {
        return ops.getPrestataireId();
    }
}
                    