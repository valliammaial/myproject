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
		char vovels[]={'a','e','i','o','u'};
		char consonant[]={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		for(int i=0;i<vovels.length;i++)
		{
			if(ch==vovels[i])
			{
				System.out.println("character is vovel");
			}
		}
		for(int i=0;i<consonant.length;i++)
		{
			if(ch==consonant[i])
			{
				System.out.println("character is consonant");
			}
		}
    }
}
