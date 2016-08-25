import java.io.*;
import java.util.*;
import java.lang.*;
class p154
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.next();
char c=str.charAt(1);
StringBuffer sb=new StringBuffer(str);
sb.setCharAt(1,Character.toUpperCase(c));
System.out.println(sb);
}
}
