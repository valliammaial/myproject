import java.io.*;
import java.util.*;
import java.lang.*;
class p11
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.next();
String working[]={"Monday","Tuesday","Wednessday","Thursday","Friday","Saturday"};
String holiday[]={"Sunday"};
int len=working.length;
int len1=holiday.length;
for(int i=0;i<len;i++)
{
if(working[i].contains(str))
System.out.println("true");
}
for(int i=0;i<len1;i++)
{
if(holiday[i].contains(str))
System.out.println("false");
}
}
}


