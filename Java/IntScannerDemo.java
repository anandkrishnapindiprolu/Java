import java.io.*;
import java.util.Scanner;
	class IntScannerDemo
	{
		public static void main(String args[])
		{
			int i,j;
			System.out.println("enter value of i");
			Scanner sc= new Scanner(System.in);
			i=sc.nextInt();
			System.out.println("enter value of j");
			j=sc.nextInt();
			System.out.println("addition of integers is :  " +(i+j));
		}
	}