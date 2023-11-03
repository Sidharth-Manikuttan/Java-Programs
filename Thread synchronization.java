package Lab22;
import java.util.Scanner;
class Table {
public void printtable(int n) {
synchronized(this) {
for(int i=1;i<=5;i++)
{
System.out.println(n+"+"+i+"="+(n+i));
try {
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
}
class Thread1 extends Thread {
Table t;
int n;
Thread1(Table t)
{
this.t=t;
}
public void run()
{
t.printtable(n);
}
}
class Thread2 extends Thread {
Table t;
int n;
Thread2(Table t)
{
this.t=t;
}
public void run()
{
t.printtable(n);
}
}
class Thread3 extends Thread {
Table t;
int n;
Thread3(Table t)
{
this.t=t;
}
public void run()
{
t.printtable(n);
}
}
public class Synchronization {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Table t=new Table();
Thread1 obj1=new Thread1(t);
Thread2 obj2=new Thread2(t);
Thread3 obj3=new Thread3(t);
System.out.println("Enter the Table you want to run by Thread1 : ");
obj1.n=sc.nextInt();
System.out.println("Enter the Table you want to run by Thread2 : ");
obj2.n=sc.nextInt();
System.out.println("Enter the Table you want to run by Thread3 : ");
obj3.n=sc.nextInt();
obj1.start();
obj2.start();
obj3.start();
sc.close();
}
}
