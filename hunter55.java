
import java.util.Scanner;

public class h55 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int d=s.nextInt();
for(int i=d;i<n;i++)
{
	System.out.print(a[i]+" ");
}
for(int i=0;i<d;i++)
{
	System.out.print(a[i]+((i==d-1)?"":" "));
}
	}

}
