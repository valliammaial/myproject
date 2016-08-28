import java.io.*;
import java.util.*;
import java.lang.*;
class p133
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
{
a[i]=s.next();
}
String aa[]=new String[n];
for(int i=0;i<n;i++)
{
aa[i]=a[i].toUpperCase();
}
Map<String,String> m=new LinkedHashMap<String,String>();
for(int i=0;i<n;i++)
{
m.put(aa[i],a[i]);
}
System.out.println(m);
}
}
