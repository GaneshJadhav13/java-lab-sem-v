/*Write a java program to create one interface vehicle with
one
method getWheel(). Create the class from vehicle interface
and return the number of wheels for two wheeler and auto and
car. Display the result in the main function*/
import java.io.*;

interface vehicle
{
	public int getWheel();

}
class Car implements vehicle
{
	public int getWheel()
	{
		return 4;
	}
}
class Auto implements vehicle
{
	public int getWheel()
	{
		return 3;
	}
}
class Bike implements vehicle
{
	public int getWheel()
	{
		return 2;
	}
}
class labq15
{
	public static void main(String aa[])
	{
		Car C=new Car();
		int a=C.getWheel();
		System.out.println("\n Wheels of car is "+a);

		Auto T=new Auto();
		int b=T.getWheel();
		System.out.println("\n Wheels of Auto is "+b);

		Bike K=new Bike();
		int c=K.getWheel();
		System.out.println("\n Wheels of Bike is "+c);
	}
}
