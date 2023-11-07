package Lab21;
import java.io.*;
import java.util.*;
public class FileEvenOdd {
public static void main(String[] args) {
try {
int n,a,c;
Scanner sc=new Scanner(System.in);
File f=new File("number.txt");
if(f.exists()) {
System.out.println("File Exists");
}
else {
f.createNewFile();
System.out.println("File is created");
} 
System.out.println("Enter numbers of inputs : ");
n=sc.nextInt();
FileOutputStream fin1=new FileOutputStream("number.txt");
System.out.println("Enter the numbers : ");
for(int i=0;i<n;i++)
{
a=sc.nextInt();
fin1.write(a);
}
File fo=new File("odd.txt");
File fe=new File("even.txt");
if(fo.exists())
{
System.out.println("File exists");
}
else
{
fo.createNewFile();
System.out.println("new File created");
}
if(fe.exists())
{
System.out.println("File exists");
}
else
{
fe.createNewFile();
System.out.println("new File created");
}
FileInputStream fout=new FileInputStream("number.txt");
FileOutputStream fodd1=new FileOutputStream("odd.txt");
FileOutputStream feven1=new FileOutputStream("even.txt");
System.out.println("\nNumbers in the file number.txt are : ");
while((c=fout.read())!=-1)
{
System.out.println(c);
if(c%2==0)
feven1.write(c);
else
fodd1.write(c);
}
FileInputStream fodd2=new FileInputStream("odd.txt");
FileInputStream feven2=new FileInputStream("even.txt");
System.out.println("\nNumbers in the file odd.txt are : ");
while((c=fodd2.read())!=-1)
{
System.out.println(c);
}
System.out.println("\nNumbers in even.txt are : ");
while((c=feven2.read())!=-1)
{
System.out.println(c);
}
}
catch(Exception e) {
System.out.println(e);
}
}
}
