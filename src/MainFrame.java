import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField textboxusername;
    private JPasswordField textboxmatkhau;
    private JButton btnlogin;

    public MainFrame() {
        super("Chương trình Đăng nhập");
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); 
        setLocationRelativeTo(null); 
        setLayout(null); 

        // Việt hóa Label (Bước 6)
        JLabel label = new JLabel("tên đăng nhập:");
        label.setBounds(30, 50, 120, 25); 
        add(label);

        textboxusername = new JTextField();
        textboxusername.setBounds(150, 50, 180, 25);
        add(textboxusername);

        // Việt hóa Label (Bước 6)
        JLabel labelPass = new JLabel("mật khẩu:");
        labelPass.setBounds(30, 90, 120, 25); 
        add(labelPass);

        textboxmatkhau = new JPasswordField(); 
        textboxmatkhau.setBounds(150, 90, 180, 25);
        add(textboxmatkhau);

        // Việt hóa nút bấm (Bước 7)
        btnlogin = new JButton("đăng nhập");
        btnlogin.setBounds(150, 140, 120, 30); 
        add(btnlogin);

        // Thêm logic đăng nhập (Bước 9)
        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = textboxusername.getText();
                String pass = new String(textboxmatkhau.getPassword());

                if (user.equals("admin") && pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                } else {
                    JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}