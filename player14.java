import java.io.*;
import java.util.*;
import java.lang.*;
class p14
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.next();
StringBuffer sb=new StringBuffer(str);
String s1=sb.reverse().toString();
char ch[]=s1.toCharArray();
String last="";
boolean flag=false;
char vovels[]={'a','e','i','o','u'};
for(int i=0;i<ch.length;i++)
{
for(int j=0;j<vovels.length;j++)
{
if(ch[i]!=vovels[j])
{
flag=true;
}
}
if(!flag)
last+=ch[i];
}
System.out.println(last);
}
}
