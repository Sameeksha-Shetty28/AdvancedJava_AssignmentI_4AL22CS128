// 4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming in Blue color plain font with font size of 32 using Jframe and Jlabel

package java_question_4a;
import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloSwing Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 200);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Serif", Font.PLAIN, 32));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

