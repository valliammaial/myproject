
import java.util.Scanner;

public class p128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int x=0;
for(int i=1;i<=n;i++)
{
	if(i%2!=0)
	{
		a[x++]=i;
	}
}
int sum=0;
sum=a[0];
for(int i=0;i<x;i++)
{
	if((i+1)<x)
	{
	if(i%2==0)
		sum=sum+a[i+1];
	else
		sum=sum-a[i+1];
	}
}
System.out.println(sum);
	}

}
