import java.io.*;
import java.util.*;
import java.lang.*;
class lb12
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
String str=String.valueOf(n);
StringBuffer sb=new StringBuffer(str);
String last=sb.reverse().toString();
if(str.equals(last))
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
}
