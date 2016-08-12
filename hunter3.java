import java.io.*;
import java.util.*;
import java.lang.*;
public class hunter3 {


	public static void main(String[] args) {
	
int n;

Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
int count=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();	
}
for(int i=0;i<n;i++)
{
	if(i==a[i])
	{
		System.out.println(a[i]);
		count++;
	}
		
}
if(count==0)
	System.out.println("no array element matches with the index");
	}

}
