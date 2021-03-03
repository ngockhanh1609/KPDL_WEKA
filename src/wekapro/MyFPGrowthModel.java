/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.associations.FPGrowth;
import weka.core.Instances;

/**
 *
 * @author Admin
 */
public class MyFPGrowthModel  extends MyKnowledgeModel {
    Instances newData;
    FPGrowth fp;

    public MyFPGrowthModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
        this.fp=new FPGrowth();
    }

    MyFPGrowthModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    MyFPGrowthModel(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void mineAssociationRules() throws Exception{
        //loc du lieu
//        this.newData=removeData(this.dataset);
        this.newData=convert2Binary(this.dataset);
        //thiet lap thong so
        fp.setOptions(this.model_options);
        //khai pha
        fp.buildAssociations(this.newData);
    }

    @Override
    public String toString() {
        return fp.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
