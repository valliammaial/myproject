
import java.util.Scanner;

public class p127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int f1=0;
int f2=1;
int f3;
int a[]=new int[50];
int x=0;
for(int i=0;i<n;i++)
{
	f3=f1+f2;
	//System.out.println(f2);
	a[x++]=f2;
	f1=f2;
	f2=f3;
}
int sum=0;
for(int i=0;i<x;i++)
	sum+=a[i];
System.out.println(sum);
	}

}
