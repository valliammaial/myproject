import java.io.*;
import java.util.8;
import java.lang.*;
class p61
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
int x;
x=s.nextInt();
int count=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]+a[j]==x)
{
system.out.println("There exists two elements in the array whose sum is exactly x");
count++;
}
}
}
if(count==0)
System.out.println("there is no two elements in the array whose sum is exactly x");
}
}
