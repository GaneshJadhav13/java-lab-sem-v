/*Write a java program to accept the file name from user and
display the content of that file on the command prompt*/
import java.io.*;

class twentyone
{
	FileInputStream fin=null;
	String filename;
	int x;

	public twentyone()
	{
		try
		{
			BufferedReader br =new BufferedReader(new
			InputStreamReader(System.in));

			System.out.println("\n Enter filename:");
			filename=br.readLine();


			fin = new FileInputStream(filename);
			while((x=fin.read())!=-1)
			{
				System.out.print((char)x);
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class labq21
{
	public static void main(String a[])
	{
		twentyone t=new twentyone();
	}
}
