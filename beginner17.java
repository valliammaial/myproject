import java.io.*;
import java.util.*;
import java.lang.*;
class b17
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int b=n;
int a;
int sum=0;
while(n!=0)
{
a=n%10;
sum+=a*a*a;
n=n/10;
}
if(sum==b)
System.out.println("Armstrong no");
else
System.out.println("Not a Armstrong no");
}
}
