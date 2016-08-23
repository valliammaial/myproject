import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class h27 {

	public static void main(String[] args) {
String str;
Scanner s=new Scanner(System.in);
str=s.next();
int len=str.length();
int j=0;
String ss[]=new String[100];
int x=0;
while(j<len)
{
	for(int i=j+1;i<=len;i++)
	{
		ss[x++]=str.substring(j,i);
	}
	j++;
}
int len1[]=new int[100];
int y=0;
for(int i=0;i<x;i++)
{
	len1[y++]=ss[i].length();
}
for(int i=0;i<y;i++)
{
	for(j=i+1;j<y;j++)
	{
		if(len1[i]<len1[j])
		{
			int temp=len1[i];
			len1[i]=len1[j];
			len1[j]=temp;
			String t=ss[i];
			ss[i]=ss[j];
			ss[j]=t;
			
		}
	}
}
for(int i=0;i<y;i++)
{
	StringBuffer sb=new StringBuffer(ss[i]);
	String last=sb.reverse().toString();
	if(!(last.equalsIgnoreCase(ss[i])))
	{
		System.out.println(ss[i]);
		break;
	}
}
	}

}
