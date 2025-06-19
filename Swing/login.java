package Swing;
import javax.swing.*;
public class login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LOGIN PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Username:");
        JTextField textField = new JTextField(20);
        JLabel label2 = new JLabel("password");
        JTextField textField2 = new JTextField(10);
        JButton button = new JButton("login");

        button.addActionListener(e->{
            String username = textField.getText();
            JOptionPane.showMessageDialog(frame,"welcome " + username);
            String password = textField2.getText();
            JOptionPane.showMessageDialog(frame,"Password "+ password);
        });
        panel.add(label);
        panel.add(textField);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}
