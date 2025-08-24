import java.io.*;

class seven
{
	int a=0;
	int b=0;
	int i=0;
	int ch;


	public void accept()
	{
		try
		{

				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

				System.out.print("\n Enter First Number:");
				a=Integer.parseInt(br.readLine());

				System.out.print("\n Enter Second number:");
				b=Integer.parseInt(br.readLine());

				System.out.println("\n1.All even numbers ");
				System.out.println("\n2.All odd Numbers ");

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
			System.out.print("\n Even-->");
			for(i=a;i<=b;i++)
			{
				if(i%2==0)
				{
					System.out.print("\n "+i);
				}
			}
		}
		if(ch==2)
		{
			System.out.print("\n odd--->");
			for(i=a;i<=b;i++)
			{
				if(i%2!=0)
				{
					System.out.print("\n "+i);
				}
			}
		}

	}

}
class labq7
{
	public static void main(String aa[])
	{
		seven s=new seven();
		s.accept();
		s.display();
	}
}

