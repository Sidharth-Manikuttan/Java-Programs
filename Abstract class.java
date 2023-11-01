package Lab21;
abstract class Shape{
int side;
abstract void NumberOfsides();
abstract void SumOfAngles();
}
class Rectangle extends Shape{
Rectangle(int side){
this.side=side;
}
void NumberOfsides() {
System.out.println("Iam Rectangle,I have "+side+" sides.");
}
void SumOfAngles() {
System.out.println("The sum of all internal angles of a rectangle is : "+(side-2)*180);
}
}
class Triangle1 extends Shape{
Triangle1(int side){
this.side=side;
}
void NumberOfsides() {
System.out.println("Iam Triangle,I have "+side+" sides.");
}
void SumOfAngles() {
System.out.println("The sum of all internal angles of a triangle is : "+(side-2)*180);
}
}
class Hexagon extends Shape{
 Hexagon(int side){
this.side=side;
}
void NumberOfsides() {
System.out.println("Iam Hexagon,I have "+side+" sides.");
}
void SumOfAngles() {
System.out.println("The sum of all internal angles of a Hexagon is : "+(side-2)*180);
}
}
public class AstractDemo {
public static void main(String[] args) {
Rectangle r=new Rectangle(4);
Triangle1 t=new Triangle1(3);
Hexagon h=new Hexagon(6);
r.NumberOfsides();
    r.SumOfAngles();
    t.NumberOfsides();
    t.SumOfAngles();
    h.NumberOfsides();
    h.SumOfAngles();
}
}
