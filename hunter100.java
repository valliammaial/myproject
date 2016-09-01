
import java.util.Scanner;

public class h100 {

	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int b;
int a[]=new int[50];
int x=0;
while(n!=0)
{
	b=n%10;
	a[x++]=b;
	n=n/10;
}
int c[]=new int[50];
int y=0;
for(int i=x-1;i>=0;i--)
{
	c[y++]=a[i];
}
int sum=0;
for(int i=0;i<y;i++)
{
	if((i+1)<y)
	{
		sum+=Math.pow(c[i],c[i+1]);
	}
}
sum+=Math.pow(c[y-1],0);
System.out.println(sum);
	}

}
