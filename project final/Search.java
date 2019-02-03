import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Search extends JFrame implements ActionListener{
	

	JLabel l2= new JLabel("Date:");
	JLabel l3= new JLabel("Service:");
	JButton b1= new JButton("Cancel");
	JButton b2= new JButton("Go");
	String[] year={"2016","2017"};
	String[] mon={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	String[] date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	JComboBox yearList = new JComboBox(year);
	JComboBox monList= new JComboBox(mon);
	JComboBox dateList= new JComboBox(date);
	JRadioButton rb1=new JRadioButton("Drop Off");
	JRadioButton rb2=new JRadioButton("Drive for Day");
    JRadioButton rb3=new JRadioButton("Tour");
	ButtonGroup bg1= new ButtonGroup();
	User u;


	
	public Search(User u){
		this.u=u;
		setSize(400,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		l2.setBounds(30,100,100,35);
		l3.setBounds(30,250,100,35);
		
		b1.setBounds(75,500,100,30);
		b2.setBounds(75+100+40,500,100,30);
		rb1.setBounds(30+100,250,150,30);
		rb2.setBounds(30+100,280,150,30);
		rb3.setBounds(30+100,310,150,30);
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		
		yearList.setBounds(30+100,100,60,35);
		monList.setBounds(30+100+60,100,60,35);
		dateList.setBounds(30+100+60+60,100,60,35);
		
		
		add(l2);
		add(l3);
		add(b1);
		add(b2);
		add(rb1);
		add(rb2);
		add(rb3);
		add(yearList);
		add(monList);
		add(dateList);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent a){
		
		if(a.getSource() ==b1){ 	
			setVisible(false);
			Driver d=new Driver(u);
		}
		else if(a.getSource()== b2){
			String date= yearList.getSelectedItem().toString()+"-"+monList.getSelectedItem().toString()+"-"+dateList.getSelectedItem().toString();
			String t;
			if(rb1.isSelected()){
				t="dropoff";
			}else if(rb2.isSelected()){
				t="driveday";
			}else{
				t="tour";
			}
			SearchResult s=new SearchResult(u,date,t);
			setVisible(false);
		}
		
		
	}
	
}