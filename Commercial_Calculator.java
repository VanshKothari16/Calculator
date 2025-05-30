package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Commercial_Calculator implements ActionListener {

    String old="";
    //************* ALL Buttons of Calculator ***************
    JButton btn1=new JButton("1");
    JButton btn2=new JButton("2");
    JButton btn3=new JButton("3");
    JButton btn4=new JButton("4");
    JButton btn5=new JButton("5");
    JButton btn6=new JButton("6");
    JButton btn7=new JButton("7");
    JButton btn8=new JButton("8");
    JButton btn9=new JButton("9");
    JButton btn0=new JButton("0");
    JButton btn00=new JButton("00");
    JButton btn=new JButton(".");
    JButton btnm=new JButton("*");
    JButton btnd=new JButton("/");
    JButton btna=new JButton("+");
    JButton btns=new JButton("-");
    JButton btnmd=new JButton("%");
    JButton clear=new JButton("C");
    JButton ce=new JButton("CE");
    JButton equal=new JButton("=");

    JFrame calc=new JFrame("Commercial Calculator");
    JTextField screen=new JTextField();
    Font f1=new Font("Arial",Font.LAYOUT_NO_LIMIT_CONTEXT,19);


    public Commercial_Calculator(){
        //********* Basic Property of JFrame Class *********
        calc.setBounds(500,150,310,348);
        calc.setLayout(null);
        calc.getContentPane().setBackground(Color.LIGHT_GRAY);
        calc.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Font f=new Font("Arial",Font.BOLD,22);

        //********** Setting a Logo displayed on title bar ***********
        ImageIcon logo=new ImageIcon("D:\\Coding Tutorial\\Web Development\\HTML Lessons\\images\\calculator.jpg");
        calc.setIconImage(logo.getImage());


        //********* Property of JTextField Class ***********
        screen.setBounds(0,0,300,63);
        screen.setFont(f);
        screen.addActionListener(this);
        calc.add(screen);

        //********* Setting First Row Button of Calculator **********
        btn1.setBounds(0,60,75,50);
        calc.add(btn1);btn1.setFont(f1);
        btn1.addActionListener(this);
        btn4.setBounds(0,110,75,50);
        btn4.addActionListener(this);
        calc.add(btn4);btn4.setFont(f1);
        btn7.setBounds(0,160,75,50);
        btn7.addActionListener(this);
        calc.add(btn7);btn7.setFont(f1);
        btn0.setBounds(0,210,75,50);
        btn0.addActionListener(this);
        calc.add(btn0);btn0.setFont(f1);
        clear.setBounds(0,260,75,50);
        clear.addActionListener(this);
        calc.add(clear);clear.setFont(f1);

        //********* Setting Second Column Button of Calculator **********
        btn2.setBounds(75,60,75,50);
        btn2.addActionListener(this);
        calc.add(btn2);btn2.setFont(f1);
        btn5.setBounds(75,110,75,50);
        btn5.addActionListener(this);
        calc.add(btn5);btn5.setFont(f1);
        btn8.setBounds(75,160,75,50);
        btn8.addActionListener(this);
        calc.add(btn8);btn8.setFont(f1);
        btn00.setBounds(75,210,75,50);
        btn00.addActionListener(this);
        calc.add(btn00);btn00.setFont(f1);
        ce.setBounds(75,260,75,50);
        ce.addActionListener(this);
        calc.add(ce);ce.setFont(f1);

        //********* Setting Third Row Button of Calculator **********
        btn3.setBounds(150,60,75,50);
        btn3.addActionListener(this);
        calc.add(btn3);btn3.setFont(f1);
        btn6.setBounds(150,110,75,50);
        btn6.addActionListener(this);
        calc.add(btn6);btn6.setFont(f1);
        btn9.setBounds(150,160,75,50);
        btn9.addActionListener(this);
        calc.add(btn9);btn9.setFont(f1);
        btn.setBounds(150,210,75,50);
        btn.addActionListener(this);
        calc.add(btn);btn.setFont(f1);
        btnmd.setBounds(150,260,75,50);
        btnmd.addActionListener(this);
        calc.add(btnmd);btnmd.setFont(f1);

        //********* Setting Fourth Row Button of Calculator **********
        btnd.setBounds(225,60,75,50);
        btnd.addActionListener(this);
        calc.add(btnd);btnd.setFont(f1);
        btnm.setBounds(225,110,75,50);
        btnm.addActionListener(this);
        calc.add(btnm);btnm.setFont(f1);
        btns.setBounds(225,160,75,50);
        btns.addActionListener(this);
        calc.add(btns);btns.setFont(f1);
        btna.setBounds(225,210,75,50);
        btna.addActionListener(this);
        calc.add(btna);btna.setFont(f1);
        equal.setBounds(225,260,75,50);
        equal.addActionListener(this);
        calc.add(equal);equal.setFont(f1);

        calc.setVisible(true);
    }

    public static void main(String[] args) {
        Commercial_Calculator ob2=new Commercial_Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //******** Creating an Array of JButton Class type *********
        JButton[] button={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btn,btna,btns,btnm,btnd,btnmd};
        for (JButton jButton : button) {
            jButton.setFont(f1);
        }
        //****** String Array contains respective value of Button *******
        String[] value={"1","2","3","4","5","6","7","8","9","0","00",".","+","-","*","/","%"};

        //******** Below For Loop has been used to just display the value of the Numbers Button ********
        for(int i=0;i<12;i++) {
            if (e.getSource() == button[i]) {
                old = screen.getText();
                screen.setText(old + value[i]);
            }
        }
        //******** Below For Loop has been used to just display the value of the operator Button like .,+,/,etc. ********
        old=screen.getText();
        if(!old.endsWith("+") && !old.endsWith("/") && !old.endsWith("*") && !old.endsWith("-") && !old.endsWith("%")) {
            for (int j = 12; j < button.length; j++) {
                if (e.getSource() == button[j]) {
                    screen.setText(old + value[j]);
                }
            }
        }

        //******* Below Conditional Statement are used to perform Action on when user press clear,ce, or equal button *******
        if(e.getSource()==clear){
            screen.setText(null); //It will completely clear or blank the TextField
        }
        if(e.getSource()==ce){
            screen.setText(null); //It will also completely clear or blank the TextField
        }
        //Below part will display the Answer to the TextField
        if(e.getSource()==equal || e.getSource()==screen) {
            String expression = screen.getText();
            double answer=evaluate(expression);
            String result=String.valueOf(answer);
            screen.setText(result);
        }
    }

    public double evaluate(String expression) {
        char[] digits = expression.toCharArray(); //Converting the Complete TextField Statement into Character Array

        //********** Declaration of number and sign array *********8
        double[] number = new double[10];
        double[] sign = new double[10];
        int index = 0;
        double num;

        //Finding out each number and sign from the expression and storing in its respective array.
        String each_number = "";
        int point_came = 0; //I declared this so I can perform certain operation with decimal number

        //This complete Loop will separate each sign and each number and storing in its respective array.
        for (int i = 0; i < digits.length; i++) {
            if ((digits[i] != '+' && digits[i] != '-' && digits[i] != '/' && digits[i] != '*' && digits[i] != '%'))
            {
                if (digits[i] == '.') {
                    point_came = i; //Storing Position where point has been came in the expression.
                }
                else {
                    each_number += digits[i];
                }
                //Below If conditional statement is just used to find out the decimal position of number which occur in the last position of expression
                if ((i + 1) == digits.length && point_came != 0) {
                    point_came = i - point_came;
                }
            } else {
                //Below If statement will execute where any of the 5 sign has occured
                if ((i + 1) != digits.length && point_came != 0) {
                    point_came = i - 1 - point_came; // 2 1 . 2 1 +
                }
                num = Integer.parseInt(each_number); //All sets of digits appear before any sign occur is stored all together in num variable Eg: 12.29 digit num mai 1229 se stored hoga

                //Converting Integer number i.e. 1229 into an 12.29 from the given below conditional statement.
                if (point_came == 1) {
                    number[index] = (double) num / 10;
                } else if (point_came == 2) {
                    number[index] = (double) num / 100;
                } else if (point_came == 3) {
                    number[index] = (double) num / 1000;
                } else if (point_came == 4) {
                    number[index] = (double) num / 10000;
                } else {
                    number[index] = num;
                }

                sign[index] = digits[i];
                index++;
                each_number = "";
                point_came = 0;
            }
        }
        //This is used because in the last Iteration of Loop Last number of expression isn't used in its array that's why below conditional statement is used.
        num = Integer.parseInt(each_number);
        if (point_came == 1) {
            number[index] = (double) num / 10;
        } else if (point_came == 2) {
            number[index] = (double) num / 100;
        } else if (point_came == 3) {
            number[index] = (double) num / 1000;
        } else if (point_came == 4) {
            number[index] = (double) num / 10000;
        } else {
            number[index] = num;
        }

        return getResult(number, sign);
    }

    private static double getResult(double[] number, double[] sign) {
        double result= number[0];
        double each_part;
        /*
        Here I have noted when I stored the sign in the character array and I printed its Integer value I got the below given value.
        //+ = 43, - = 45, * = 42, / = 47, % = 37
        So, If between two numbers + is used its Integer value 43 is stored in Double array.
        */
        for(int i=0;i<10;i++){
            if(number[i] != 0 && number[i+1] != 0){
                //Below If statement represent Modulus Logic
                if(sign[i] == 37){
                    each_part=result % number[i+1];
                    result=each_part;
                }
                //Below If statement represent Multiplication Logic
                if (sign[i] == 42) {
                    each_part = result * number[i + 1];
                    result = each_part;
                }
                //Below If statement represent Division Logic
                if (sign[i] == 47) {
                    each_part = result / number[i + 1];
                    result = each_part;
                }
                //Below If statement represent Addition Logic
                if (sign[i] == 43) {
                    each_part = result + number[i + 1];
                    result = each_part;
                }
                //Below If statement represent Subtraction Logic
                if (sign[i] == 45) {
                    each_part = result - number[i + 1];
                    result = each_part;
                }
            }
        }
        return result;
    }
}
