import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Test extends JFrame {

    public Test() {
        JPanel rect1 = new JPanel();
        rect1.setBounds(101, 650, 900, 50);
        rect1.setBackground(Color.RED);
        getContentPane().add(rect1);

        JPanel rect2 = new JPanel();
        rect2.setBounds(0, 650, 100, 1000);
        rect2.setBackground(Color.BLUE);
        getContentPane().add(rect2);

        JPanel rect3 = new JPanel();
        rect3.setBounds(101, 700, 900, 950);
        rect3.setBackground(Color.GREEN);
        getContentPane().add(rect3);

       setTitle("TEST");
       setSize(1000, 700);

       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }


    
    
}