import javax.swing.*;

public class MainFrame extends JFrame {
    // Sửa ID biến thành textboxusername và textboxmatkhau
    private JTextField textboxusername;
    private JPasswordField textboxmatkhau;
    private JButton btnlogin;

    public MainFrame() {
        super("Simple JFrame Example");
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); 
        setLocationRelativeTo(null); 
        setLayout(null); 

        // --- UserName ---
        JLabel label = new JLabel("Tên đăng nhập:");
        label.setBounds(30, 50, 100, 25); 
        add(label);

        // Sử dụng ID mới: textboxusername
        textboxusername = new JTextField();
        textboxusername.setBounds(150, 50, 180, 25);
        add(textboxusername);

        // --- Password ---
        JLabel labelPass = new JLabel("Mật khẩu:");
        labelPass.setBounds(30, 90, 100, 25); 
        add(labelPass);

        // Sử dụng ID mới: textboxmatkhau
        textboxmatkhau = new JPasswordField(); 
        textboxmatkhau.setBounds(150, 90, 180, 25);
        add(textboxmatkhau);

        // --- Nút bấm ---
        btnlogin = new JButton("Đăng nhập");
        btnlogin.setBounds(150, 140, 120, 30); 
        add(btnlogin);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}