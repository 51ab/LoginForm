import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Login extends Applet implements ActionListener
{
Label l1,l2,l3,l4,l5;
TextField t1,t2,t3;
Button b1,b2;

public void init()
{
setLayout(null);
l1=new Label("Login Form");
l1.setBounds(100,20,120,20);
l2=new Label("User Name");
l2.setBounds(100,70,100,20);
l3=new Label("password");
l3.setBounds(100,100,100,20);
l4=new Label("Confirm");
l4.setBounds(100,130,100,20);
l5=new Label(" ");
l5.setBounds(100,200,220,100);
t1=new TextField();
t1.setBounds(160,70,100,20);
t2=new TextField();
t2.setBounds(160,100,100,20);
t3=new TextField();
t3.setBounds(160,130,100,20);
b1=new Button("ok");
b1.setBounds(130,160,50,20);
b2=new Button("cancel");
b2.setBounds(190,160,50,20);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(b1);
add(b2);
add(t1);
add(t2);
add(t3);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String uname,pass,confirm;
uname=t1.getText();
pass=t2.getText();
confirm=t3.getText();

if(uname.equals("INDIA")&&pass.equals("12345")&&confirm==pass)
l5.setText("welcome user");
else
l5.setText(" OOPS! SOMETHING WENT WRONG ");
}
}
//<applet code="Login.class" width="600" height="500">
//</applet>

