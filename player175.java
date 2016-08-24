import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;
public class p175 {

	public static void main(String[] args) {
		
String str1;
String str2;
Scanner s=new Scanner(System.in);
str1=s.next();
str2=s.next();
Set set=new TreeSet();
char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();
for(int i=0;i<str1.length();i++)
{
	set.add(ch1[i]);
}
for(int i=0;i<str2.length();i++)
{
	set.add(ch2[i]);
}
if(set.size()==26)
	System.out.println("complementary");
else
	System.out.println("not complementary");
	}

}
