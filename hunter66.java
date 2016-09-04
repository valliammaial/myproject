
import java.util.Scanner;

public class h66 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
String str1[]=new String[n1];
for(int i=0;i<n1;i++)
{
	str1[i]=s.next();
}
int n2=s.nextInt();
String str2[]=new String[n2];

for(int i=0;i<n2;i++)
{
	str2[i]=s.next();
	
}
int count=0;
for(int i=0;i<n2;i++)
{
	for(int j=0;j<n1;j++)
	{
		if(str1[j].startsWith(str2[i]) && (str1[j].length()!=str2[i].length()))
		{
			count++;
		}
	}
}
System.out.println(count);
	}

}
