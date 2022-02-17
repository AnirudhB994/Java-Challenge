package QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Answers extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    int sc;
    Answers(){ 
        setBounds(600, 200, 800, 650);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        	

        
        JLabel l1 = new JLabel("Explanation of answers");
        l1.setForeground(new Color(60, 100, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(240, 10, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 40, 600, 500);
        l2.setText(
            "<html>"+ 
                "1. JDB" + "<br><br>" +
                "2. int" + "<br><br>" +
                "3. java.util.package" + "<br><br>" +
                "4. Marker Interface" + "<br><br>" +
                "5. Heap Memory" + "<br><br>" +
                "6. Remote Interface" + "<br><br>" +
                "7. import" + "<br><br>" +
                "8. Java Archive" + "<br><br>" +
                "9. java.lang.StringBuilder" + "<br><br>" +
                "10.Bytecode is executed by JVM" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Play Again");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        
        b2.setBounds(400, 500, 100, 30);
        add(b2);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Score(username,sc);
        }else if(ae.getSource() == b2){
        	this.setVisible(false);
            new Welcome().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Answers();
    }
}

