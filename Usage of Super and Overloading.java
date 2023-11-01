package Lab21;
import java.util.*;
class Employee1{
double Bsalary,HRA,DA,Gsalary;
void display(){
System.out.println("....EMPLOYEE....");
}
void calcSalary() {
Gsalary=Bsalary+((DA/100)*Bsalary)+(HRA/100)*Bsalary;
System.out.println("The Gross Salary of EMPLOYEE is "+Gsalary);
}
}
class Engineer extends Employee1{
Engineer(double Bsalary,double HRA,double DA){
this.Bsalary=Bsalary;
this.DA=DA;
this.HRA=HRA;
}
void display(){
super.display();
super.calcSalary();
System.out.println("....ENGINEER....");
}
void calcSalary() {
System.out.println("The Gross Salary of ENGINEER is "+(2*Gsalary));
}
}
public class InheritanceSuper {
public static void main(String[] args) {
double Bsalary,HRA,DA;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Basic Salary of the Employee");
Bsalary=sc.nextDouble();
System.out.println("Enter the DA % of the Employee");
DA=sc.nextDouble();
System.out.println("Enter the HRA % of the Employee");
HRA=sc.nextDouble();
Engineer e=new Engineer(Bsalary,HRA,DA);
e.display();
e.calcSalary();
sc.close();
}
}
