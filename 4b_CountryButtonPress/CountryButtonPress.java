package java_question_4b;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonPress extends JFrame implements ActionListener {

    private JButton btnSrilanka;
    private JButton btnIndia;
    private JLabel messageLabel;

    public CountryButtonPress() {
        // Set frame properties
        setTitle("Country Button Press");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setLayout(new FlowLayout());

        // Create buttons
        btnSrilanka = new JButton("Srilanka");
        btnIndia = new JButton("India");

        // Create label to show message
        messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("Serif", Font.PLAIN, 18));

        // Add action listeners to buttons
        btnSrilanka.addActionListener(this);
        btnIndia.addActionListener(this);

        // Add components to frame
        add(btnSrilanka);
        add(btnIndia);
        add(messageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSrilanka) {
            messageLabel.setText("Srilanka is pressed");
        } else if (e.getSource() == btnIndia) {
            messageLabel.setText("India is pressed");
        }
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            new CountryButtonPress().setVisible(true);
        });
    }
}
