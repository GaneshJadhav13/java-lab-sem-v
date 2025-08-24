import java.io.*;


class eight
{
	int row=0;
	int rowline=0;
	int col=0;
	int space=0;
	int k=0;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("\n Enter Rowline:");
			rowline=Integer.parseInt(br.readLine());

		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}
	public void display()
	{
		System.out.println("\n pyramid pattern -->");

		space=rowline-1;
		for(row=1;row<=rowline;row++)
		{
			for(k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			space--;
			for(col=1;col<=row;col++)//for(col=1;col<=2*row-1;col++)
			{
				System.out.print("* ");//add extra space or use upper commented code
			}
			System.out.println();
		}
	}

}
class labq8
{
	public static void main(String aa[])
	{
		eight e=new eight();
		e.accept();
		e.display();
	}
}


