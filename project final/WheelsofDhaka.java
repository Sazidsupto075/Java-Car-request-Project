import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class Wheels{
	
	public JTable getInfo(){
		JTable table=new JTable();
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wheels","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from driver where userName='aa'");
			
		}
		catch(SQLException g){
			
		}
		catch(Exception eq){
		
		}
		
		
		
		
		return table;
	}
	
}
