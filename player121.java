
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p121 {

	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
int n=s.nextInt();
List<String> set=new ArrayList<String>();
for(int i=0;i<n;i++)
{
	set.add(s.next());
}
String str=s.next();
Collections.sort(set);
Collections.reverse(set);
for(int i=0;i<set.size();i++)
{
	if(set.get(i).equals(str))
		System.out.println(i);
}
	}
}
