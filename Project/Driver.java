import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Driver extends JFrame implements ActionListener{
	JLabel top=new JLabel("Driver Information");
	JLabel l1= new JLabel("Name:");
	JLabel l2= new JLabel("Contact NO:");
	JLabel l3= new JLabel("Age:");
	JLabel l4= new JLabel("License NO:");
	JButton b2= new JButton("Search");
	JButton b1= new JButton("Logout");
	User u;
	
	public Driver(User u){
		this.u=u;
		setSize(400,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		top.setBounds(145,40,300,35);
		l1.setBounds(30,100,100,40);
		l2.setBounds(30,200,100,40);
		l3.setBounds(30,300,100,40);
		l4.setBounds(30,400,100,40);
		b1.setBounds(75,500,100,30);
		b2.setBounds(75+100+40,500,100,30);
		
		add(top);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a){
		if(a.getSource()==b1){
			setVisible(false);
			Login l=new Login(u,u.getU());
		}else{
			Search s=new Search(u);
		}
	}
	
}