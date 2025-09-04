/*Write a java program to create an Interface that consists of two methods called accept() and display(). Accept the three numbers from user and
display the max value from that three numbers on the command prompt*/

import java.io.*;

interface max
{
	public void accept();
	public void display();

}
class pqr implements max
{
	int a=0;
	int b=0;
	int c=0;
	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("\n Enter First Number:");
			a=Integer.parseInt(br.readLine());

			System.out.println("\n Enter Second Number:");
			b=Integer.parseInt(br.readLine());

			System.out.println("\n Enter Third Number:");
			c=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}
	public void display()
	{
		if(a>b & b>c)
		{
			System.out.println("\n Max number from three="+a);
		}
		else if(b>a & b>c)
		{
			System.out.println("\n Max number from three="+b);
		}
		else
		{
			System.out.println("\n Max number from three="+c);
		}
	}
}
class labq11
{
	public static void main(String aa[])
	{
		pqr p=new pqr();
		p.accept();
		p.display();
	}

}