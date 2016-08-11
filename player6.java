import java.io.*;
import java.util.*;
import java.lang.*;
public class iso {
	public static void main(String[] args) {
	
String s1;
String s2;
Scanner s=new Scanner(System.in);
s1=s.next();
s2=s.next();
int l1=s1.length();
int l2=s2.length();
char s11[]=s1.toCharArray();
char s22[]=s2.toCharArray();
boolean flag=false; 
if(l1==l2)
{
	for(int i=0;i<l1;i++)
	{
		for(int j=i+1;j<l1;j++)
		{
			if((s11[i]==s11[j])&&(s22[i]==s22[j]))
			{
				flag=true;
				System.out.println(s11[i]+" "+s22[j]);
			}
		}
	}
	System.out.println(flag);
}
	}

}
