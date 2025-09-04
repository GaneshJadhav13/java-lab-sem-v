import java.io.*;
import java.awt.*;

class xyz extends Frame
{
	Panel p;
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3,t4;

	Choice ch;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cg;
	Button b1,b2;

	public xyz()
	{
		p=new Panel();

		l1=new Label("Enter first name:");
		l2=new Label("Enter last name:");
		l3=new Label("Enter mobile number:");
		l4=new Label("Enter Adress:");
		l5=new Label("select Interests:");
		l6=new Label("select gender:");


		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);

		c1=new Checkbox("Computer");
		c2=new Checkbox("Sports");
		c3=new Checkbox("Music");

		cg=new CheckboxGroup();
		c4=new Checkbox("Male",cg,true);
		c5=new Checkbox("female",cg,false);

		b1=new Button("Submit");
		b2=new Button("Reset");

		add(p);
		p.add(l1);
		p.add(t1);

		p.add(l2);
		p.add(t2);

		p.add(l3);
		p.add(t3);

		p.add(l4);
		p.add(t4);

		p.add(l5);
		p.add(c1);
		p.add(c2);
		p.add(c3);

		p.add(l6);
		p.add(c4);
		p.add(c5);

		p.add(b1);
		p.add(b2);

		setSize(400,400);
		setVisible(true);

	}
}
class labq18
{
	public static void main(String a[])
	{
		xyz x=new xyz();
	}

}

