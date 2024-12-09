package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    
    Splash()
    {
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(200, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color. BLACK);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        JButton clickhere = new JButton("Click Here To Continue");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);

        setSize(1170, 650);
        setLocation(300, 100);
        setVisible(true);
        
        while(true)
        {
            heading.setVisible(false);
            try{
                Thread.sleep(450);
            }catch(Exception e){
                
            }
            
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e)
            {
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[])
    {
        new Splash();
    }
}
 