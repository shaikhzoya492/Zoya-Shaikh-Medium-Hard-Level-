package quiz;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        JLabel heading = new JLabel("Thank you  for playing Quiz");
        heading.setBounds(200, 150, 700, 30);
        heading.setFont(new Font("Ink Free", Font.BOLD, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score+"/100");
        lblscore.setBounds(240, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(lblscore);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false); 
    }
    public static void main(String[] args) {
        new Score("User", 0);
    }
}
