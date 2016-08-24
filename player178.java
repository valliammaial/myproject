import java.util.Scanner;

public class p178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
int len=str.length();
boolean occur=false;
char a[]=str.toCharArray();
for(int i=0;i<len;i++)
{
	occur=false;
	for(int k=0;k<i;k++)
	{
		if(a[i]==a[k])
			occur=true;
	}
	if(!occur)
	{
		for(int j=i+1;j<len;j++)
		{
			if(a[i]==a[j])
			{
		       char c=str.charAt(i);
               char cc=str.charAt(j);
               StringBuffer sb=new StringBuffer(str);
               sb.setCharAt(i,Character.toUpperCase(c));
               sb.setCharAt(j,Character.toUpperCase(cc));
               str=sb.toString();
               
			}
		}
	   
	}
}
System.out.println(str);
	}

}
