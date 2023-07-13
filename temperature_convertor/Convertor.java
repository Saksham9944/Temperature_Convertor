package temperature_convertor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Convertor implements ActionListener{
    public static void main(String[] args) {
        Convertor o1=new Convertor();
    }
    int num1=0;
    JFrame frame=new JFrame("TEMPERATURE CONVERTOR");
    JLabel label=new JLabel("Temperature Convertor");

    JTextField textField1=new JTextField();
    JTextField  textField2=new JTextField();
    JTextField textField3=new JTextField();
    JTextField  textField4=new JTextField();
    JButton button=new JButton("Convert");
    JLabel label1=new JLabel("Fahrenheit :");
    JLabel label2=new JLabel("Celsius :");
    JLabel label3=new JLabel("Fahrenheit:");
    JLabel label4=new JLabel("Celsius:");
    JLabel label5=new JLabel("TO");
    JLabel label6=new JLabel("TO");

    JButton f_to_c_btn=new JButton("Convert");
    JButton c_to_f_btn=new JButton("Convert");
    JButton reset1=new JButton("Reset");
    JButton reset2=new JButton("Reset");
    Convertor()
    {
       frame();
       components();
        convertbtn_press();
    }
    public void frame()
    {
        frame.setSize(600,500);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
frame.getContentPane().setBackground(Color.lightGray);
//        this will set the location of the frame in the center of the screen
        frame.setLocationRelativeTo(null);
//        this will close the frame from the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void components()
    {
        label.setBounds(150,20,400,50);
        label.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        label.setForeground(Color.BLACK);
        frame.add(label);

       label1.setBounds(30,100,150,20);
       label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
       label1.setForeground(Color.black);
       frame.add(label1);

        textField1.setBounds(130,100,100,30);
        textField1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(textField1);

        label5.setBounds(290,100,50,20);
        label5.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        label5.setForeground(Color.BLACK);
        frame.add(label5);

        label2.setBounds(370,100,150,20);
        label2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        label2.setForeground(Color.BLACK);
        frame.add(label2);

        textField2.setBounds(450,100,100,30);
        textField2.setEditable(false);
        textField2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        it will set the text at any location
        textField2.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(textField2);

        reset1.setBounds(170,180,100,40);
        reset1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        reset1.setForeground(Color.BLACK);
        reset1.setBackground(Color.YELLOW);
        reset1.setFocusable(false);
        frame.add(reset1);

        f_to_c_btn.setBounds(330,180,100,40);
        f_to_c_btn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        f_to_c_btn.setForeground(Color.white);
        f_to_c_btn.setBackground(Color.RED);
        f_to_c_btn.setFocusable(false);
        frame.add(f_to_c_btn);


label4.setBounds(50,300,150,20);
        label4.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        label4.setForeground(Color.black);
        frame.add(label4);

        textField3.setBounds(130,300,100,30);
        textField3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        textField3.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(textField3);

        label6.setBounds(290,300,50,20);
        label6.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        label6.setForeground(Color.BLACK);
        frame.add(label6);

        label3.setBounds(350,300,150,20);
        label3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        label3.setForeground(Color.BLACK);
        frame.add(label3);

        textField4.setBounds(450,300,100,30);
        textField4.setEditable(false);
        textField4.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        it will set the text at any location
        textField4.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(textField4);

        reset2.setBounds(170,380,100,40);
        reset2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        reset2.setForeground(Color.BLACK);
        reset2.setBackground(Color.YELLOW);
        reset2.setFocusable(false);
        frame.add(reset2);

        c_to_f_btn.setBounds(330,380,100,40);
        c_to_f_btn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        c_to_f_btn.setForeground(Color.white);
        c_to_f_btn.setBackground(Color.RED);
        c_to_f_btn.setFocusable(false);
        frame.add(c_to_f_btn);
    }
    public void convertbtn_press()
    {
        f_to_c_btn.addActionListener(this);
        c_to_f_btn.addActionListener(this);
        reset1.addActionListener(this);
        reset2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      Object convert_btn=e.getSource();
      if(convert_btn==f_to_c_btn)
      {

        Double num=Double.parseDouble(textField1.getText());
         Double res=(num - 32)*5/9;
          if (Double.toString(res).length()>8)
          {

              textField2.setText(Double.toString(res).substring(0,7));
          }
          else
          {
              textField2.setText(Double.toString(res));
          }

      } else if (convert_btn==c_to_f_btn) {
          double num=Double.parseDouble(textField3.getText());
          double res=(num*9)/5+32;
          if (Double.toString(res).length()>8)
          {

              textField4.setText(Double.toString(res).substring(0,7));
          }
          else
          {
              textField4.setText(Double.toString(res));
          }
      }
      else if (convert_btn==reset1) {
          textField1.setText("");
          textField2.setText("");
      }
      else if (convert_btn==reset2) {
          textField3.setText("");
          textField4.setText("");
      }
    }
}
