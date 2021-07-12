import  javax.swing.*;
import  java.io.*;
class Scanarith1	
{		
	public static void main(String args[])	
	{								
		int  x,y,a,b,c,e;	  float  d=0f;  String   s,t=" ";
				s=JOptionPane.showInputDialog("enter 1st no :");	
		x=Integer.parseInt(s);
		s=JOptionPane.showInputDialog("enter 2nd no :");
		y=Integer.parseInt(s);
		a=x+y;		b=x-y;
		c=x*y;		d=x/(float)y;
		e=x%y;
		
		t= t + "x   : " + x + " y  : " + y + "\n";
		t= t + "add :" + a + " sub : " + b + "\n";
		t= t + "mul :" + c + " div : " + d + " rem : " + e;
		JOptionPane.showMessageDialog(null,t);
	}
}


