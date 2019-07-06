
import java.util.*;
import java.util.Scanner;
public class IsPalindrome {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int input1=scan.nextInt();
	int temp=input1;
	int rev=0;
	while(input1>0) {
		rev=rev*10+input1%10;
		input1/=10;
	}
	if(temp==rev)
		System.out.println("is palindrome: "+temp);
	else
		System.out.println("Not palindrome");
	
}
}
