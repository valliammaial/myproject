import java.io.*;
import java.util.*;
import java.lang.*;
public class hunter24 {
	public static void main(String[] args) {
	
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter n");
n=s.nextInt();
int a[]=new int[n];
int target;
System.out.println("enter target");
target=s.nextInt();
System.out.println("enter elements");
int count=0;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[i]+a[j]==target)
		{
			System.out.println(a[i]+" "+a[j]);
			count++;
		}
	}
}
if(count==0)
	System.out.println("no two numbers when they add up reach the target number");
	}

}
