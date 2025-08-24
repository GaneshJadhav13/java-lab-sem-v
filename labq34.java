/*Write a java program to accept the number from user and if
the number is zero then throw the user defined exception
“This number is 0 ” and if the number is not 0 then display
the addition of first and last digit of that number on the
command prompt*/

import java.io.*;

class zero extends Exception
{
	public void display()
	{
		System.out.println("\n Number is Zero (0)");
	}

}
class xyz
{
	int a=0;
	int lastdigit;
	int firstdigit;
	int add;
	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

			System.out.println("\n Enter number:");
			a=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	public void check()
	{
		try
		{
			if(a==0)
			{
				throw new zero();
			}
			else
			{
				lastdigit=a%10;

				while(a>=10)
				{
					a=a/10;
				}
				firstdigit=a;
				add=lastdigit+firstdigit;
				System.out.println("\n Addition of last and first digit="+add);
			}
		}
		catch(zero z)
		{
			z.display();
		}
	}

}
class labq34
{
	public static void main(String aa[])
	{
		xyz x=new xyz();
		x.accept();
		x.check();
	}
}