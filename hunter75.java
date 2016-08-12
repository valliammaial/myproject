import java.io.*;
import java.util.*;
import java.lang.*;
public class hunter75 {
	public static void main(String[] args) {
	
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter n");
n=s.nextInt();
int a[]=new int[n];
int last[]=new int[n];
int x=0;
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
	if((i+1)<n)
	{
		if(a[i+1]<a[i])
			last[x++]=a[i+1];
		else
			last[x++]=-1;
	}
	
}
last[x++]=-1;
for(int i=0;i<x;i++)
	System.out.print(last[i]+" ");

	}

}
