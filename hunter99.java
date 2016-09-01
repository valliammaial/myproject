
import java.util.Scanner;

public class h99 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
boolean flag=false;
int a[]=new int[50];
int x=0;
for(int i=10;i<=99;i++)
{
	flag=true;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=false;
			break;
		}
		else
		{
			flag=true;
		}
	}
	if(flag)
	a[x++]=i;
	
}

for(int i=0;i<x;i++)
{
	for(int j=i+1;j<x;j++)
	{
		if((a[i]+a[j])==n)
		{
			System.out.println(a[i]+" "+a[j]);
		}
	}
}

	}

}
