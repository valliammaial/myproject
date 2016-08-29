import java.util.Scanner;

public class p122 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
String str=s.next();
String sub=str.substring(3,5);
if(sub.equals("01"))
	System.out.println("January");
else if(sub.equals("02"))
	System.out.println("February");
else if(sub.equals("03"))
	System.out.println("March");
else if(sub.equals("04"))
	System.out.println("April");
else if(sub.equals("05"))
	System.out.println("May");
else if(sub.equals("06"))
	System.out.println("June");
else if(sub.equals("07"))
	System.out.println("July");
else if(sub.equals("08"))
	System.out.println("August");
else if(sub.equals("09"))
	System.out.println("September");
else if(sub.equals("10"))
	System.out.println("October");
else if(sub.equals("11"))
	System.out.println("November");
else if(sub.equals("12"))
	System.out.println("December");
	}

}
