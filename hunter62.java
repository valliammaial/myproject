
import java.util.Scanner;

public class h62 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<10;i++)
{
	a[i]=s.nextInt();
}
int last[]=new int[50];
int x=0;
for(int i=0;i<10;i++)
{
	for(int j=i+1;j<10;j++)
	{
		last[x++]=Math.abs(a[i]-a[j]);
	}
}
int max=0;
for(int i=0;i<x;i++)
{
	if(last[i]>max)
		max=last[i];
}
System.out.println(max);
	}

}
