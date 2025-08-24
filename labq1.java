import java.io.*;

class one
{
	int a=0;
	int b=0;
	int t=0;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new
			InputStreamReader(System.in));

			System.out.print("\n Enter First Number:");
			a=Integer.parseInt(br.readLine());

			System.out.print("\n Enter second Number:");
			b=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}


	}
	public void display()
	{

		System.out.println("\n Before swapping :");

		System.out.println("\n First no A:"+a);

		System.out.println("\n Second no B:"+b);

		t=a;
		a=b;
		b=t;


		System.out.println("\n After swapping :");


		System.out.println("\n First no A:"+a);

		System.out.println("\n Second no B:"+b);


	}

}
class labq1
{
	public static void main(String aa[])
	{
		one o=new one();
		o.accept();
		o.display();


	}

}
