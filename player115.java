

import java.util.Scanner;

public class p115 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
int a;
while(n!=0)
{
	a=n%10;
	sum+=a*a;
	n=n/10;
}
System.out.println(sum);
	}

}
