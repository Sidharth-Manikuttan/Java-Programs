package OOPJLAB;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String rev="";
char ans;
do{
System.out.println("Enter the string to check whether it is palindrome or     not:");
String str=s.next();
int length=str.length();
for(int i=(length-1);i>=0;i--)
{
rev = rev+ str.charAt(i);
}
if (str.toLowerCase().equals(rev.toLowerCase()))
{
System.out.println(str + " is a Palindrome String.");
}
else {
System.out.println(str + " is not a Palindrome String.");
}
System.out.println("Do you want to continue:(y/n)");
ans=s.next().charAt(0);
}while(ans=='Y'||ans=='y');
}
}
