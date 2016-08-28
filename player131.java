import java.io.*;
import java.util.*;
import java.lang.*;
class p131
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a;
int sum=0;
while(n!=0)
{
a=n%10;
if(a%2!=0)
  sum+=a;
n=n/10;
}

if(sum%2==0)
System.out.println("-1");
else
System.out.println("1");
}
}
