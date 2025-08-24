import java.io.*;

class five
{
	Float side;
	int ch=0;
	Float area;
	Float Perimeter;

	public void accept()
	{
		try
		{
				while(true)
				{
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

					System.out.print("\n Enter side of square:");
					side=Float.parseFloat(br.readLine());

					System.out.println("\n1. Area of Square ");
					System.out.println("\n2. Perimeter of Square ");
					System.out.println("\n3. Exit program ");

					System.out.println("\n Enter your choice: ");
					ch=Integer.parseInt(br.readLine());

					if (ch==3)
					{
						System.out.println("\n. Exiting... ");
						break;
					}

					display();
				}



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
			area=side*side;
			System.out.println("\n Area of square="+area);
		}
		if(ch==2)
		{
			Perimeter=4*side;
			System.out.println("\n Perimeter of Square="+Perimeter);
		}
		else
		{
			System.out.println("\n Invalid choice ! ");
		}

	}

}
class labq5
{
	public static void main(String aa[])
	{
		five f=new five();
		f.accept();

	}
}

