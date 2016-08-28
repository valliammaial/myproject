import java.io.*;
import java.util.*;
import java.lang.*;
class p129
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String str[]=new String[n];
int sum=0;
for(int i=0;i<n;i++)
{
str[i]=s.next();
}
for(int i=0;i<n;i++)
{
char ch[]=str.toCharArray();
for(int j=0;j<ch.length;j++)
{
if(Character.isDigit(ch[j])
{
String s1=String.valueOf(ch[j]);
int k=Integer.parseInt(s1);
sum+=k;
}
}
}
System.out.println(sum);
}
}
