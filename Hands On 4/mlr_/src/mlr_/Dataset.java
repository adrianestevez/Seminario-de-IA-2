/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr_;

import java.util.ArrayList;

/**
 *
 * @author Adrian Estevez
 */
public class Dataset {
    
    ArrayList<Double> ds_Xi1=new ArrayList<Double>();
    ArrayList<Double> ds_Xi2=new ArrayList<Double>();
    ArrayList<Double> ds_Yi=new ArrayList<Double>();
    
    public Dataset(){}
    
    public ArrayList<Double> addXi1(){
        
        ds_Xi1.add(23.0);
        ds_Xi1.add(26.0);
        ds_Xi1.add(30.0);
        ds_Xi1.add(34.0);
        ds_Xi1.add(43.0);
        ds_Xi1.add(48.0);
        ds_Xi1.add(52.0);
        ds_Xi1.add(57.0);
        ds_Xi1.add(58.0);
        
        
        return ds_Xi1;
    }
    
    public ArrayList<Double> addXi2(){
        
        
        ds_Xi2.add(1.0);
        ds_Xi2.add(2.0);
        ds_Xi2.add(3.0);
        ds_Xi2.add(4.0);
        ds_Xi2.add(5.0);
        ds_Xi2.add(6.0);
        ds_Xi2.add(7.0);
        ds_Xi2.add(8.0);
        ds_Xi2.add(9.0);
        
        
        return ds_Xi2;
    }
    
    public ArrayList<Double> addYi1(){
        
        ds_Yi.add(651.0);
        ds_Yi.add(762.0);
        ds_Yi.add(856.0);
        ds_Yi.add(1063.0);
        ds_Yi.add(1190.0);
        ds_Yi.add(1298.0);
        ds_Yi.add(1421.0);
        ds_Yi.add(1440.0);
        ds_Yi.add(1518.0);
        
        
        return ds_Yi;
    }
    
    
    
}
