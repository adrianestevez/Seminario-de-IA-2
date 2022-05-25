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
public class Arithmetic {
    
    public Arithmetic(){}
    
    public double sumX2i1(ArrayList<Double> ds_Xi1){
        double val= 0;
        for(int it=0;it<ds_Xi1.size();it++){
            val +=Math.pow(ds_Xi1.get(it),2);
            //System.out.println("it "+it+" get "+ds_Xi1.get(it)+" pow "+Math.pow(ds_Xi1.get(it),2) +" inside "+val);
        } 
        return val;
    }
    
    public double sumX2i2(ArrayList<Double> ds_Xi2){
        double val=0;
        for(int it=0;it<ds_Xi2.size();it++){
            val +=Math.pow(ds_Xi2.get(it),2);
           // System.out.println("it "+it+" get "+ds_Xi2.get(it)+" pow "+Math.pow(ds_Xi2.get(it),2) +" inside "+val);
        } 
        return val;
    }
    
    public double sumXi1Xi2(ArrayList<Double> ds_Xi2, ArrayList<Double> ds_Xi1){
       double val=0;
        for(int it=0;it<ds_Xi1.size();it++){
            val+=ds_Xi1.get(it)*ds_Xi2.get(it);
        }
        return val; 
    }
    
    public double sumXi2Yi(ArrayList<Double> ds_Xi2, ArrayList<Double> ds_Yi){
        double val=0;
        for(int it=0;it<ds_Xi2.size();it++){
            val+=ds_Xi2.get(it)*ds_Yi.get(it);
        }
        return val;
    }
    
    public double sumXi1Yi(ArrayList<Double> ds_Xi1, ArrayList<Double> ds_Yi){
        double val=0;
        for(int it=0;it<ds_Xi1.size();it++){
            val+=ds_Xi1.get(it)*ds_Yi.get(it);
        }
        return val;
    }
    
    public double sumXi1(ArrayList<Double> ds_Xi1){
        double val=0;
        for(int it=0;it<ds_Xi1.size();it++){
            val+=ds_Xi1.get(it);
        }
        return val;
    }
    
    public double sumXi2(ArrayList<Double> ds_Xi2){
        double val=0;
        for(int it=0;it<ds_Xi2.size();it++){
            val+=ds_Xi2.get(it);
        }
        return val;
    }
    
    public double sumYi(ArrayList<Double> ds_Yi){
        double val=0;
        for(int it=0;it<ds_Yi.size();it++){
            val+=ds_Yi.get(it);
        }
        return val;
    }
    
}
