/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr_;

import java.util.ArrayList;
import java.lang.Math; 


/**
 * Agregar clase Aritmetica
 * Dataset
 * Regresion para 2 tenicas de ajuste de curva que es la  clase padre y hereda a las clases simple y multiple
 * @author Adrian Estevez
 */
public class MLR {
    ArrayList<Double> ds_Xi1=new ArrayList<Double>();
    ArrayList<Double> ds_Xi2=new ArrayList<Double>();
    ArrayList<Double> ds_Yi=new ArrayList<Double>();
    
    Arithmetic arithmetic = new Arithmetic();
    

    public MLR(){
        addData();
    }
    public double wrtBzero(){
        double result=0;
        double numerator=0;
        double denominator=0;
        numerator=((sumYi()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2Yi())+(sumXi2()*sumXi1Yi()*sumXi1Xi2()))-((sumXi2Yi()*sumX2i1()*sumXi2())+(sumXi1Xi2()*sumXi1Xi2()*sumYi())+(sumX2i2()*sumXi1Yi()*sumXi1()));
        denominator=DS();
        //System.out.println("\n B0 N "+numerator+" D"+denominator);
        result=numerator/denominator;
        return result;
    }

    public double wrtBone(){
        double result=0;
        double numerator=0;
        double denominator=0;
        numerator=((ds_Xi1.size()*sumXi1Yi()*sumX2i2())+(sumYi()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi2Yi()))-((sumXi2()*sumXi1Yi()*sumXi2())+(sumXi2Yi()*sumXi1Xi2()*ds_Xi1.size())+(sumX2i2()*sumXi1()*sumYi()));
        denominator=DS();
        //System.out.println("\n B1 N "+numerator+" D "+denominator);
        result=numerator/denominator;
        return result;
    }
    public double wrtBtwo(){
        double result=0;
        double numerator=0;
        double denominator=0;
        numerator=((ds_Xi1.size()*sumX2i1()*sumXi2Yi())+(sumXi1()*sumXi1Yi()*sumXi2())+(sumYi()*sumXi1()*sumXi1Xi2()))-((sumXi2()*sumX2i1()*sumYi())+(sumXi1Xi2()*sumXi1Yi()*ds_Xi1.size())+(sumXi2Yi()*sumXi1()*sumXi1()));
        denominator=DS();
        result=numerator/denominator;
        return result;
    }
    //determinat of the system
    public double DS(){
        return ((ds_Xi1.size()*sumX2i1()*sumX2i2())+(sumXi1()*sumXi1Xi2()*sumXi2())+(sumXi2()*sumXi1()*sumXi1Xi2()))-((sumXi2()*sumX2i1()*sumXi2())+(sumXi1Xi2()*sumXi1Xi2()*ds_Xi1.size())+(sumX2i2()*sumXi1()*sumXi1()));
    }
    public double sumX2i1(){
        double val= arithmetic.sumX2i1(ds_Xi1);
        return val;
    }
    public double sumX2i2(){
        double val = arithmetic.sumX2i2(ds_Xi2);
        return val;
    }
    public double sumXi1Xi2(){
       double val=arithmetic.sumXi1Xi2(ds_Xi2, ds_Xi1);
       return val; 
    }
    
    public double sumXi2Yi(){
        double val=arithmetic.sumXi2Yi(ds_Xi2, ds_Yi);
        return val;
    }
    
    public double sumXi1Yi(){
        double val=arithmetic.sumXi1Yi(ds_Xi1, ds_Yi);
        return val;
    }
    
    public double sumXi1(){
        double val=arithmetic.sumXi1(ds_Xi1);
        return val;
    }
    
    public double sumXi2(){
        double val=arithmetic.sumXi2(ds_Xi2);
        return val;
    }
    public double sumYi(){
        double val=arithmetic.sumYi(ds_Yi);
        return val;
    }
    public void addData(){
        
        Dataset dataset = new Dataset();
        
        ds_Xi1 = dataset.addXi1();
        ds_Xi2 = dataset.addXi2();
        ds_Yi = dataset.addYi1();
        
    }
    /*public static void main(String[]args){
        MLR obj1=new MLR();
        double x1=71.1;
        double x2=32.1;
        double val=0;
        System.out.println("xi1 "+obj1.sumXi1());
        System.out.println("xi2 "+obj1.sumXi2());
        System.out.println("yi "+obj1.sumYi());
        System.out.println("x2i1 "+obj1.sumX2i1());
        System.out.println("x2i2 "+obj1.sumX2i2());
        System.out.println("xi1*xi2 "+obj1.sumXi1Xi2());
        System.out.println("xi2*yi "+obj1.sumXi2Yi());
        System.out.println("xi1*yi "+obj1.sumXi1Yi());
        
        System.out.println("\n");        
        System.out.println("+DS "+obj1.DS());
        
        System.out.println("+B0 "+obj1.wrtBzero());
        System.out.println("+B1 "+obj1.wrtBone());
        System.out.println("+B2 "+obj1.wrtBtwo());
        val=obj1.wrtBzero()+(obj1.wrtBone()*x1)+(obj1.wrtBtwo()*x2);
        System.out.println("y "+val);
    }*/
}
