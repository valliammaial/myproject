import java.io.*;
import java.util.*;
import java.lang.*;
class p43
{
public static void main(String args[])
{
String str;
String str1;
System.out.println("Enter 2 strings");
Scanner s=new Scanner(System.in);
str=s.next();
str1=s.next();
if(str.contains(str1))
System.out.println("Substring");
else
System.out.println("Not Substring");
}
}
