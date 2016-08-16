import java.io.*;
import java.util.*;
import java.lang.*;
class b13
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);

n=s.nextInt();
int count=0;
for(int i=2;i<n;i++)
{
if(n%2==0)
{
System.out.println("The given no is not prime");
count++;
break;
}
}
if(count==0)
System.out.println("The given no is prime");
}
}
