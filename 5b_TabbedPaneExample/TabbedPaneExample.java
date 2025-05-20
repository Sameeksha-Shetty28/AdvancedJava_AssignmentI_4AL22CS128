package java_question_5b;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample extends JFrame {

    public TabbedPaneExample() {
        setTitle("Tabbed Pane Color Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create color panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add tabbed pane to the frame
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TabbedPaneExample().setVisible(true);
        });
    }
}
