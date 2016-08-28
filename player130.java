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
if(ch[i]=='a' ||ch[i]=='e' || ch[i]=='i' ch[i]=='o' ||ch[i]=='u')
{
count++;
}
}
System.out.println(count);
}
}
