import java.io.*;
import java.util.*;
import java.lang.*;
class b16
{
public static void main(String args[])
{
int inter1;
int inter2;
Scanner s=new Scanner(System.in);
inter1=s.nextInt();
inter2=s.nextInt();
boolean flag=false;
for(int i=inter1;i<=inter2;i++)
{
flag=false;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
flag=true;
break;
}
else
{
continue;
}
}
if(!flag)
{
System.out.println(i);
}
}
}
}
