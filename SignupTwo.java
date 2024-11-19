import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;  //declared globally before it was declared locally
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;

        setLayout(null);  //setBound works only when setLayout is kept as null

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details"); 
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);   
        add(additionalDetails);

        JLabel name = new JLabel("Religion: "); 
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 200, 30);   
        add(name);    //after this make a textfield(box) and declare it globally

        String valReligion [] = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};   //for dropdown
         religion = new JComboBox(valReligion);   //for dropdown
        religion.setBounds(300, 140, 400, 30);     //300 is length from left side, 140 is length from upside, 400 is size in length of the box, 30 is size in width of the box
        religion.setBackground(Color.WHITE);
        add(religion);                  

        JLabel fname = new JLabel("Category: "); 
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);   
        add(fname);

        String valcategory [] = {"General", "OBC","SC", "ST", "Others"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30); 
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income: "); 
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);   
        add(dob);

        String incomecategory [] = {"Null", "<1,50,000","<2,50,000", "<5,00,000", "<10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30); 
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational "); 
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);   
        add(gender);

        JLabel email = new JLabel("Qalification: "); 
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 315, 200, 30);   
        add(email);

        String educationvalue [] = {"Non-Graduation", "Graduation","Post-Graduation", "Doctrate", "Other"};
         education = new JComboBox(educationvalue);
        education.setBounds(300, 315, 400, 30); 
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital = new JLabel("Occupation: "); 
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);   
        add(marital);

        String occupationvalue [] = {"Salaried", "Self-Employeed","Business Man", "Enturprenuer","student","Retired", "Other"};
        occupation = new JComboBox(occupationvalue);
        occupation.setBounds(300, 390, 400, 30); 
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pan = new JLabel("PAN Number: "); 
        pan.setFont(new Font("Raleway", Font.BOLD, 22));
        pan.setBounds(100, 440, 200, 30);   
        add(pan);

        panTextField = new JTextField();                     //for the box infront of pan field
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number: "); 
        aadhar.setFont(new Font("Raleway", Font.BOLD, 22));
        aadhar.setBounds(100, 490, 200, 30);   
        add(aadhar);

        aadharTextField  = new JTextField();                     //for the box infront of aadhar field
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel state = new JLabel("Senior Citizen: "); 
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);   
        add(state );

        syes = new JRadioButton("Yes");                 
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");            
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup marritalgroup = new ButtonGroup();       
        marritalgroup.add(syes);
        marritalgroup.add(sno);

        JLabel pincode = new JLabel("Existing Account: "); 
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);   
        add(pincode);

        eyes = new JRadioButton("Yes");                 
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");            
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup emarritalgroup = new ButtonGroup();       
        emarritalgroup.add(eyes);
        emarritalgroup.add(eno);

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
        String sreligion = (String) religion.getSelectedItem();    //(String) typecaste is performed here
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation= (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        }else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        }else if(eno.isSelected()) {
            existingaccount = "No";
        }

        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signupTwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);

            //create signupThree object here
            setVisible(false);  //to disable the previous class(signuptwo) visibility
            new SignupThree(formno).setVisible(true);

        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception {
        new SignupTwo("");
    }
}

