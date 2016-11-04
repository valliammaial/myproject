package mini1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mindtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
System.out.println("enter array elements");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
System.out.println("enter k");
int k=s.nextInt();
List<Integer> list1=new ArrayList<Integer>();
for(int i=0;i<k;i++)
{
	list1.add(a[i]);
}
Collections.sort(list1);
List<Integer> list2=new ArrayList<Integer>();
for(int i=k;i<n;i++)
{
	list2.add(a[i]);
}
Collections.sort(list2);
Collections.reverse(list2);
System.out.println("After making asc and desc");
System.out.println(list1);
System.out.println(list2);
	}

}
