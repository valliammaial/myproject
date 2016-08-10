import java.io.*;
import java.util.*;
import java.lang.*;
class p2
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
