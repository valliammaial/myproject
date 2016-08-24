import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
String str=String.valueOf(n);
ArrayList<Character> a=new ArrayList<Character>();
char ch[]=str.toCharArray();
String last="";
int k;
k=s.nextInt();
for(int i=0;i<str.length();i++)
{
	a.add(ch[i]);
}
Collections.sort(a);
for(char c:a)
{
	last+=c;
}
int len=last.length();
System.out.println(last.substring(0,len-k));
	}

}
