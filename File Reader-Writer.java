package Lab21;
import java.util.*;
import java.io.*;
public class Fileprogram {
public static void main(String[] args)throws IOException {
Scanner sc=new Scanner(System.in);
try {
File f=new File("sample.txt");
if(f.exists()) {
System.out.println("File Exists");
}
else {
f.createNewFile();
System.out.println("File is created");
}
String c;
System.out.println("Enter the contents of the file");
c=sc.nextLine();
FileWriter fin=new FileWriter(f);
fin.write(c);
System.out.println("Content is entered into sample.txt");
fin.close();
File f1=new File("new-sample.txt");
if(f1.exists())
{
System.out.println("File exists ");
}
else
{
f1.createNewFile();
System.out.println("Created new-sample.txt file");
}
FileReader f2=new FileReader("sample.txt");
char[] content=new char[50];
f2.read(content);
f2.close();
System.out.println("Content of "+f.getName()+" is : ");
System.out.println(content);
FileWriter f3=new FileWriter("new-sample.txt");
f3.write(content);
f3.close();
System.out.println("\nCopied content from "+f.getName()+" to "+f1.getName());
FileReader f4=new FileReader("new-sample.txt");
BufferedReader br=new BufferedReader(f4);
String s;
System.out.println("\nContent of "+f1.getName()+" is :");
while((s=br.readLine())!=null)
{
System.out.print(c);
}
}
catch(FileNotFoundException e1)
{
System.out.println("File not Found");
}
}
}
