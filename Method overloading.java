package OOPJLAB;
import java.util.Scanner;
class Area
{
double CalcArea(double h,double b)
{
return (h*b)/2;
}
float CalcArea(float h,float w)
{
return (h*w);
}
double CalcArea(double r)
{
return (3.14*(r*r));
}
double CalcArea(double a,double b,double h)
{
return (0.5*(a+b)*h);
}
}
public class CalculateArea {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
double tbase,theight,cradius,atrap,btrap,htrap;
float rwidth,rheight;
Area obj=new Area();
System.out.println("Enter the height of the triangle");
theight=s.nextInt();
System.out.println("Enter the base length of the triangle");
tbase=s.nextInt();
System.out.println("Enter the height of the rectangle");
rheight=s.nextInt();
System.out.println("Enter the width of the rectangle");
rwidth=s.nextInt();
System.out.println("Enter the radius of the circle");
cradius=s.nextInt();
System.out.println("Enter the lengths of Parallel sides and height  of the Trapezium ");
atrap=s.nextInt();
btrap=s.nextInt();
htrap=s.nextInt();
System.out.println("Area of Traingle with base "+tbase+" and height "+theight+" is: "+obj.CalcArea(theight,tbase));
System.out.println("Area of rectangle with width "+rwidth+" and height "+rheight+" is: "+obj.CalcArea(rheight,rwidth));
System.out.println("Area of circle with radius "+cradius+" is: "+obj.CalcArea(cradius));
System.out.println("Area of Trapezium: "+obj.CalcArea(atrap,btrap,htrap));
}
}
