import java.util.Scanner;

public class p125 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int a1[]=new int[n1];
int a2[]=new int[n2];
for(int i=0;i<n1;i++)
{
	a1[i]=s.nextInt();
}
for(int i=0;i<n2;i++)
{
	a2[i]=s.nextInt();
}
int a3[]=new int[50];
int x=0;
for(int i=0;i<n1;i++)
{
	for(int j=0;j<n2;j++)
	{
		if(a1[i]==a2[j])
		{
		   a3[x++]=a1[i];	
		}
	}
}
int sum=0;
for(int i=0;i<x;i++)
	sum+=a3[i];
System.out.println(sum);
	}

}
