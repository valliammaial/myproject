
import java.util.Scanner;

public class h78 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[50];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int half=n/2;
System.out.println(a[half]);
	}

}
