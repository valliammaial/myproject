
import java.util.Scanner;

public class p119 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int sum=0;
for(int i=n1;i<=n2;i++)
{
	String str=String.valueOf(i);
	StringBuffer sb=new StringBuffer(str);
	String ss=sb.reverse().toString();
	if(str.equals(ss))
	{
		int n=Integer.parseInt(ss);
		sum+=n;
	}
}
System.out.println(sum);
	}

}
