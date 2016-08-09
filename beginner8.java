import java.io.*;
import java.util.*;
import java.lang.*;
class lb8
{
public static void main(String args[])
{
int n;
int sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
sum+=i;
}
System.out.println(sum);
}
}
