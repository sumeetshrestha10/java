package Swing;
import javax.swing.*;

public class SimpleGUi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("enter your name");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("submit");

        button.addActionListener(e->{
            String name = textField.getText();
            if(name.length() == 0){

                JOptionPane.showMessageDialog(frame,"name field cant be empty");
            }
            else{
                JOptionPane.showMessageDialog(frame,"hello, "+ name);
            }
        });
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
    
}
