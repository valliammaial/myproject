import java.io.*;
import java.lang.*;
import java.util.*;
class h10
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int a1[]=new int[n1];
int a2[]=new int[n2];
String s1="";
String s2="";
for(int i=0;i<n1;i++)
{
a1[i]=s.nextInt();
s1+=a1[i];
}
for(int i=0;i<n2;i++)
{
a2[i]=s.nextInt();
s2+=a2[i];
}
if(s1.contains(s2))
{
System.out.println("a1 is a subset of a2");
}
else
{
System.out.println("a1 is not a subset of a2");
}
}
}
