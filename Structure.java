package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Structure extends Connection implements ActionListener {
    JButton sip,normal,cagr,emi;
    Font font=new Font("Arial",Font.BOLD,13);

    public void initialPage() {
        JFrame initialPage = new JFrame("Calculator");
        initialPage.setBounds(500, 150, 310, 348);
        initialPage.getContentPane().setBackground(Color.lightGray);
        initialPage.setLayout(null);
        initialPage.setFont(font);
        initialPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon logo=new ImageIcon("D:\\Coding Tutorial\\Web Development\\HTML Lessons\\images\\calculator.jpg");
        initialPage.setIconImage(logo.getImage());

        sip = new JButton("SIP Calculator");
        sip.setFont(font);
        normal = new JButton("Commercial Calculator");
        normal.setFont(font);
        cagr = new JButton("CAGR Calculator");
        cagr.setFont(font);
        emi = new JButton("EMI Calculator");
        emi.setFont(font);

        sip.setBounds(60, 40, 180, 30);
        normal.setBounds(60, 100, 180, 30);
        cagr.setBounds(60, 160, 180, 30);
        emi.setBounds(60, 220, 180, 30);

        sip.addActionListener(this);
        normal.addActionListener(this);
        cagr.addActionListener(this);
        emi.addActionListener(this);


        initialPage.add(sip);
        initialPage.add(normal);
        initialPage.add(cagr);
        initialPage.add(emi);

        initialPage.setVisible(true);
    }

    public static void main(String[] args) {
        Structure object1=new Structure();
        object1.initialPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sip){
            SIPCalculator();
        }if(e.getSource()==cagr){
            CAGRCalculator();
        }if(e.getSource()==normal){
            CommercialCalculator();
        }if(e.getSource()==emi){
            EMICalculator();
        }
    }
}
