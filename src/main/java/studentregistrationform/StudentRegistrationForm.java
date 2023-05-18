package studentregistrationform;
import javax.swing.*;
import java.awt.*;
public class StudentRegistrationForm {
    public static void main(String[]args){
        
    JLabel regNumberLabel=new JLabel("Reg.Number:");
    JTextField regNumberField = new JTextField(20);
    JLabel nameLabel = new JLabel("Name");
    JTextField nameField = new JTextField(20);
    JLabel dobLabel = new JLabel("Date of Birth");
    JTextField dobField = new JTextField(20);
    JLabel genderLabel = new JLabel("Gender");
    JTextField genderField = new JTextField(20);
    JButton saveButton = new JButton("Save");
    
    JPanel panel = new JPanel();
    panel.add(regNumberLabel);
    panel.add(regNumberField);
    panel.add(nameLabel);
    panel.add(nameField);
    panel.add(dobLabel);
    panel.add(dobField);
    panel.add(genderLabel);
    panel.add(genderField);
    panel.add(saveButton);
    
    JFrame frame = new JFrame("STUDENTS' REGISTRATION FORM");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
        
    }
}
