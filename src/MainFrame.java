import javax.swing.*;

public class MainFrame extends JFrame {
    private JTextField txtUserName;
    // Bước 4: Đổi ID txtmatkhau -> txtpassword
    private JPasswordField txtpassword;
    // Bước 4: Thêm nút btnlogin
    private JButton btnlogin;

    public MainFrame() {
        super("Simple JFrame Example");
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); // Tăng chiều cao để chứa thêm nút bấm
        setLocationRelativeTo(null); 
        setLayout(null); 

        // --- UserName ---
        JLabel label = new JLabel("UserName:");
        label.setBounds(30, 50, 80, 25); 
        add(label);

        txtUserName = new JTextField();
        txtUserName.setBounds(120, 50, 200, 25);
        add(txtUserName);

        // --- Bước 4: Sửa Label Mật khẩu -> Password ---
        JLabel labelPass = new JLabel("Password:");
        labelPass.setBounds(30, 90, 80, 25); 
        add(labelPass);

        // Bước 4: Sử dụng ID mới txtpassword
        txtpassword = new JPasswordField(); 
        txtpassword.setBounds(120, 90, 200, 25);
        add(txtpassword);

        // --- Bước 4: Thêm nút btnlogin ---
        btnlogin = new JButton("Login");
        btnlogin.setBounds(120, 140, 100, 30); // Đặt dưới ô Password
        add(btnlogin);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}