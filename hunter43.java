import java.io.*;
import java.lang.*;

import java.util.Scanner;

public class hunter43 {
	public static void main(String[] args) {
	
String str;
Scanner s=new Scanner(System.in);
System.out.println("enter string");
str=s.next();
char ch[]=str.toCharArray();
char c = 0;
String ss="";
for(int i=0;i<ch.length;i++)
{
	if(Character.isAlphabetic(ch[i]))
	{
		c=ch[i];
	}
	else if(Character.isDigit(ch[i]))
	{
		ss+=ch[i];
		if((i+1)<ch.length)
	    {
		if(Character.isAlphabetic(ch[i+1]))
		{
			int a=Integer.parseInt(ss);
			for(int j=0;j<a;j++)
				System.out.print(c);
			c=0;
			ss="";
		}
	    else
			continue;
		}}

	if(i==ch.length-1)
	{
		
		int a=Integer.parseInt(ss);
		for(int j=0;j<a;j++)
			System.out.print(c);
		  
		
	}
		
	
}
	}

}
