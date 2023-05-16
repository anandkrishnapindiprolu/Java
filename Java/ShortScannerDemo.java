import java.io.*;
import java.util.Scanner;
	class ShortScannerDemo
	{
		public static void main(String args[])
		{
			short s;
			System.out.println("enter short value");
			Scanner sc= new Scanner(System.in);
			s=sc.nextShort();
			System.out.println("the value of short is :  " +s);
		}
	}