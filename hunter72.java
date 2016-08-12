import java.io.*;
import java.util.*;
import java.lang.*;
public class hunter72 {
	public static void main(String[] args) {
	
String str;
Scanner s=new Scanner(System.in);
System.out.println("enter string");
str=s.nextLine();
String ss[]=str.split(" ");
String ans="";
for(int i=0;i<ss.length;i++)
{
	if(i%2==0)
	{
		StringBuffer sb=new StringBuffer(ss[i]);
		String s1=sb.reverse().toString();
		ans+=s1+" ";
	}
	else
		ans+=ss[i]+" ";
}
System.out.println(ans);
	}

}
