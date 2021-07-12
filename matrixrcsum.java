import java.util.*;
import javax.swing.*;
class Matrixrcsum
{	public static void main(String args[])
	{	int i,j,rsum,csum,totsum=0;
		String s1,t=" ";
		int x[][]=new int[3][3];
		s1=JOptionPane.showInputDialog("enter 9 eles in x :");
		StringTokenizer t1=new StringTokenizer(s1);
		while(t1.hasMoreTokens())
		{	for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				x[i][j]=Integer.parseInt(t1.nextToken());
		}
		for(i=0;i<3;i++)
		{	rsum=0;
			for(j=0;j<3;j++)
			{	t= t + x[i][j] + "   ";
				rsum = rsum + x[i][j];
			}
			t= t + rsum + "\n";
			totsum= totsum+rsum;
		}
		for(i=0;i<3;i++)
		{	csum=0;
			for(j=0;j<3;j++)
			{	csum = csum + x[j][i];
			}
			t= t + csum + "   ";
			totsum= totsum+csum;
		}
		t = t + totsum;
		JOptionPane.showMessageDialog(null, "Mat r c sum : \n" + t);
	}
}
