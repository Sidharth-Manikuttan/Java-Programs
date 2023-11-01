package lab21;
import java.util.*;
class shape{
float height1,side1,side2;
double base,height,radius;
int length,width;
void area(double base,double height){
System.out.println("The area of the triangle with base:"+base+" and height:"+height+"is:"+(base*height)/2);
}
void area(int length,int width) {
System.out.println("The area of rectangle with length : "+length+" and width : "+width+" is : "+(length*width));
}
void area(double radius) {
System.out.println("The area of circle with radius : "+radius+" is : "+(3.14*radius*radius));
}
void area(float side1,float side2,float height1) {
System.out.println("The area of trapezium with sides :"+side1+" and "+side2+" and height "+height1+" is : "+((side1+side2)*height1)/2);
}
}
public class ComputeArea1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
shape a=new shape();
System.out.print("Enter the base of the triangle ");
a.base=sc.nextDouble();
System.out.print("Enter the height of the triangle ");
a.height=sc.nextDouble();
System.out.print("Enter the width of the rectangle ");
a.width=sc.nextInt();
System.out.print("Enter the height of rectangle ");
a.length=sc.nextInt();
System.out.print("Enter the radius of circle ");
a.radius=sc.nextDouble();
System.out.print("Enter the parallel sides and height of trapizium ");
a.side1=sc.nextFloat();
a.side2=sc.nextFloat();
a.height1=sc.nextFloat();
a.area(a.base,a.height);
a.area(a.width,a.length);
a.area(a.radius);
a.area(a.side1,a.side2,a.height1);
}
}
