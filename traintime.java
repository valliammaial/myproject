package mini1;

import java.util.Scanner;

public class traintime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter 4 digits");
int t1=s.nextInt();String s1=String.valueOf(t1);
int t2=s.nextInt();String s2=String.valueOf(t2);
int t3=s.nextInt();String s3=String.valueOf(t3);
int t4=s.nextInt();String s4=String.valueOf(t4);
String str=s1+s2+s3+s4;
String app1 = null;
String app2 = null;
String ss4=null;
int max=0;
if(t1<10 && t2<10 && t3<10 && t4<10)
{
	if(str.contains("2"))//string contains 2
	{
		int pos1=str.indexOf("2");
		char ch1=str.charAt(pos1);
		String res=String.valueOf(ch1);
		StringBuffer ss1=new StringBuffer(str);
		String ss2=ss1.deleteCharAt(pos1).toString();
		int n=Integer.parseInt(ss2);
		for(int j=3;j>=0;j--)
		{
		String val=String.valueOf(j);
		if(ss2.contains(val))//check whether there is 3 or 2 1 or 0
		{
			int pos2=ss2.indexOf(val);
			char ch2=ss2.charAt(pos2);
			res+=String.valueOf(ch2);
			StringBuffer ss3=new StringBuffer(ss2);
			ss4=ss3.deleteCharAt(pos2).toString();
			break;
		}
		}
		res+=":";
		String smin1=String.valueOf(ss4.charAt(0))+String.valueOf(ss4.charAt(1));
		String smin2=String.valueOf(ss4.charAt(1))+String.valueOf(ss4.charAt(0));
		int min1=Integer.parseInt(smin1);
		int min2=Integer.parseInt(smin2);
		if(min1<60 && min2<60)
		{
			if(max<min1)
				max=min1;
			if(max<min2)
				max=min2;
			res+=String.valueOf(max);
		}
		else if(min1<60 && min2>60)
		{
			res+=String.valueOf(min1);
		}
		else if(min1>60 && min2<60)
		{
			res+=String.valueOf(min2);
		}
		else if(min1>60 && min2>60)
		{
			System.out.println("invalid input");
		}
		System.out.println(res);
	}
	else if(str.contains("1"))//string contains 1
	{
		int pos1=str.indexOf("1");
		char ch1=str.charAt(pos1);
		String res=String.valueOf(ch1);
		StringBuffer ss1=new StringBuffer(str);
		String ss2=ss1.deleteCharAt(pos1).toString();
		int n=Integer.parseInt(ss2);
		int k=0;
		int aa=0;
		int a[]=new int[25];
		while(n!=0)
		{
			aa=n%10;
			a[k++]=aa;
			n=n/10;
		}
		for(int i=0;i<k;i++)
		{
			if(max<a[i])//find max value from that
				max=a[i];
		}
		String v1=String.valueOf(max);
		int pos2=ss2.indexOf(v1);
		res+=v1;
		StringBuffer ss3=new StringBuffer(ss2);
		ss4=ss3.deleteCharAt(pos2).toString();
		res+=":";
		String smin1=String.valueOf(ss4.charAt(0))+String.valueOf(ss4.charAt(1));
		String smin2=String.valueOf(ss4.charAt(1))+String.valueOf(ss4.charAt(0));
		int min1=Integer.parseInt(smin1);
		int min2=Integer.parseInt(smin2);
		if(min1<60 && min2<60)
		{
			if(max<min1)
				max=min1;
			if(max<min2)
				max=min2;
			res+=String.valueOf(max);
		}
		else if(min1<60 && min2>60)
		{
			res+=String.valueOf(min1);
		}
		else if(min1>60 && min2<60)
		{
			res+=String.valueOf(min2);
		}
		else if(min1>60 && min2>60)
		{
			System.out.println("invalid input");
		}
		System.out.println(res);
	}
	else if(str.contains("0"))//string contains 0
	{
		int pos1=str.indexOf("0");
		char ch1=str.charAt(pos1);
		String res=String.valueOf(ch1);
		StringBuffer ss1=new StringBuffer(str);
		String ss2=ss1.deleteCharAt(pos1).toString();
		int n=Integer.parseInt(ss2);
		int k=0;
		int aa=0;
		int a[]=new int[25];
		while(n!=0)
		{
			aa=n%10;
			a[k++]=aa;
			n=n/10;
		}
		for(int i=0;i<k;i++)
		{
			if(max<a[i])//find max value from that
				max=a[i];
		}
		String v1=String.valueOf(max);
		int pos2=ss2.indexOf(v1);
		res+=v1;
		StringBuffer ss3=new StringBuffer(ss2);
		ss4=ss3.deleteCharAt(pos2).toString();
		res+=":";
		String smin1=String.valueOf(ss4.charAt(0))+String.valueOf(ss4.charAt(1));
		String smin2=String.valueOf(ss4.charAt(1))+String.valueOf(ss4.charAt(0));
		int min1=Integer.parseInt(smin1);
		int min2=Integer.parseInt(smin2);
		if(min1<60 && min2<60)
		{
			if(max<min1)
				max=min1;
			if(max<min2)
				max=min2;
			res+=String.valueOf(max);
		}
		else if(min1<60 && min2>60)
		{
			res+=String.valueOf(min1);
		}
		else if(min1>60 && min2<60)
		{
			res+=String.valueOf(min2);
		}
		else if(min1>60 && min2>60)
		{
			System.out.println("invalid input");
		}
		System.out.println(res);
	}
	
	else
	{
		System.out.println("invalid input");
	}
}
else
{
	System.out.println("invalid input");
}


	}

}
