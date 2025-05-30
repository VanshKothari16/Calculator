package Calculator;
/*
EMI Formula= P * R * ((1+R)^n)/((1+R)^n - 1).
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EMI_Calculator implements ActionListener {

    JFrame frame3 =new JFrame("EMI Calculator");
    JButton calculate=new JButton("Calculate");

    JLabel Heading=new JLabel("EMI Calculation");
    JLabel Principle=new JLabel("Enter Loan Amount: ");
    JLabel Rate =new JLabel("Enter Rate of Interest: ");
    JLabel Period=new JLabel("Enter the Number of Years: ");

    Font font=new Font("Arial",Font.BOLD,13);
    Font head=new Font("Arial",Font.PLAIN,25);

    JTextField Pv=new JTextField();
    JTextField rate=new JTextField();
    JTextField period=new JTextField();

    public EMI_Calculator(){
        frame3.setBounds(500,150,310,348);
        frame3.setLayout(null);
        frame3.getContentPane().setBackground(Color.lightGray);
        frame3.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ImageIcon logo=new ImageIcon("D:\\Coding Tutorial\\Web Development\\HTML Lessons\\images\\calculator.jpg");
        frame3.setIconImage(logo.getImage());


        frame3.add(Heading);
        frame3.add(Rate);
        frame3.add(Period);
        frame3.add(Principle);
        frame3.add(Pv);
        frame3.add(period);
        frame3.add(rate);
        frame3.add(calculate);

        Heading.setBounds(40,10,240,40); Heading.setFont(head);Heading.setForeground(Color.BLACK);
        Principle.setBounds(10,70,180,30); Principle.setFont(font);
        Rate.setBounds(10,110,180,30); Rate.setFont(font);
        Period.setBounds(10,150,180,30); Period.setFont(font);

        Pv.setBounds(200,70,90,30);
        rate.setBounds(200,110,90,30);
        period.setBounds(200,150,90,30);

        calculate.setBounds(80,220,120,40);
        calculate.addActionListener(this);

        frame3.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double P=Double.parseDouble(Pv.getText());
        double R=Double.parseDouble(rate.getText())/1200;
        double n=Double.parseDouble(period.getText())*12;

        double power1=Math.pow((1+R),n)*1000; //1.189374656*1000 = 1189.345656 --> convert to int = 1189/1000 = 11.89 (Two decimal value)
        double power2=(int)power1;
        double power=power2/1000;

        double den=power-1;
        double num=P*R*power;

        double emi=num/den;
        System.out.println(emi);

        JOptionPane.showMessageDialog(calculate,"Your Equated Monthly Installment (EMI) is: "+ Math.round(emi));
    }

    public static void main(String[] args) {
        new EMI_Calculator();
    }
}
