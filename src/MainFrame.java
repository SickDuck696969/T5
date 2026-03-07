import javax.swing.*;

/**
 * A simple JFrame window with only Username components.
 */
public class MainFrame extends JFrame {
    // Khai báo biến thành viên để dễ quản lý (Bước 8 trong bài tập)
    private JTextField txtUserName;

    public MainFrame() {
        super("Simple JFrame Example");
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200); // Điều chỉnh lại kích thước cho gọn
        setLocationRelativeTo(null); 
        setLayout(null); // Sử dụng Absolute Layout để đặt vị trí tự do

        // 1. Tạo và đặt vị trí cho Label UserName (Bước 2 trong bài tập)
        JLabel label = new JLabel("UserName:");
        label.setBounds(30, 50, 80, 25); // (x, y, width, height)
        add(label);

        // 2. Tạo và đặt vị trí cho Textbox UserName (Bước 2 trong bài tập)
        txtUserName = new JTextField();
        txtUserName.setBounds(120, 50, 200, 25);
        add(txtUserName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}