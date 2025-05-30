package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SIP_Calculator implements ActionListener {
    JFrame frame1=new JFrame("SIP Calculator");
    JButton calculate=new JButton("Calculate");
    ImageIcon logo=new ImageIcon("D:\\Coding Tutorial\\Web Development\\HTML Lessons\\images\\calculator.jpg");

    JLabel Heading=new JLabel("SIP Calculation");
    JLabel Amount=new JLabel("Enter Fixed Amount: ");
    JLabel Period=new JLabel("Enter Number of Years: ");
    JLabel Rate=new JLabel("Enter the Rate of Interest: ");

    Font font=new Font("Arial",Font.BOLD,14);
    Font head=new Font("Arial",Font.PLAIN,25);

    JTextField amt=new JTextField();
    JTextField year=new JTextField();
    JTextField rate=new JTextField();

    public SIP_Calculator(){
        frame1.setBounds(500,150,310,348);
        frame1.setLayout(null);
        frame1.getContentPane().setBackground(Color.lightGray);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.setIconImage(logo.getImage());

        frame1.add(Heading);
        frame1.add(Amount);
        frame1.add(Rate);
        frame1.add(Period);
        frame1.add(amt);
        frame1.add(rate);
        frame1.add(year);
        frame1.add(calculate);

        Heading.setBounds(50,10,200,40); Heading.setFont(head);Heading.setForeground(Color.BLACK);
        Amount.setBounds(10,70,180,30); Amount.setFont(font);
        Rate.setBounds(10,110,180,30); Rate.setFont(font);
        Period.setBounds(10,150,180,30); Period.setFont(font);

        amt.setBounds(200,70,90,30);
        rate.setBounds(200,110,90,30);
        year.setBounds(200,150,90,30);

        calculate.setBounds(80,220,120,40);
        calculate.addActionListener(this);
        frame1.setVisible(true);
    }

    public static void main(String[] args) {
        new SIP_Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int p=Integer.parseInt(amt.getText());
        int r=Integer.parseInt(rate.getText());
        int t=Integer.parseInt(year.getText())*12;
        //In the above three line, First I am getting the Text from the TextField using getText() method and converting it into Integer using parseInt() method comes under Integer class.

        //Formula: Fv= Pv(1+i) [(1+i)^n-1)]/i
        double i=(double) r/1200;
        double fv=Math.pow((1+i),t)-1;
        double amount=p*(fv/i)*(1+i);
        amount=Math.round(amount);

        JOptionPane.showMessageDialog(calculate,"After "+t/12+" years you will have: Rs"+ (int)amount);
    }
}
