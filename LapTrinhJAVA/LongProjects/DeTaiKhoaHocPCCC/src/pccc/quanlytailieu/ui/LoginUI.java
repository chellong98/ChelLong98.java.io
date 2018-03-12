package pccc.quanlytailieu.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import pccc.detaikhoahoc.service.ThuatNguService;

public class LoginUI extends JFrame {
	JTextField txtUsername;
	JPasswordField txtPassword;
	JButton btnLogin, btnCancel;

	public LoginUI(String title) {
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLogin();
			}
		});
		
		txtPassword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyLogin();
			}
		});
	}

	protected void xuLyLogin() {
		// TODO Auto-generated method stub

		String Username = txtUsername.getText();
		String Password = txtPassword.getText();
		// System.out.println(service.kiemTraDangNhap(Username, Password));
		ThuatNguService service = new ThuatNguService();
		if (service.kiemTraDangNhap(Username, Password)) {
			dispose();
			QuanLyTaiLieuUI ui = new QuanLyTaiLieuUI("quản lý tài liệu");
			ui.showWindow();
		} else {
			JOptionPane.showMessageDialog(null, "tên đăng nhập hoặc mật khẩu không đúng");
		}
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));

		JPanel pnUsername = new JPanel();
		pnUsername.setLayout(new FlowLayout());
		JLabel lblUsername = new JLabel("Tên đăng nhập");
		txtUsername = new JTextField(20);
		pnUsername.add(lblUsername);
		pnUsername.add(txtUsername);
		con.add(pnUsername);

		JPanel pnPassword = new JPanel();
		pnPassword.setLayout(new FlowLayout());
		JLabel lblPassword = new JLabel("Mật khẩu");
		txtPassword = new JPasswordField(20);
		pnPassword.add(lblPassword);
		pnPassword.add(txtPassword);
		con.add(pnPassword);

		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnLogin = new JButton("Đăng nhập");
		btnCancel = new JButton("Hủy");
		pnButton.add(btnCancel);
		pnButton.add(btnLogin);
		con.add(pnButton);

		lblPassword.setPreferredSize(lblUsername.getPreferredSize());
	}

	public void showWindow() {
		this.setSize(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
