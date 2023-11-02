package OOPJLAB;
import java.util.Scanner;
public class Frequency {
public static void main(String[] args) {
char ch;
do{
int count=0;
int flag=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a string:");
String str=s.nextLine();
System.out.println("Enter the character:");
char element=s.next().charAt(0);
String str1=str.toLowerCase();
int length=str1.length();
for(int i=0;i<length;i++)
{
if(str1.charAt(i)==element)
{
count++;
}
}
System.out.println("The character "+element+" has appeared "+count+" times");
System.out.println("Do you want to continue(y/n)");
ch=s.next().charAt(0);
}while(ch=='y');
}
}
