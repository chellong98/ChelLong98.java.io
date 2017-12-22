package ChelLong.javaSwing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuaSoCuaToi extends JFrame{
	public CuaSoCuaToi (String tieuDe) {
		super (tieuDe);
		this.addControls();
	}
	public void showWindow () {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false); //khoogn thể thay đổi kích thước cửa sổ
		this.setVisible(true);
	}
	public void addControls () {
		//lấy lớp chứa cửa sổ ra
		Container con = getContentPane();//tạo 1 container
		JPanel pn = new JPanel(); 
		pn.setBackground(Color.blue);
		JButton btn = new JButton("Đây là nút lệnh");
		pn.add(btn); //đưa nút vào panel
		//đưa panel lên giao diện
		con.add(pn); //đưa panel vào giao diện
		
	}
}
