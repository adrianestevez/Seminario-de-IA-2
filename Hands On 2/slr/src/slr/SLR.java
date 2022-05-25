/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slr;
import java.util.ArrayList;
import java.lang.Math; 
/**
 *
 * @author Adrian Estevez
 */
public class SLR {
    //ds_x data set X
    //ds_x data set Y
    ArrayList<Integer> ds_X=new ArrayList<Integer>();
    ArrayList<Integer> ds_Y=new ArrayList<Integer>();
    
    public SLR(){
            addData();
    }
    
    //Find Beta 1
    public int wrtBOne(){
            int result=0;
            int numerator=0;
            int denominator=0;
            numerator=ds_X.size()*sumXiYi()-sumXi()*sumYi(); 
            denominator=ds_X.size()*sumPowerXi()-sumXi()*sumXi();
           
            result=numerator/denominator;
            
            return result;
    }
    
    //Find Beta 0
    public int wrtBZero(){
            int result=0;
            int numerator=0;
            int denominator=0;
            
            numerator=sumPowerXi()*sumYi()-sumXi()*sumXiYi();
            denominator=ds_X.size()*sumPowerXi()-sumXi()*sumXi();
            result=numerator/denominator;
            return result;
    }
    public int sumXiYi(){
        int val=0;
        for(int i=0;i<ds_X.size();i++){
            val+=ds_X.get(i)*ds_Y.get(i);
        }
        return val;
        
    }
    public int sumXi(){
        int val=0;
        for(int i=0;i<ds_X.size();i++){
            val+=ds_X.get(i);
        }
        return val;
    }
    public int sumYi(){
        int val=0;
        for(int i=0;i<ds_Y.size();i++){
            val+=ds_Y.get(i);
        }
        return val;
    } 
    public int sumPowerXi(){
        int val=0;
        for(int i=0;i<ds_X.size();i++){
            val+=(int)Math.pow(ds_X.get(i),2);
        }
        return val;
    }
    public void addData(){
        /*ds_X.add(43);
        ds_X.add(21);
        ds_X.add(25);
        ds_X.add(42);
        ds_X.add(57);
        ds_X.add(59);
        
        ds_Y.add(99);
        ds_Y.add(65);
        ds_Y.add(79);
        ds_Y.add(75);
        ds_Y.add(87);
        ds_Y.add(81);
       */ 
       
        ds_Y.add(1);
        ds_Y.add(2);


        ds_X.add(2022);
        ds_X.add(2023);
    
       
    }
/*
public static void main(String[]args){
        double dt0=0;
        double dt1=0;

        SLR obj1=new SLR();
        System.out.println("x "+obj1.sumXi());
        System.out.println("y "+obj1.sumYi());
        System.out.println("xy "+obj1.sumXiYi());
        System.out.println("x2 "+obj1.sumPowerXi());
        //obj1.SLR();
        dt0=obj1.wrtBZero();
        dt1=obj1.wrtBOne();
        System.out.println("B0 "+dt0+" B1 "+dt1);
}*/

    
}
