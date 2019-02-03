import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Search extends JFrame implements ActionListener{
	
	JLabel l1= new JLabel("Area:");
	JLabel l2= new JLabel("Date:");
	JLabel l3= new JLabel("Service:");
	JButton b1= new JButton("Cancel");
	JButton b2= new JButton("Go");
	String[] year={"2016","2017"};
	String[] mon={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	String[] date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String[] area ={"Banani","Dhanmondi","Mirpur","Rampura","Mohammodpur","Farmget"};
	JComboBox yearList = new JComboBox(year);
	JComboBox monList= new JComboBox(mon);
	JComboBox dateList= new JComboBox(date);
	JComboBox areaList=new JComboBox(area);
	JRadioButton rb1=new JRadioButton();
	JRadioButton rb2=new JRadioButton();
    JRadioButton rb3=new JRadioButton();
	ButtonGroup bg1= new ButtonGroup();
	User u;


	
	public Search(User u){
		this.u=u;
		setSize(400,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1.setBounds(30,100,100,40);
		l2.setBounds(30,200,100,40);
		l3.setBounds(30,300,100,40);
		
		b1.setBounds(30,500,100,30);
		b2.setBounds(210,500,100,30);
		rb1.setBounds(30+30,300,80,30);
		rb2.setBounds(30+30+40,300,80,30);
		rb3.setBounds(30+30+90,300,80,30);
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		
		yearList.setBounds(30+40,200,200,40);
		monList.setBounds(30+40+50,200,200,40);
		dateList.setBounds(30+40+50+40,200,200,40);
		areaList.setBounds(30+40,100,200,40);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(b2);
		add(rb1);
		add(rb2);
		add(rb3);
		add(areaList);
		add(yearList);
		add(monList);
		add(dateList);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() ==b1)
		{ setVisible(false);
	       Driver d=new Driver(u);
		}
		else if(a.getSource()== b2)
		{
			setVisible(false);
		}
		
		
	}
	
}