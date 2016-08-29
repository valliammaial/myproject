import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class p141 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char ch[]=str.toCharArray();
Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
for(int i=0;i<ch.length;i++)
{
	m.put(ch[i],(m.get(ch[i])==null)?1:m.get(ch[i])+1);
}
List<Character> list=new ArrayList<Character>(m.keySet());
for(char c:list)
{
	if(m.get(c)==1)
	{
		System.out.println(c);
		break;
	}
}
	}

}
