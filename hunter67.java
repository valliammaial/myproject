
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class h67 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
List<String> list=new ArrayList<String>();
Map<String,Integer> m=new LinkedHashMap<String,Integer>();
for(int i=0;i<n;i++)
{
	String name=s.next();
	list.add(name);
	String m1=s.next();
	list.add(m1);
	String m2=s.next();
	list.add(m2);
	String m3=s.next();
	list.add(m3);
	int total=Integer.parseInt(m1)+Integer.parseInt(m2)+Integer.parseInt(m3);
	m.put(name,total);
}
int max=0;
String last="";
List<String> list1=new ArrayList<String>(m.keySet());
for(String ss:list1)
{
	if(m.get(ss)>max)
	{
		max=m.get(ss);
		last=ss;
	}
}
System.out.println(last);
	}

}
