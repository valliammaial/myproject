import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p135 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int half=n/2;
List<Integer> list=new ArrayList<Integer>();
int last[]=new int[n];
int x=0;
for(int i=0;i<half;i++)
{
	list.add(a[i]);
}
Collections.sort(list);
for(int i:list)
	last[x++]=i;
List<Integer> list1=new ArrayList<Integer>();
for(int i=half;i<n;i++)
{
	list1.add(a[i]);
}
Collections.sort(list1);
Collections.reverse(list1);
for(int i:list1)
	last[x++]=i;
for(int i=0;i<x;i++)
	System.out.println(last[i]);
	}

}
