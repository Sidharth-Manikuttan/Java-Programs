package OOPJLAB;
import java.util.Scanner;
class Employee{
double salary,HRA,DA;
double grosssalary;
Employee(double salary,double DA,double HRA){
this.salary=salary;
this.DA=DA;
this.HRA=HRA;
}
void display() {
System.out.println("....Employee....");
}
void calcSalary() {
grosssalary=salary+((salary/100)*DA)+(salary/100)*HRA;
System.out.println("The Gross Salary of Employee is "+grosssalary);
}
}
class Engineer extends Employee{
Engineer(double salary,double DA,double HRA){
super(salary,DA,HRA);
}
void display(){
super.display();
super.calcSalary();
System.out.println("....Engineer....");
}
void calcSalary() {
System.out.println("The Gross Salary of Engineer is "+2*grosssalary);
}
}
public class EmployeDemo {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double DA,HRA,salary;
System.out.println("Enter the Basic Salary of the Employee:");
salary=sc.nextDouble();
System.out.println("Enter the DA% of the Employee");
DA=sc.nextDouble();
System.out.println("Enter the HRA of the Employee");
HRA=sc.nextDouble();
Engineer Eng=new Engineer(salary,DA,HRA);
Eng.display();
Eng.calcSalary();
}
}	
