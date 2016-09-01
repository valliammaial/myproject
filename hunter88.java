
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class h88 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
String str=s.next();
StringBuffer sb=new StringBuffer(str);
String ss=sb.reverse().toString();
Set<Character> set=new LinkedHashSet<Character>();
char ch[]=ss.toCharArray();
for(int i=0;i<ch.length;i++)
{
	set.add(ch[i]);
}
String last="";
for(char c:set)
    last+=c;
System.out.println(last);
	}

}
