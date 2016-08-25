import java.io.*;
import java.util.*;
import java.lang.*;
class p170
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
int n=s.nextInt();
boolean flag=true;
char ch[]=new char[n];
for(int i=0;i<n;i++)
{
ch[i]=s.next().charAt(0);
}
char s1[]=str.toCharArray();
char last[]=new char[100];
int x=0;
for(int i=0;i<s1.length;i++)
{
flag=true;
for(int j=0;j<ch.length;j++)
{
if(s1[i]!=ch[j])
continue;
else
{
flag=false;
break;
}
}
if(flag)
{
last[x++]=s1[i];
}
}
String ans=String.valueOf(last);
System.out.println(ans);
}
}
