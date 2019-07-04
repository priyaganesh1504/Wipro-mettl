import java.math.BigInteger;
import java.util.Scanner;
public class Primerange {
 public static void main(String args[]) {
	 int r1,r2,r3,flag=0,i,j;
	 Scanner scan=new Scanner(System.in);
	 r1=scan.nextInt();
	 r2=scan.nextInt();
	 for(i=r1;i<=r2;i++) {
		BigInteger b = new BigInteger(Integer.toString(i));
		if(b.isProbablePrime(i))
			System.out.println(i);
	 }
	 
 }
}
