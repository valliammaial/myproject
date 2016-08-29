import java.util.ArrayList;
import java.util.Scanner;

public class p126 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList list1=new ArrayList();
ArrayList list2=new ArrayList();
for(int i=0;i<n;i++)
{
	list1.add(s.nextInt());
}
for(int i=0;i<n;i++)
{
	list2.add(s.nextInt());
}
ArrayList list=new ArrayList();
for(int i=0;i<n;i++)
{
	if(i%2==0)
		list.add(list2.get(i));
	else
	    list.add(list1.get(i));
	
}
for(int i=0;i<list.size();i++)
	System.out.println(list.get(i));
	}

}
