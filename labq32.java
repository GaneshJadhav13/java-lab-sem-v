/*Write a java program to accept the number from user and if
the number is 0 then throw user defined exception “This
number is 0 ” and if the number is not 0 then display the
reverse of that number on the command prompt*/

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
	int rem;
	int rev;

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
				int x=a;
				System.out.println("\n Reverse Number:");
				while(a!=0)
				{
				rem=a%10;
				rev=rev*10+rem;
				a=a/10;
				}
				System.out.println("\n "+rev);
			}
		}
		catch(zero z)
		{
			z.display();
		}
	}

}
class labq32
{
	public static void main(String aa[])
	{
		xyz x=new xyz();
		x.accept();
		x.check();
	}
}