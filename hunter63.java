import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class h63 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int last[]=new int[n];
int x=0;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n-1;i++)
{
	List<Integer> list=new ArrayList<Integer>();
	for(int j=i+1;j<n;j++)
	{
		list.add(a[j]);
	}
	Collections.sort(list);
   //System.out.println(list);
	Collections.reverse(list);
	int m=list.get(0);
	last[x++]=m;
}
last[x++]=0;
for(int i=0;i<x;i++)
	System.out.println(last[i]);
	}

}
