import java.io.*;

class six
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

				System.out.println("\n1.Start to end ");
				System.out.println("\n2.End to start ");

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
			System.out.print("\n Start to end---->");
			for(i=a;i<=b;i++)
			{
				System.out.print("\n "+i);
			}
		}
		if(ch==2)
		{
			System.out.print("\n end to start--->");
			for(i=b;i>=a;i--)
			{
				System.out.print("\n "+i);
			}
		}

	}

}
class labq6
{
	public static void main(String aa[])
	{
		six s=new six();
		s.accept();
		s.display();
	}
}

