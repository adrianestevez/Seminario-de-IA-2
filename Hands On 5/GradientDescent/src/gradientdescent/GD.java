/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradientdescent;

/**
 *
 * @author Adrian Estevez
 */
public class GD {
    private double [] x = {23,26,30,34,43,48,52,57,58};
    private double [] y = {651,762,856,1063,1190,1298,1421,1440,1518};
		
    private double B0 =0;
    private double B1 =0;
    private double alfha =0.0005;
    private double presicion =0.001;
    private double error =0.0;
    
    
    public void setX(double[] x)
    {
        this.x = x;
        calculate();	
    } 
		
    public void setY(double[] y)
    {
        this.y = y;
	calculate();
    }
		
    public double getB0()
    {
        return B0;
    }		

    public double getB1()
    {
        return B1;
    }
                
    public void calculate()
    {
        int count = 0;
        while(calculateError() > presicion)
	{
            B0 -= (calculateB0() * alfha);
            B1 -= (calculateB1() * alfha);

            System.out.println("Error: "+error);
				
            count++;
	}
        
        System.out.println("Beta 0: "+B0);
	System.out.println("Beta 1: "+B1);
	System.out.println("Numero de Iteraciones: "+count);
    }
    
    public double calculateError()
    {
        double E = 0;
	for(int i=0; i<x.length; i++)
        {
            E = E + (y[i] - (B0 + (B1 * x[i])));
            error=E;
	}
	return (E*E) * 1.0/9;
    }
		
    public double calculateB0()
    {
        double DB0 = 0;
	for(int i=0; i<x.length; i++)
	{
            DB0 += (y[i] - (B0 + (B1 * x[i])));
	}
	return (-2.0/9) * DB0;
    }
    
    public double calculateB1()
    {
        double DB1 = 0;
	for(int i=0; i<x.length; i++)
	{
            DB1 += x[i] * (y[i] - (B0 + (B1 * x[i])));
	}
	return (-2.0/9) * DB1;
    }
}
