import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if((n%4==0) && (n%100!=0) || (n%400==0))
		System.out.println("Leap year");
		else
		System.out.println("not a leap year");
	}
}
