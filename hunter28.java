import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
public class h28ori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Scanner s=new Scanner(System.in);
str=s.next();
Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
char ch[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
	m.put(ch[i],(m.get(ch[i])==null)?1:m.get(ch[i])+1);
}
Set set=m.entrySet();
Iterator it=set.iterator();
while(it.hasNext())
{
	Map.Entry me=(Map.Entry)it.next();
	System.out.print(me.getKey());
}
	}

}
