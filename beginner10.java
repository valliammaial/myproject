import java.io.*;
import java.util.*;
import java.lang.*;
class lb10
{
public static void main(String args[])
{
int n;
int count=0;

Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
count++;
n=n/10;
}
System.out.println(count);
}
}
