package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CAGR_Calculator implements ActionListener {

    JFrame frame2 =new JFrame("CAGR Calculator");
    JButton calculate=new JButton("Calculate");

    JLabel Heading=new JLabel("CAGR Calculation");
    JLabel futureValue =new JLabel("Enter Current Value: ");
    JLabel Principle =new JLabel("Enter Invested Value: ");
    JLabel Period=new JLabel("Enter the Number of Years: ");

    Font font=new Font("Arial",Font.BOLD,13);
    Font head=new Font("Arial",Font.PLAIN,25);

    JTextField Fv=new JTextField();
    JTextField Pv=new JTextField();
    JTextField period=new JTextField();

    public CAGR_Calculator() {
        frame2.setBounds(500,150,310,348);
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(Color.lightGray);
        frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon logo=new ImageIcon("D:\\Coding Tutorial\\Web Development\\HTML Lessons\\images\\calculator.jpg");
        frame2.setIconImage(logo.getImage());

        frame2.add(Heading);
        frame2.add(futureValue);
        frame2.add(Period);
        frame2.add(Principle);
        frame2.add(Fv);
        frame2.add(period);
        frame2.add(Pv);
        frame2.add(calculate);

        Heading.setBounds(40,10,240,40); Heading.setFont(head);Heading.setForeground(Color.BLACK);
        futureValue.setBounds(10,70,180,30); futureValue.setFont(font);
        Principle.setBounds(10,110,180,30); Period.setFont(font);
        Period.setBounds(10,150,180,30); Principle.setFont(font);

        Fv.setBounds(200,70,90,30);
        Pv.setBounds(200,110,90,30);
        period.setBounds(200,150,90,30);

        calculate.setBounds(80,220,120,40);
        calculate.addActionListener(this);

        frame2.setVisible(true);
    }

    public static void main(String[] args) {
        new CAGR_Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        Formula of CAGR: ROI= (Future_Value / Principle)^(1/n) - 1;
         */

        double current=Double.parseDouble(Fv.getText());
        double principle=Double.parseDouble(Pv.getText());
        double n=Double.parseDouble(period.getText());


        double div=current/principle;
        double power=1/n;
        double rate1=Math.pow(div,power);
        double rate=(rate1-1)*10000; //0.189374656*10000 = 1893.45656 --> convert to int = 1893/100 = 18.93% (Ans)
        int dup=(int) rate;
        double interest=(double)dup/100;

        System.out.println(rate);
        System.out.println(dup);
        System.out.println(interest);

        JOptionPane.showMessageDialog(calculate,"Compounded Annual Growth Rate is: "+interest+"%");
    }
}
