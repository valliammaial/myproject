
import java.util.Scanner;

public class h40 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a;
int sum=0;
while(n!=0)
{
	a=n%10;
	sum+=a;
	n=n/10;
}
String s1="";
s1+=sum;
StringBuffer sb=new StringBuffer(s1);
if(s1.equals(sb.toString()))
{
	System.out.println("The sum of digits of a given no is palindrome");
}
else
{
	System.out.println("The sum of digits of a given no is not a palindrome");
}
	}

}
