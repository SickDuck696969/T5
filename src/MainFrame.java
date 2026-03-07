import javax.swing.*;
import java.awt.*;

/**
 * A simple JFrame window with basic components.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        super("Simple JFrame Example");
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center on screen

        // Create a simple label and button
        JLabel label = new JLabel("Hello from JFrame!", SwingConstants.CENTER);
        JButton button = new JButton("Click me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button clicked!"));

        // Use BorderLayout for simple layout
        setLayout(new BorderLayout(10, 10));
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    }
}
