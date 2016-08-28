import java.io.*;
import java.util.*;
import java.lang.*;
class p130
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
int count=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(String.valueOf(ch[i]).equalsIgnoreCase("a") ||String.valueOf(ch[i]).equalsIgnoreCase("e") || String.valueOf(ch[i]).equalsIgnoreCase("i")|| String.valueOf(ch[i]).equalsIgnoreCase("o")||String.valueOf(ch[i]).equalsIgnoreCase("u"))
{
count++;
}
}
System.out.println(count);
	}
}
}
}
