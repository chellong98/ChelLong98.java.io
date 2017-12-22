package ChelLong.javaSwing.Ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HoccomboBoxJlistUi extends JFrame {
	JComboBox cboSo; //combobox
	JList listSo;
	JButton btnOk;
	public HoccomboBoxJlistUi (String title) {
		super (title);
		addControl();
		addEvent();
	}
	


	public void addControl () {
		Container con = getContentPane(); //container
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));//set boxlayout cho container
		JPanel pnCombo = new JPanel(); //panel của combobox
		pnCombo.setLayout(new FlowLayout());// flowlayout
		JLabel lblChonSo = new JLabel("chọn 1 số"); //nhãn chọn số
		pnCombo.add(lblChonSo); //thêm nhãn vào panel
		cboSo = new JComboBox();// tạo combobox
		Random rd = new Random(); //tạo số ngẫu nhiên
		for (int i = 0; i < 100; i++) { //chạy 100 lần
			int x = rd.nextInt(500); //random số nhỏ hơn 500
			cboSo.addItem(x+""); //thêm số vào combobox
		}
		pnCombo.add(cboSo);
		con.add(pnCombo);
		
		JPanel pnList = new JPanel();
		pnList.setLayout(new FlowLayout());
		JLabel lblChonSo2 = new JLabel("chọn số: "); 
		listSo = new JList(); //tạo list
		Vector<Integer> vec = new Vector<Integer>(); //vector giống arraylist
		for (int i = 0; i < 100; i++) {
			int x = rd.nextInt(500);
			vec.add(x);
		}
		listSo.setListData(vec); //đưa vector vào list
		pnList.add(lblChonSo2);
		JScrollPane scList = new JScrollPane(listSo, //đưa list vào scrollpane
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		pnList.add(scList); //đưa scrollpane vào panel
		con.add(pnList); //đưa panel list vào con
		
		JPanel pnOk = new JPanel();
		pnOk.setLayout(new FlowLayout());
		btnOk = new JButton("OK");
		pnOk.add(btnOk);
		con.add(pnOk);
	} 
	public void addEvent () {
		cboSo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int vt = cboSo.getSelectedIndex();
				if (vt!=-1) {
					JOptionPane.showMessageDialog(null, "vị trí chọn: " + vt + ", giá trị = " + cboSo.getSelectedItem());
				}
			}
		});
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLiXemGiaTriCuaList();
			}

			protected void xuLiXemGiaTriCuaList() {
				// TODO Auto-generated method stub
				Object obj = listSo.getSelectedValue(); //lấy giá trị trong list khi ấn ok
				int vt = listSo.getSelectedIndex(); //lấy vị trí của phần tử đó
				JOptionPane.showMessageDialog(null, "LIst: vị trí chọn = " + vt + ", giá trị = " + obj);
			}
		});
	}
	public void showWindow () {
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
}
