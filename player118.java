
import java.util.Scanner;

public class p118 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String ss[]=str.split(" ");
int a[]=new int[50];
int x=0;
for(int i=0;i<ss.length;i++)
{
	int len=ss[i].length();
	a[x++]=len;
}
int max=0;
for(int i=0;i<x;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
}
for(int i=0;i<ss.length;i++)
{
	int len=ss[i].length();
	if(len==max)
	{
		System.out.println(ss[i]);
		break;
	}
}
	}

}
