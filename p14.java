import java.io.*;
import java.util.*;
import java.lang.*;
public class p14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s=new Scanner(System.in);
		str=s.next();
		StringBuffer sb=new StringBuffer(str);
		String s1=sb.reverse().toString();
		//System.out.println(s1);
		char ch[]=s1.toCharArray();
		String last="";
		
		char vovels[]={'a','e','i','o','u'};
		for(int i=0;i<ch.length;i++)
		{
		boolean flag=false;
		for(int j=0;j<vovels.length;j++)
		{
		if(ch[i]==vovels[j])
		{
		flag=true;
		break;
		}
		}
		if(!flag)
		{
			//System.out.println(ch[i]);
			last+=ch[i];

		}
				}
		System.out.println(last);
		

	}

}
