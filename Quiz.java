package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        setBounds(0, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        qno = new JLabel();
        qno.setBounds(100, 250, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 250, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "Who directed the film “Zindagi Na Milegi Dobara”?";
        questions[0][1] = "Zoya Akhtar";
        questions[0][2] = "Farhan Akhtar";
        questions[0][3] = "Karan Johar";
        questions[0][4] = "Sanjay Leela Bhansali";

        questions[1][0] = "Which song from the film “Kabhi Khushi Kabhie Gham” became a chartbuster?";
        questions[1][1] = "“Suraj Hua Maddham”";
        questions[1][2] = "“Yeh Ladka Hai Deewana”";
        questions[1][3] = "“Bole Chudiyan”";
        questions[1][4] = "“Say Shava Shava”";

        questions[2][0] = "Which actor played the role of “Kabir Khan” in the movie “Kabir Singh“?";
        questions[2][1] = "Shahid Kapoor";
        questions[2][2] = "Varun Dhawan";
        questions[2][3] = "Ranveer Singh";
        questions[2][4] = "Arjun Kapoor";

        questions[3][0] = "Who is known as the “King of Bollywood”?";
        questions[3][1] = "Shah Rukh Khan";
        questions[3][2] = "Amitabh Bachchan";
        questions[3][3] = "Salman Khan";
        questions[3][4] = "Aamir Khan";

        questions[4][0] = "Who played the role of “Mogambo” in the movie “Mr. India”?";
        questions[4][1] = "Amrish Puri";
        questions[4][2] = "Om Puri";
        questions[4][3] = "Paresh Rawal";
        questions[4][4] = "Naseeruddin Shah";

        questions[5][0] = "Which film won the National Film Award for Best Hindi Film in 2019?";
        questions[5][1] = "Andhadhun";
        questions[5][2] = "Badhaai Ho";
        questions[5][3] = "Uri: The Surgical Strike";
        questions[5][4] = "Gully Boy";

        questions[6][0] = "Which actor played the role of “Bajirao” in the film “Bajirao Mastani”?";
        questions[6][1] = "Hrithik Roshan";
        questions[6][2] = "Ranveer Singh";
        questions[6][3] = "Shah Rukh Khan";
        questions[6][4] = "Salman Khan";

        questions[7][0] = "Which actress played the role of “Piku” in the film “Piku”?";
        questions[7][1] = "Deepika Padukone";
        questions[7][2] = "Priyanka Chopra";
        questions[7][3] = "Anushka Sharma";
        questions[7][4] = "Alia Bhatt";

        questions[8][0] = "Which actor played the role of “Chulbul Pandey” in the film “Dabangg”?";
        questions[8][1] = "Ajay Devgn";
        questions[8][2] = "Salman Khan";
        questions[8][3] = "Shah Rukh Khan";
        questions[8][4] = "Akshay Kumar";

        questions[9][0] = "Who sang the song “Tum Hi Ho” from the film “Aashiqui 2”?";
        questions[9][1] = "Atif Aslam";
        questions[9][2] = "Armaan Malik";
        questions[9][3] = "Arijit Singh";
        questions[9][4] = "Mohit Chauhan";
        
        answers[0][1] = "Zoya Akhtar";
        answers[1][1] = "“Bole Chudiyan”";
        answers[2][1] = "Shahid Kapoor";
        answers[3][1] = "Shah Rukh Khan";
        answers[4][1] = "Amrish Puri";
        answers[5][1] = "Gully Boy";
        answers[6][1] = "Ranveer Singh";
        answers[7][1] = "Deepika Padukone";
        answers[8][1] = "Salman Khan";
        answers[9][1] = "Arijit Singh";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 320, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 360, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 400, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 440, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1000, 260, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1000, 310, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
       
        
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1000, 370, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
     
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}