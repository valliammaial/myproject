import java.io.*;
import java.util.*;
import java.lang.*;
class h11
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
String ss[]=str.split(" ");
for(int i=ss.length;i>=0;i--)
System.out.println(ss[i]+" ");
}
}
