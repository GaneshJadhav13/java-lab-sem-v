import java.io.*;

class four
{
	int n=0;
	int rem=0;
	int rev=0;
	int ch=0;
	int newnum=0;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("\n Enter Any digit Number:");
			n=Integer.parseInt(br.readLine());


			System.out.println("\n1. check palindrome ");
			System.out.println("\n2. check Armstrong ");

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
			int x=n;// store n value in x


			while(x!=0)// use x in loop
			{
				rem=x%10;
				rev=rev*10+rem;
				x=x/10;

			}
			if (n==rev)
			{
				System.out.println("Yes Palindrome");
			}else
			{

				System.out.println("Not Palindrome");
			}

		}
		if(ch==2)
		{
			int x=n;//store n value in x

			while(x!=0)
			{
				rem=x%10;
				newnum=newnum+rem*rem*rem;
				x=x/10;

			}
			if (n==newnum)
			{
				System.out.println("Yes Armstrong");
			}
			else
			{

				System.out.println("Not armstrong");
			}
		}

	}

}
class labq4
{
	public static void main(String aa[])
	{
		four f=new four();
		f.accept();
		f.display();
	}
}

