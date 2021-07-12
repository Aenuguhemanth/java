import javax.swing.JOptionPane;
import java.io.*;
import java.lang.Math;
class Solution
{  	int a,b,c,desc;  	double r1,r2;
  	void  solve()
   	{    	desc=b*b-4*a*c;
     		if(desc>0)				
      		{       	r1=(-b+Math.sqrt(desc))/(2.0*a);
        			r2=(-b -Math.sqrt(desc))/(2.0*a);
        			JOptionPane.showMessageDialog(null,"roots are un equal " +r1+" "+r2);
       		}
      		else if(desc==0)
       		{	r1=r2=-b/(2.0*a);
        			JOptionPane.showMessageDialog(null,"roots are equal "+r1+" "+r2);
       		}
      		else
       		{        	JOptionPane.showMessageDialog(null,"there are no real solutions");  
        		}
    	}
 	void  input()
   	{     	String n1,n2,n3;
      		n1=JOptionPane.showInputDialog("enter a value :");
      		a=Integer.parseInt(n1);
n2=JOptionPane.showInputDialog("enter b value :");
b=Integer.parseInt(n2);
       		n3=JOptionPane.showInputDialog("enter c value :");
      		c=Integer.parseInt(n3);
   	}
}
class Quadratic
{	 
public static void main(String args[])
 	{	
	Solution s=new Solution();
  		s.input();
  		s.solve();
  	}
}
