/*Write a java program to accept the file name from user and
convert all upper case letters to lower case and display that
lower case letters on the command prompt*/
import java.io.*;

class thirtyone
{
	int x;
	String filename;
	FileInputStream fin=null;

	public thirtyone()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("\n Enter fil name:");
			filename=br.readLine();

			fin =new FileInputStream(filename);

			while((x=fin.read())!=-1)
			{
				if(Character.isUpperCase((char)x))
				{
					System.out.print(Character.toLowerCase((char)x));
				}
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class labq31
{
	public static void main(String aa[])
	{
		thirtyone t=new thirtyone();
	}
}
