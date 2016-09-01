
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class h89 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
String str=s.next();
int k=s.nextInt();
String ss[]=str.split(",");
Map<String,Integer> m=new LinkedHashMap<String,Integer>();
for(int i=0;i<ss.length;i++)
{
	m.put(ss[i],(m.get(ss[i])==null)?1:m.get(ss[i])+1);
}
List<String> list=new ArrayList<String>(m.keySet());
for(String s1:list)
{
	if(m.get(s1)>=k)
	{
		System.out.println(s1+"("+m.get(s1)+")");
	}
}

	}

}
