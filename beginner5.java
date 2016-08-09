import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if((a>b) && (a>c))
		System.out.println("largest no is:"+a);
		else if((b>a) && (b>c))
		System.out.println("largest no is:"+b);
		else
		System.out.println("largest no is:"+c);
	}
}
