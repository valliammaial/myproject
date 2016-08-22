import java.io.*;
import java.util.*;
import java.lang.*;
class h96
{
public static void main(String args[])
{
String str;
Scanner s=new Scanner(System.in);
str=s.next();
int len=str.length();
char arr[]=str.toCharArray();
char ch=str.charAt(len-1);
String alpha="abcdefghijklmnopqrstuvwxyz";
char al[]=alpha.toCharArray();
int ind=alpha.indexOf(ch)+1;
String ss="";
for(int i=0;i<arr.length-2;i++)
{
int ind1=alpha.charAt(arr[i])+1;
int ind2=ind1-ind;
char aa=alpha.charAt(ind2);
ss+=aa;
}
ss+=str.charAt(len-1);
System.out.println(ss);
}
}
