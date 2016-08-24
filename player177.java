import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
String ss[]=str.split(" ");
String s2="";
for(int i=0;i<ss.length;i++)
{
	String s1=ss[i];
	ArrayList<Character> a=new ArrayList<Character>();
	char ch[]=s1.toCharArray();
	for(int j=0;j<ch.length;j++)
	{
		a.add(ch[j]);	
	}
	for(char c:a)
	{
		if(Character.isAlphabetic(c))
	         Collections.sort(a);
	}		
	for(char c1:a)
		System.out.print(c1);
	System.out.print(" ");
    
}

	}

}
