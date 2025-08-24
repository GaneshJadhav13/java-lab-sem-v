import java.io.*;

class two
{
	String a;
	String b;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("\n Enter First String:");
			a=(br.readLine());

			System.out.print("\n Enter Second String:");
			b=(br.readLine());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}
	public void check()
	{
		if (a.equals(b)) //a.equalsIngoreCase(b)
		{
			System.out.println("\n Given Stings are same . ");

		}
		else
		{

			System.out.println("\n Given Stings are Not same !");

		}

	}

}
class labq2
{
	public static void main(String aa[])
	{
		 two o =new two();
		o.accept();
		o.check();
	}
}

