import java.io.*;
import java.util.Scanner;
	class ByteScannerDemo
	{
		public static void main(String args[])
		{
			byte b;
			System.out.println("enter byte value");
			Scanner sc= new Scanner(System.in);
			b=sc.nextByte();
			System.out.println("the value of byte is :  " +b);
		}
	}