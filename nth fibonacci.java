

import java.util.Scanner;
public class Nthfibo{
	public static void main(String args[])
	{
		int n,a=0,b=0,c=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=scan.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
		}

		System.out.println(c+" ");
	}
	
}
