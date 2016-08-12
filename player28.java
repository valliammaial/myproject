import java.io.*;
import java.util.*;
import java.lang.*;
public class p28 {
	public static void main(String[] args) {
		
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
int l;
l=s.nextInt();
String sp[]=str.split(",");
//System.out.println(sp.length);
int sum=0;
int sum1=0;
String s1="";
int l1=sp.length;
for(int i=0;i<sp.length;i++)
{
	//System.out.println(i);
	int len=sp[i].length();
	sum=sum+len+1;
	//System.out.println(sum);
    sum1=sum-1;
	if(sum1<=l)
	{
    s1+=sp[i]+" ";
    if(sp[i].equals(sp[l1-1]))
    {
    	System.out.println(sp[i]);
    }
	}
	else
	{
	System.out.println(s1);
	s1="";
	sum=0;
	i--;
	}
}
	}

}
