import java.io.*;
import java.lang.*;
import java.util.*;
class h6
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
m.put(a[i],(m.get(a[i])==null)?1:m.get(a[i])+1);
}
List<Integer> list=new ArrayList<Integer>(m.keySet());
for(int i:list)
{
if(m.get(i)>1)
{
System.out.println(i);
break;
}
}
}
}
