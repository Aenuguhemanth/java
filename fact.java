import java.awt.*;
import java.awt.event.*;
public class fact extends Applet implements ActionListener
{
	String str;
	button b0;
	TextFeild t1,t2;
	label l1;
	public void intit()
	{
		panel p=new panel();
		p.setLayout(new GridLayout());
		add(new Label("enter any interger value:"));
		add (t1=new Textfield(20));
		add (t2=new Textfield(20));
		b0.addActionListener(this);
		p.setLayout(new GridLayout());
		add (new Label("factorial values is:"));
		add (b0=new Button("computer"));		
}
public void actionPerformed (ActionEvent ae)
{
	int i,n,f=1;
	n=interger.parseInt(t1.getText());
	for (i=1;i<=n;i++)
	f=f*i;
	t2.setText(String.valueOf(f));
	repaint();
}
}