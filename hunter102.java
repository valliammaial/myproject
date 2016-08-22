import java.io.*;
import java.util.*;
import java.lang.*;
class h102
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
String ss="";
String str=String.valueOf(n);
int len=str.length();
for(int i=0;i<len;i++)
{
for(int j=0;j<=i;j++)
{
ss+=str.charAt(j);
}
}
int sum=0;
for(int i=0;i<ss.length();i++)
{
char cc=ss.charAt(i);
sum+=Integer.parseInt(String.valueOf(cc));
}
System.out.println(sum);
}
}
