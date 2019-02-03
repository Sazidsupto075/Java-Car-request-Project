import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Login extends JFrame implements ActionListener{
	
	
	private Color c1= Color.RED;
	private JLabel l1=new JLabel("Username", JLabel.CENTER);
	private JLabel l2=new JLabel("Password", JLabel.CENTER);
	private JLabel background = new JLabel(new ImageIcon("F:\\Pictures\\Car.jpg"));
	private JTextField t1=new JTextField();
	private JPasswordField t2=new JPasswordField();
	private JButton b1=new JButton("Login");
	private JButton b2=new JButton("Register");
	private User u;
	
	public Login(){
		setVisible(true);
		setSize(400,600);
		setLayout(null);
		setContentPane(background);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1.setBounds(40,200,90,35);
		l2.setBounds(40,250,90,35);
		l1.setFont(new Font("Times New Roman", Font.BOLD,15));
		l2.setFont(new Font("Times New Roman", Font.BOLD,15));
		add(l1);
		add(l2);
		l1.setForeground(c1);
		l2.setForeground(c1);
		t1.setBounds(75+60+20,205,175,28);
		t2.setBounds(75+60+20,255,175,28);
		add(t1);
		add(t2);
		b1.setBounds(75+40,350,90,30);
		b2.setBounds(75+40+100,350,90,30);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}
	public Login(User u){
		this();
		this.u=u;
		
	}public Login(User u,String s){
		this(u);
		t1.setText(s);
	}
	
	public void actionPerformed(ActionEvent a){
		String p=new String(t2.getPassword());
		
		if(a.getSource()==b1){
			if(t1.getText().equals(u.getU()) && p.equals(u.getP())){
				if(u.getA()=="Passenger"){
					setVisible(false);
					Welcome w= new Welcome(u);
				}else{
					setVisible(false);
					Driver d=new Driver(u);
				}
			}else{
				JOptionPane.showMessageDialog(this,"Wrong Username or Password");
			}
		}else if(a.getSource()==b2){
			setVisible(false);
			Reg r = new Reg();
			
		}
	}
}