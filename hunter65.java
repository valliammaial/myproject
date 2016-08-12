import java.io.*;
import java.util.*;
import java.lang.*;
public class hunter65{
	public static void main(String[] args) {
	
int a[]=new int[20];
int last[]=new int[20];
int n;
int x=0;
Scanner s=new Scanner(System.in);
System.out.println("enter n");
n=s.nextInt();
System.out.println("enter array elemrnts");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int remove;
System.out.println("enter element to be removed");
remove=s.nextInt();

for(int i=0;i<n;i++)
{
	if(a[i]!=remove)
		last[x++]=a[i];
}
System.out.println("new array");
for(int i=0;i<x;i++)
{
	System.out.print(last[i]+" ");
}

	}

}
