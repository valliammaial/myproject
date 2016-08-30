
import java.util.Scanner;

public class h111 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String ss[]=str.split(" ");
String first="abcdefghijklm";
String first1="ABCDEFGHIJKLM";
String second="nopqrstuvwxyz";
String second1="NOPQRSTUVWXYZ";
boolean flag=true;
for(int i=0;i<ss.length;i++)
{
	
	char ch[]=ss[i].toCharArray();
    if(first.contains(String.valueOf(ch[0])) ||first1.contains(String.valueOf(ch[0])))
    {  
    	flag=true;
    	
	   for(int j=1;j<ch.length;j=j+2)
	   {
		   if(second.contains(String.valueOf(ch[j])) || second1.contains(String.valueOf(ch[j])))
		   {
			   flag=true;
			   if((j+1)<ch.length)
			   {
			  if(first.contains(String.valueOf(ch[j+1])) || first1.contains(String.valueOf(ch[j+1])))
			   {
				flag=true;
			    }
			  else
			  {
				  flag=false;
				  break;
			  }
			  }
			   else
			   {
				   flag=false;
				   break;
			   }
		   }
	   }
	   if(flag)
		   System.out.println(ss[i]+" is balanced");
	   else
		   System.out.println(ss[i]+" is not balanced");
    }
    else if(second.contains(String.valueOf(ch[0])) || second1.contains(String.valueOf(ch[0])))
    {
    	flag=true;
    	
    	for(int j=1;j<ch.length;j=j+2)
    	{
    		if(first.contains(String.valueOf(ch[j])) || first1.contains(String.valueOf(ch[j])))
    		{
    			flag=true;
    			
    			if((j+1)<ch.length)
    			{
    				if(second.contains(String.valueOf(ch[j+1])) || second1.contains(String.valueOf(ch[j+1])))
    				{
    					
    					flag=true;
    				}
    				else
    				{
    					flag=false;
    					break;
    				}
    			}
    		}
    		else
    		{
    			flag=false;
    			break;
    		}
    		
    	}
    	if(flag)
    		System.out.println(ss[i]+" is balanced");
    	else
    		System.out.println(ss[i]+" is not balanced");
    }
    
	
}
	}

}
