import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;  //declared globally before it was declared locally
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;

    SignupOne() {

        setLayout(null);  //setBound works only when setLayout is kept as null

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        //long random = Math.abs((ran.nextLong() % 9000L) + 1000L); // if System.out.println((ran.nextLong() % 9000L) + 1000L); gives negative number then execute this statement.

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random); 
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);   //output will not come, if you habe not declered setLayout as null
        add(formno);

        JLabel personDetails = new JLabel("Page 1: Personal Details"); 
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);   
        add(personDetails);

        JLabel name = new JLabel("Name: "); 
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);   
        add(name);    //after this make a textfield(box) and declare it globally

        nameTextField = new JTextField();                     //for the box infront of name field
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);     //300 is length from left side, 140 is length from upside, 400 is size in length of the box, 30 is size in width of the box
        add(nameTextField);                     

        JLabel fname = new JLabel("Father's Name: "); 
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);   
        add(fname);

        fnameTextField = new JTextField();                     //for the box infront of father's name field
        fnameTextField .setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField .setBounds(300, 190, 400, 30);      
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth: "); 
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);   
        add(dob);

        dateChooser = new JDateChooser();                    //to add calender
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender: "); 
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);   
        add(gender);

        male = new JRadioButton("Male");                //male radiobutton 
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");            //female radiobutton
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();        //when selecting in output screen bothe male & female use to select, to avoid that we created one buttongroup object
        gendergroup.add(male);
        gendergroup.add(female);


        JLabel email = new JLabel("Email Address: "); 
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);   
        add(email);

        emailTextField = new JTextField();                     //for the box infront of email field
        emailTextField .setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField .setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Satus: "); 
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);   
        add(marital);

        married = new JRadioButton("Married");                //married radiobutton 
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");            //unmarried radiobutton
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");            //other radiobutton
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup marritalgroup = new ButtonGroup();        //when selecting in output screen bothe married & unmarried use to select, to avoid that we created one buttongroup object
        marritalgroup.add(married);
        marritalgroup.add(unmarried);
        marritalgroup.add(other);

        JLabel address = new JLabel("Address: "); 
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);   
        add(address);

        addressTextField = new JTextField();                     //for the box infront of address field
        addressTextField .setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField .setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City: "); 
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);   
        add(city);

        cityTextField = new JTextField();                     //for the box infront of city field
        cityTextField .setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField .setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State: "); 
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);   
        add(state );

        stateTextField = new JTextField();                     //for the box infront of state field
        stateTextField .setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField .setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code: "); 
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);   
        add(pincode);

        pinTextField = new JTextField();                     //for the box infront of pincode field
        pinTextField .setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField .setBounds(300, 590, 400, 30);
        add(pinTextField);

        next = new JButton("Next");                    //next button created at last, when person will click will go to the next page
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);   //where you want your action to be performed    //this is called putting an action (next.addActionListener(this);)
        add(next);

        getContentPane().setBackground(Color.WHITE);  //this will add a white background colour to the created frame

        setSize(850, 800);   // this 3 [setSize(850, 800), setLocation(350, 10), setVisible(true)] will create a frame 
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;  //long             //from here we are getting the values which user has entered
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        }else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        }else if(unmarried.isSelected()) {
            marital = "Unmarried";
        }else if(other.isSelected()) {
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");   //if name is not entered then it will give error message as "Name is required"
            }else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception {
        new SignupOne();
    }
}

