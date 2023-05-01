import java.io.*;
import javax.swing.*;
class A {

public static void main(String[] args) {
JFrame f= new JFrame();
JLabel l1=new JLabel("Enter first no =");
l1.setBounds(50,50,100,20); //x-axis,y-axis,length and height

JLabel l2= new JLabel("Enter Second no=");
l2.setBounds(50,80,100,20);

JTextField T1 = new JTextField();
T1.setBounds(160,50,50,20);

JTextField T2 = new JTextField();
T2.setBounds(160,80,50,20);


JCheckBox CB1 = new JCheckBox("ECE");
CB1.setBounds(20,160,50,20);

JCheckBox CB2 = new JCheckBox("CSE");
CB2.setBounds(20,180,50,20);

JCheckBox CB3 = new JCheckBox("MEC");
CB3.setBounds(20,200,50,20);

JButton b=new JButton("ADD");
b.setBounds(80,190,80,20);

JLabel l3 = new JLabel("Result =");
l3.setBounds(160,190,50,20);

f.add(l1);f.add(l2);f.add(T1);f.add(T2);f.add(b);f.add(l3);f.add(CB1);f.add(CB2);f.add(CB3);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
}