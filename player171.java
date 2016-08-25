import java.io.*;
import java.util.*;
import java.lang.*;
class p171
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
String ss[]=str.split(" ");
for(int i=0;i<ss.length;i++)
{
if(ss[i].equals("and"))
{
String first=ss[i-1];
String last=ss[i+1];
String temp=first;
first=last;
last=temp;
ss[i-1]=first;
ss[i+1]=last;
}
}
for(int i=0;i<ss.length;i++)
{
System.out.print(ss[i]+" ");
}
}
}
