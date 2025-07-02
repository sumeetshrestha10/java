import javax.swing.*;
public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("enter you name");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("submit");

        button.addActionListener(e->{
            String name = textField.getText();
            JOptionPane.showMessageDialog(frame, "hello, "+ name);

        });
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}
