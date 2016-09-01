
import java.util.Scanner;

public class h85 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1;
int a;
int count=0;
for(int i=0;i<=n;i++)
{
	n1=i;
	while(n1!=0)
	{
		a=n1%10;
		if(a==2)
		{
			count++;
		}
		n1=n1/10;
	}
}
System.out.println(count);
	}

}
