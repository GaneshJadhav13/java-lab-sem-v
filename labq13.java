import java.io.*;

/*
Write a java program to create one Interface that consists of
two methods Accept() and display(). Create one base class
that consists of emp no and emp name. Then create one derived
and implemented class that accept the emp no and emp name
from user and display employee details on the command
prompt*/
interface employee
{
	public void accept();
	public void display();

}
class base
{
	String emp_name;
	int emp_no;
}
class thirteen extends base implements employee
{

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new
			InputStreamReader(System.in));

			System.out.println("\n Enter emp name:");
			emp_name=br.readLine();

			System.out.println("\n Enter emp no:");
			emp_no=Integer.parseInt(br.readLine());


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		System.out.println("\n Employee name="+emp_name);
		System.out.println("\n Employee number="+emp_no);
	}
}
class labq13
{
	public static void main(String aa[])
	{
		thirteen t=new thirteen();
		t.accept();
		t.display();
	}
}

