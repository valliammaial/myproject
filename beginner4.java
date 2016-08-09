import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if(Character.isAlphabetic(ch))
		System.out.println("Given character is alphabet");
		else
		System.out.println("Given character is not alphabet");
	}
}
