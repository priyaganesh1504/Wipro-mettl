import java.io.*;
import java.util.*;
import java.util.Scanner.*;
public class UserMainCode{
    
    public static int createPin(int input1,int input2,int input3){
        
int u1=input1%10,u2=input2%10,u3=input3%10;
    int t1=(input1/10)%10,t2=(input2/10)%10,t3=(input3/10)%10;
    int h1=input1/100,h2=input2/100,h3=input3/100;
    int u=Math.min(u1,Math.min(u2,u3));
    int t=Math.min(t1,Math.min(t2,t3));
    int h=Math.min(h1,Math.min(h2,h3));

    int th=Math.max(u2,Math.max(u3,Math.max(t1,Math.max(t2,Math.max(t3,Math.max(h1,Math.max(h2,h3)))))));
  int num=th*1000+h*100+t*10+u;
   return num;
 
    }
    public static void main(String args[]){
        int p;
        Scanner scan=new Scanner(System.in);
        int q=scan.nextInt();
        int r=scan.nextInt();
        int s=scan.nextInt();
        p=createPin(q,r,s);
        System.out.println(p);
    }
  
}
