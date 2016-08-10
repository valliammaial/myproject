import java.io.*;
import java.util.*;
import java.lang.*;
class p3
{
public static void main(String args[])
{
int n;
int b[]=new int[30];
int x=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
int a=n%10;
b[x++]=a;
n=n/10;
}
for(int i=0;i<x;i++)
System.out.print(b[i]);
}
}
