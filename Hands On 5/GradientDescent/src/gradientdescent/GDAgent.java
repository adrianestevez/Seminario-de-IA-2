/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradientdescent;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author Adrian Estevez
 */
public class GDAgent extends Agent{
    public GD obj1;
    double b0=0;
    double b1=0;
    int res=0;
    
    private double [] x = {23,26,30,34,43,48,52,57,58};
    private double [] y = {651,762,856,1063,1190,1298,1421,1440,1518};
    
    protected void setup(){
        
        obj1=new GD();
        
        obj1.setX(x);
        obj1.setY(y);
        b0 = obj1.getB0();
        b1=obj1.getB1();
    }
    
    public void predition(final int v1){
        addBehaviour(new OneShotBehaviour(){
            public void action(){
                System.out.println("B0: " + b0 + " B1: " + b1);
            }
        });
    }
}
