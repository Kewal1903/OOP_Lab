package Week11;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CounterApp {
    private int counter = 0;
    public static void main(String[] args) {
        new CounterApp().createUI();
    }
    public void createUI() {
        JFrame frame = new JFrame("Counter");
        JButton countButton = new JButton("Count");
        JLabel counterLabel = new JLabel("Counter: 0");
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter += 6;
                counterLabel.setText("Counter: " + counter);
            }
        });
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(countButton);
        frame.add(counterLabel);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

