import java.io.*;
import java.util.*;
import java.lang.*;
public class hunter4 {
	public static void main(String[] args) {
		
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int count=0;
boolean occur=false;
int a[]=new int[n];

for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
	count=1;
	occur=false;
	for(int k=0;k<i;k++)
	{
		if(a[i]==a[k])
			occur=true;
	}
	if(!occur)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
				count++;
		}
		if(count!=2)
			System.out.println(a[i]);

	}
	}
	}

}
