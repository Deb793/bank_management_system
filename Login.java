import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;     //defined globally so that we can use it outside the constructor (Login)
    JTextField cardTextField;
    JPasswordField pinTextField;      //you want no body should see the password when it is typed

    Login() {                            //default constructor created after creating the login object

        setTitle("AUTOMATED TELLER MACHINE");     //to get the title of your frame
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));   //to put the image on frame we have to create a imageicon object which is present in image class of java

        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);  //to scale the image of your own choice

        ImageIcon i3 = new ImageIcon(i2);       // we cannot store image in JLabel so we are converting image to imageicon

        JLabel label = new JLabel(i3);   //we cannot place an icon directly on the frame for that create a JLabel object and pass obj reff. i1

        label.setBounds(70, 10, 100, 100);  //to set the image on topleft from center on frame,but still it will come on center only for that we have layout, make layout as null(setLayout(null))

        add(label);                      //if you want to add a component on your frame always we have to use add function and pass the object label

        JLabel text = new JLabel("Welcome To ATM");   //to add any text or content on your frame use JLabel
        text.setFont(new Font("OSWARD", Font.BOLD, 38));  //setting the font, but after this output will come like this "Wel..." so we need to increase the text width to 400
        text.setBounds(200, 40, 400, 40); //specified the location of the content
        add(text);                                         //for visibility on output screen, but it will not show because you need to specify the loction of the content

        JLabel cardno = new JLabel("Card no.");            //for cardno field
        cardno.setFont(new Font("RALEWAY", Font.BOLD, 28));  
        cardno.setBounds(120, 150, 150, 30); 
        add(cardno);  

        cardTextField = new JTextField();            //for box infront of cardno field
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));  //to change the text writen inside the box or to change the textField
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN");                    //for pin field
        pin.setFont(new Font("RALEWAY", Font.BOLD, 28));  
        pin.setBounds(120, 220, 250, 30); 
        add(pin);

        pinTextField = new JPasswordField();              //for box infront of pin  field
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));   //to change the text writen inside the box or to change the textField
        add(pinTextField);

        login = new JButton("SIGN IN");             //for login button
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");             //for clear button
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");             //for signup button
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);    //to change the frame colour use getContentpane function

        setSize(800,450);   //it desides the size of the frame but when we will run output will not come,follow below function
        setVisible(true);              //use this setVisible(true) function for visibility of your frame
        setLocation(350,200);        //to set the frame at at centre by default it will come from top left

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear) {
            cardTextField.setText("");             //setText function use to show the details you pass when that particural button is actioned or pressed
            pinTextField.setText("");
        }else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();     //   video 7/12, time 19:00
            String query = "select * from login where cardnumber = '" +cardnumber+"' and pin = '"+pinnumber+"'";
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }catch (Exception e) {
                System.out.println(e);
            }
        }else if(ae.getSource() == signup){
            setVisible(false);     //this two statements for when we click signup button in login page it will redirect to signuppage to fill the personal details
            new SignupOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();   // class object created
    }
}  
