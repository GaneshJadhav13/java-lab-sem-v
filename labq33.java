/*Write a java program to accept the file name from user and
print all the content of that file and if any digit found
then display * instead of that digit  on the command prompt*/

import java.io.*;
class thirtythree
{
	String filename;
	int x;
	FileInputStream fin=null;

	public thirtythree()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("\n Enter filename:");
			filename=br.readLine();

			fin=new FileInputStream(filename);

			while((x=fin.read())!=-1)
			{
				if(Character.isDigit((char)x))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print((char)x);
				}
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
class labq33
{
	public static void main(String m[])
	{
		thirtythree t=new thirtythree();
	}
}