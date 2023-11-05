package Lab21;
abstract class Animal{
protected int legs;
protected Animal(int legs) {
this.legs=legs;
}
abstract void eat();
void walk() {
if(legs==0)
{
System.out.println("Fish can't walk");
}
else
{
System.out.println("This animal walk by "+legs+" legs");
}
}
}
class Spider extends Animal {
Spider(int legs) {
super(8);
}
void eat() {
System.out.println("Spider eat insects");
}
}
interface Pet {
public String getName();
public void setName(String name);
public void play();
}
class Cat extends Animal implements Pet {
String name;
Cat(String name) {
super(4);
this.name=name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name=name;
}
public void eat() {
System.out.println("Cat eat Fishes");
}
public void play() {
System.out.println("Cat plays with rats");
}
}
class Fish extends Animal implements Pet {
String name;
Fish() {
super(0);
}
public void setName(String name) {
this.name=name;
}
public String getName() {
return name;
}
public void play() {
}
public void walk() {
super.walk();
System.out.println("Fish has no legs.");
}
public void eat() {
System.out.println("Fish eat plants");
}
}
public class multipleInterface {
public static void main(String[] args) {
System.out.println("FISH");
Fish f=new Fish();
f.setName("Mimi");
System.out.println("This fish's name is "+f.getName());
f.eat();
f.walk();
f.setName("Momo");
System.out.println("This fish's name is "+f.getName()+"\n");
System.out.println("CAT");
Cat c=new Cat("Fluffy");
System.out.println("This cat's name is "+c.getName());
c.walk();
c.play();
c.eat();
c.setName("Moose");
System.out.println("This cat's name is "+c.getName()+"\n");
System.out.println("SPIDER");
Spider ob=new Spider(8);
ob.eat();
ob.walk();
}
}
