import java.awt.*;
import javax.swing.*;

class Welcome extends JFrame{
	JLabel l1= new JLabel("Welcome To Wheals Of Dhaka");
	JLabel l2=new JLabel("Which WD Service You Want at The Moment ?");
	JButton b1 = new JButton("Drop Off");
	JButton b2 = new JButton("Drive for Day");
	JButton b3 = new JButton("Tour");
	JLabel name;
	User u;
	
	public Welcome(User u){
		this.u=u;
		setVisible(true);
		setSize(400,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		name = new JLabel(u.getF()+" "+u.getL());
		l1.setBounds(20,50,400,50);
		name.setFont(new Font("Kondor",Font.PLAIN,15));
		l1.setFont(new Font("Dimitri", Font.BOLD,22));
		name.setBounds(150,100,150,50);
		add(l1);
		add(name);
		b1.setBounds(70,200,250,60);
		b1.setFont(new Font("Bitsumishi", Font.BOLD,20));
		b2.setFont(new Font("Bitsumishi", Font.BOLD,20));
		b3.setFont(new Font("Bitsumishi", Font.BOLD,20));
		b2.setBounds(70,270,250,60);
		b3.setBounds(70,340,250,60);
		add(b1);
		add(b2);
		add(b3);
	}
	
	
	
}