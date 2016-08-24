import java.io.*;
import java.util.*;
import java.lang.*;
class p165
{
public static void main(String args[])
{
Set<Character> set=new LinkedHashSet<Character>();
String str;
Scanner s=new Scanner(System.in);
str=s.next();
char ch[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
set.add(ch[i]);
}
Iterator it=set.iterator();
while(it.hasNext())
{
System.out.print(it.next());
}
}
}
