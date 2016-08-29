import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p148 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int k=s.nextInt();
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int aa=k;
//System.out.println(aa);
int last[]=new int[n];
int x=0;
int i=0;
while(aa<=n)
{
List<Integer> list=new ArrayList<Integer>();
while(i<aa)
{
	list.add(a[i]);
    i++;
}
Collections.sort(list);
Collections.reverse(list);
//System.out.println(list);
for(int j:list)
	last[x++]=j;

aa+=k;

}
for(i=0;i<x;i++)
	System.out.println(last[i]);

	}

}
