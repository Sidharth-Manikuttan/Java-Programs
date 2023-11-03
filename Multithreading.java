package Lab22;
import java.util.Random;
import java.util.Scanner;
class Rthread extends Thread
{
int limit;
public void run()
{
for(int i=0;i<limit;i++)
{
Random r=new Random();
int n=r.nextInt(100);
System.out.println("Random Number : "+n);
if(n%2==0)
{
threadEven t2=new threadEven(n);
t2.start();
}
else
{
threadOdd t3=new threadOdd(n);
t3.start();
}
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class threadEven extends Thread
{
int n1;
threadEven(int n)
{
n1=n;
}
public void run()
{
System.out.println("Square of "+n1+" = "+n1*n1);
}
}
class threadOdd extends Thread
{
int n2;
threadOdd(int n)
{
n2=n;
}
public void run()
{
System.out.println("Cube of "+n2+" = "+n2*n2*n2);
}
}
public class MultiThreading {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Rthread t1=new Rthread();
System.out.println("Enter the number of random number you want to create : ");
t1.limit=sc.nextInt();
t1.start();
}
}
