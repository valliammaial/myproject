import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class h48 {

	public static void main(String[] args) {
String str1;
String str2;
Scanner s=new Scanner(System.in);
str1=s.next();
str2=s.next();
int len=str2.length();
String ss[]=new String[50];
int x=0;
int count=0;
for(int i=0,j=len;i<str1.length() && j<=str1.length();i++,j++)
{
	
		ss[x++]=str1.substring(i,j);
	
	
}
for(int i=0;i<x;i++)
{
	if(ss[i].equals(str2))
	{
		count++;
		System.out.println(i);
	}
	
}
if(count==0)
	System.out.println("-1");
	}

}
