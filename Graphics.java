package Lab22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUITrafficLight extends JPanel implements ActionListener {
JRadioButton r1,r2,r3;
Color red,yellow,green;
GUITrafficLight(){
setBounds(0,0,640,480);
r1=new JRadioButton("Red");
r2=new JRadioButton("Yellow");
r3=new JRadioButton("Green");
r1.setSelected(true);
red=Color.red;
yellow=Color.white;
green=Color.white;
ButtonGroup bg=new ButtonGroup();
bg.add(r1); bg.add(r2); bg.add(r3);
add(r1);
add(r2);
add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if(r1.isSelected()==true) {
red=Color.red;
yellow=Color.white;
green=Color.white;
}
else if(r2.isSelected()==true) {
red=Color.white;
yellow=Color.yellow;
green=Color.white;
}
else if(r3.isSelected()==true) {
red=Color.white;
yellow=Color.white;
green=Color.green;
}
repaint();
}
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawOval(50, 50, 50, 50);
g.drawOval(50, 110, 50, 50);
g.drawOval(50, 170, 50, 50);
g.setColor(red);
g.fillOval(50, 50, 50, 50);
g.setColor(yellow);
g.fillOval(50, 110, 50, 50);
g.setColor(green);
g.fillOval(50, 170, 50, 50);
}
public static void main(String[] args) {
JFrame f=new JFrame("Traffic Light");
GUITrafficLight GTL=new GUITrafficLight();
f.add(GTL);
f.setSize(400,400);
f.setVisible(true);
}
}
