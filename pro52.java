import java.io.*;
import java.util.*;
import java.lang.*;
public class pro52 {
public static void main(String[] args) {
int x1,y1,x2,y2,x3,y3,x4,y4;
Scanner s=new Scanner(System.in);
x1=s.nextInt();
y1=s.nextInt();
x2=s.nextInt();
y2=s.nextInt();
x3=s.nextInt();
y3=s.nextInt();
x4=s.nextInt();
y4=s.nextInt();
int d1,d2,d3,d4;
d1=x1-x4;
d2=y4-y3;
d3=x2-x3;
d4=y1-y2;
if(Math.abs(d1)==Math.abs(d3)&&Math.abs(d2)==Math.abs(d4))
	System.out.println("Square");
else
	System.out.println("Not Square");
	
	}

}
