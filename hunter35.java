import java.io.*;
import java.util.*;
import java.lang.*;
public class hunter35 {
	public static void main(String[] args) {

String str;
Scanner s=new Scanner(System.in);
System.out.println("enter string");
str=s.next();
int len=str.length();
int half=len/2;
String s1=str.substring(0,half);
String s2=str.substring(half);

if(s1.equals(s2))
	System.out.println("double strings");
else
	System.out.println("not double strings");
	}

}
