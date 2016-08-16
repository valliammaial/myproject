import java.io.*;
import java.util.*;
import java.lang.*;
class b15
{
public static void main(String args[])
{
int inter1;
int inter2;
Scanner s=new Scanner(System.in);
inter1=s.nextInt();
inter2=s.nextInt();
for(int i=inter1;i<=inter2;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
