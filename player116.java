
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class p116 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
	m.put(s.nextInt(),s.nextInt());
}
int sum=0;
int count=0;
List<Integer> list=new ArrayList<Integer>(m.keySet());
for(int i:list)
{
	if(i%2!=0)
	{   
		count++;
		sum+=m.get(i);
	}
}
System.out.println(sum/count);

	}

}
