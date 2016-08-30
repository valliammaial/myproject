
import java.util.Scanner;

public class p117 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
String str=s.next();
StringBuffer sb=new StringBuffer(str);
String ss=sb.reverse().toString();
char ch[]=ss.toCharArray();
for(int i=0;i<ch.length;i++)
{
	System.out.print(ch[i]+""+(i==ss.length()-1?"":"-"));
	
		
	
}
	}

}
