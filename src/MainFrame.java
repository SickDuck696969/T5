import javax.swing.*;

/**
 * A simple JFrame window with Username and Password components.
 */
public class MainFrame extends JFrame {
    private JTextField txtUserName;
    // Bước 3: Khai báo thêm biến cho ô mật khẩu
    private JPasswordField txtmatkhau;

    public MainFrame() {
        super("Simple JFrame Example");
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250); // Tăng chiều cao thêm một chút để chứa thêm hàng mới
        setLocationRelativeTo(null); 
        setLayout(null); 

        // --- Phần UserName (Đã có từ trước) ---
        JLabel label = new JLabel("UserName:");
        label.setBounds(30, 50, 80, 25); 
        add(label);

        txtUserName = new JTextField();
        txtUserName.setBounds(120, 50, 200, 25);
        add(txtUserName);

        // --- Bước 3: Thêm Label Mật khẩu và Textbox Mật khẩu ---
        JLabel labelPass = new JLabel("Mật khẩu:");
        labelPass.setBounds(30, 90, 80, 25); // Đặt y=90 để nằm dưới ô Username
        add(labelPass);

        txtmatkhau = new JPasswordField(); // Dùng JPasswordField để ẩn ký tự
        txtmatkhau.setBounds(120, 90, 200, 25);
        add(txtmatkhau);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}