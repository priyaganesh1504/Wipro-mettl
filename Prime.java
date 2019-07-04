import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n;
	int i;
	int x;
	n=scan.nextInt();
		for(i=2,x=2;i<=n;i++) {
			for(x=2;x<i;x++) {
				if(i%x==0) {
					break;
				}
			}
			if(x==i) {
				System.out.printf("%d is a prime", x);
			}
		}
	}
}
