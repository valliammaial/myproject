import java.io.*;
import java.util.*;
import java.lang.*;
class b13
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter n value");
n=s.nextInt();
for(int i=2;i<n;i++)
{
if(n%2==0)
{
System.out.println("The given no is not prime");
break;
}
else
{
System.out.println("The given no is prime");
}
}
}
