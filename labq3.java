import java.io.*;

class three
{
	int a=0;
	int b=0;
	int ch=0;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("\n Enter First Number:");
			a=Integer.parseInt(br.readLine());

			System.out.print("\n Enter Second Number:");
			b=Integer.parseInt(br.readLine());

			System.out.println("\n1. Max of Numbers");
			System.out.println("\n2. Min of Numbers");

			System.out.println("\n Enter your choice: ");
			ch=Integer.parseInt(br.readLine());


		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}
	public void display()
	{
		if(ch==1)
		{
			if (a>b)
			{
				System.out.println("\n Max Number is= "+a);
			}
			else
			{
				System.out.println("\n Max number is= "+b);
			}
		}
		if(ch==2)
		{
			if (a<b)
			{
				System.out.println("\n Min Number is= "+a);
			}
			else
			{
			System.out.println("\n Min number is= "+b);
			}

		}

	}

}
class labq3
{
	public static void main(String aa[])
	{
		three t=new three();
		t.accept();
		t.display();
	}
}

