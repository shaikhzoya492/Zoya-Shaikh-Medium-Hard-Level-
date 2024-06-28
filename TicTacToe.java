
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class TicTacToe  implements ActionListener {
    Random random=new Random();
    JFrame jf1=new JFrame();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JLabel l1=new JLabel();
    JButton[] b1=new JButton[9];
    boolean player1_turn;
    
    TicTacToe(){
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(600,600);
        jf1.setLocation(350,100);
        jf1.setVisible(true);
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setText("Tic-Tac-Toe");
        l1.setFont(new Font("Ink Free",Font.BOLD,72));
        
        p1.setLayout(new BorderLayout());
        p1.setBounds(0,0,800,100);
        p2.setLayout(new GridLayout(3,3));
        
        for(int i=0;i<9;i++){
            b1[i]=new JButton();
            p2.add(b1[i]);
            b1[i].setFont(new Font("",Font.BOLD,120));
            b1[i].addActionListener(this);
            
        }
        
        p1.add(l1);
        jf1.add(p1,BorderLayout.NORTH);
        jf1.add(p2);
        
    }
    
    public void firstTurn(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(random.nextInt(2)==0){
            player1_turn=true;
            l1.setText("X turn");
            
        }
        else{
             player1_turn=false;
            l1.setText("O turn");
        }
        
    }
    public void check(){
        if(
                (b1[0].getText() =="X")&&
                (b1[1].getText() =="X")&&
                (b1[2].getText() =="X")
                ){
            xwins(0,1,2);
        }
         if(
                (b1[3].getText() =="X")&&
                (b1[4].getText() =="X")&&
                (b1[5].getText() =="X")
                ){
            xwins(3,4,5);
        }
          if(
                (b1[6].getText() =="X")&&
                (b1[7].getText() =="X")&&
                (b1[8].getText() =="X")
                ){
            xwins(6,7,8);
        }
           if(
                (b1[0].getText() =="X")&&
                (b1[3].getText() =="X")&&
                (b1[6].getText() =="X")
                ){
            xwins(0,3,6);
        }
            if(
                (b1[1].getText() =="X")&&
                (b1[4].getText() =="X")&&
                (b1[7].getText() =="X")
                ){
            xwins(1,4,7);
        }
             if(
                (b1[2].getText() =="X")&&
                (b1[5].getText() =="X")&&
                (b1[8].getText() =="X")
                ){
            xwins(2,5,8);
        }
              if(
                (b1[0].getText() =="X")&&
                (b1[4].getText() =="X")&&
                (b1[8].getText() =="X")
                ){
            xwins(0,4,8);
        }
               if(
                (b1[2].getText() =="X")&&
                (b1[4].getText() =="X")&&
                (b1[6].getText() =="X")
                ){
            xwins(2,4,6);
        }
               
               
               
               
               
               
               
               if(
                (b1[0].getText() =="O")&&
                (b1[1].getText() =="O")&&
                (b1[2].getText() =="O")
                ){
            owins(0,1,2);
        }
         if(
                (b1[3].getText() =="O")&&
                (b1[4].getText() =="O")&&
                (b1[5].getText() =="O")
                ){
            owins(3,4,5);
        }
          if(
                (b1[6].getText() =="O")&&
                (b1[7].getText() =="O")&&
                (b1[8].getText() =="O")
                ){
            owins(6,7,8);
        }
           if(
                (b1[0].getText() =="O")&&
                (b1[3].getText() =="O")&&
                (b1[6].getText() =="O")
                ){
            owins(0,3,6);
        }
            if(
                (b1[1].getText() =="O")&&
                (b1[4].getText() =="O")&&
                (b1[7].getText() =="O")
                ){
            owins(1,4,7);
        }
             if(
                (b1[2].getText() =="O")&&
                (b1[5].getText() =="O")&&
                (b1[8].getText() =="O")
                ){
            owins(2,5,8);
        }
              if(
                (b1[0].getText() =="O")&&
                (b1[4].getText() =="O")&&
                (b1[8].getText() =="O")
                ){
            owins(0,4,8);
        }
               if(
                (b1[2].getText() =="O")&&
                (b1[4].getText() =="O")&&
                (b1[6].getText() =="O")
                ){
            owins(2,4,6);
        }
        
    }
    public void xwins(int a,int b,int c){
        b1[a].setBackground(Color.green);
        b1[b].setBackground(Color.green);
        b1[c].setBackground(Color.green);
        
        for(int i=0;i<9;i++){
            b1[i].setEnabled(false);
            
        }
        l1.setText("X Wins");
    }
    public void owins(int a,int b,int c){
        b1[a].setBackground(Color.green);
        b1[b].setBackground(Color.green);
        b1[c].setBackground(Color.green);
        
        for(int i=0;i<9;i++){
            b1[i].setEnabled(false);
            
        }
        l1.setText("O Wins");
        
    }

public static void main(String[] args) 
    {
      TicTacToe obj=new TicTacToe();
     
    
}
public void  actionPerformed(ActionEvent e)
    {
        for(int i=0;i<9;i++){
            if(e.getSource()==b1[i]){
                if(player1_turn){
                    if(b1[i].getText()==""){
                        b1[i].setText("X");
                        player1_turn=false;
                        l1.setText("O turn");
                        check();
                    }
                }
                else{
                    if(b1[i].getText()==""){
                        b1[i].setText("O");
                        player1_turn=true;
                        l1.setText("X turn");
                         check();
                    }
                    
                }
            }
        }
    
    }
}