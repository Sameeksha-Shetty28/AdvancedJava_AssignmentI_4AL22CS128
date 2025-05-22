package java_question_5d;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneCMYDemo extends JFrame {

    public TabbedPaneCMYDemo() {
        setTitle("Tabbed Pane - CMY Colors");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with different background colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add the panels to tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add tabbedPane to the frame
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TabbedPaneCMYDemo().setVisible(true);
        });
    }
}
