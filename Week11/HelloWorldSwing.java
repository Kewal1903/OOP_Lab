package Week11;
import javax.swing.*;
public class HelloWorldSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Swing");
        JLabel label = new JLabel("HELLO WORLD", SwingConstants.CENTER);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
