import java.util.Scanner;
import java.io.*;

public class p176 {

	public static void main(String[] args) {
	
String str1;
String str2;
Scanner s=new Scanner(System.in);
str1=s.next();
str2=s.next();
boolean flag=false;
char ch[]=str2.toCharArray();
for(int i=0;i<str2.length();i++)
{
	if(str1.contains(String.valueOf(ch[i])))
		flag=true;
	else
	{
		flag=false;
		break;
	}
}
System.out.println(flag);
	}

}
