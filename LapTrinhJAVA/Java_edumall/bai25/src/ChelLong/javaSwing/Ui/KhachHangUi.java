package ChelLong.javaSwing.Ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

import ChelLong.javaSwing.model.KhachHang;
import ChelLong.javaSwing.model.NhomKhachHang;

public class KhachHangUi extends JFrame {
	DefaultMutableTreeNode root = null;
	JTree treeNhom;

	DefaultTableModel dtm; // thêm các thuộc tính vào mảng
	JTable tblKhach; // khung cho bảng

	JTextField txtMa, txtTen, txtPhone, txtEmail;
	JButton btnXoa, btnLuu;

	ArrayList<NhomKhachHang>dsNhom;
	ArrayList<KhachHang>dsKhach;
	
	NhomKhachHang nhomSelected = null;
	DefaultMutableTreeNode nodeSelected = null;
	public KhachHangUi(String title) {
		super(title);
		addControls();
		addEvents();
		fakeData();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		treeNhom.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			 nodeSelected = (DefaultMutableTreeNode)treeNhom.getLastSelectedPathComponent();//lấy ra node đc kích chuột
				if (nodeSelected!=null && nodeSelected.getLevel()==1) {//nếu kích chọn và chọn cái đầu tiên trong root
					nhomSelected = (NhomKhachHang)nodeSelected.getUserObject(); //chọn ra node vừa kích vào
					hienThiDanhSachKhachHangTheoNhom();
				}
			}
		});
		
		tblKhach.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int rowSelected = tblKhach.getSelectedRow();//lấy ra row đc click
				if (rowSelected==-1) { //nếu không chọn row nào
					return;
				} 
					String ma = tblKhach.getValueAt(rowSelected, 0)+"";
					txtMa.setText(ma);
					String ten = tblKhach.getValueAt(rowSelected, 1)+"";
					txtTen.setText(ten);
					String phone = tblKhach.getValueAt(rowSelected, 2)+"";
					txtPhone.setText(phone);
					String email = tblKhach.getValueAt(rowSelected, 3)+"";
					txtEmail.setText(email);
				
			}
		});
		
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XuLiLuu();
			}
		});
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXoa();
			}
		});
	}

	protected void xuLyXoa() {
		// TODO Auto-generated method stub
		String ma = txtMa.getText();
		String ten = txtTen.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		try {
			for(KhachHang kh : nhomSelected.getKhachHangs()) {
				if (kh.getMa().equals(ma) && kh.getTen().equals(ten) && kh.getPhone().equals(phone) && kh.getEmail().equals(email)) {
					if (nhomSelected.getKhachHangs().remove(kh))  {
						JOptionPane.showMessageDialog(null, "xóa khách hàng " + ma + " thành công!");
						break;
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	protected void XuLiLuu() {
		// TODO Auto-generated method stub
		KhachHang kh = new KhachHang(txtMa.getText(), txtTen.getText(), txtPhone.getText(), txtEmail.getText());
		nhomSelected.themKhachHang(kh);
		DefaultMutableTreeNode nodeKhach = new DefaultMutableTreeNode(kh);
		nodeSelected.add(nodeKhach);	
		JOptionPane.showMessageDialog(null, "lưu khách hàng thành công");
	}

	protected void hienThiDanhSachKhachHangTheoNhom() {
		// TODO Auto-generated method stub
		dtm.setRowCount(0); //đặt hàng thứ 0
		for(KhachHang kh : nhomSelected.getKhachHangs()) {
			Vector<String>vec = new Vector<String>();//tạo vector lưu thông tin khách hàng
			vec.add(kh.getMa());
			vec.add(kh.getTen());
			vec.add(kh.getPhone());
			vec.add(kh.getEmail());
			dtm.addRow(vec);
			
			//đưa thông tin xuống các textfield
//			txtMa.setText(kh.getMa());
//			txtTen.setText(kh.getTen());
//			txtPhone.setText(kh.getPhone());
//			txtEmail.setText(kh.getEmail());
		}
	}

	private void addControls() {
		// TODO Auto-generated method stub
		/**
		 * tạo khung
		 */
		Container con = getContentPane();
		JPanel pnLeft = new JPanel();
		pnLeft.setPreferredSize(new Dimension(300, 0)); // set size cho pnleft
		JPanel pnRight = new JPanel();
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);// phân theo chiều dọc thành 2 phần
																						// left và right
		con.setLayout(new BorderLayout());
		con.add(sp, BorderLayout.CENTER); // đưa sp vào giữa

		/**
		 * khung phải
		 */
		pnRight.setLayout(new BorderLayout());
		JPanel pnTopOfRight = new JPanel();
		pnTopOfRight.setPreferredSize(new Dimension(0, 350));
		JPanel pnBottomRight = new JPanel();
		JSplitPane spRight = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pnTopOfRight, pnBottomRight);
		pnRight.add(spRight, BorderLayout.CENTER);

		/**
		 * khung trái
		 */
		pnLeft.setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("công ty topica");// tạo ra gốc của tree
		treeNhom = new JTree(root);// new tree truyền vào gốc
		JScrollPane scTree = new JScrollPane(treeNhom, // đưa tree vào thanh kéo
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnLeft.add(scTree, BorderLayout.CENTER);

		/**
		 * bên trên khung phải
		 */
		pnTopOfRight.setLayout(new BorderLayout());
		dtm = new DefaultTableModel();
		dtm.addColumn("mã khách hàng");
		dtm.addColumn("tên khách hàng");
		dtm.addColumn("số điện thoại");
		dtm.addColumn("thư điện tử");
		tblKhach = new JTable(dtm);
		JScrollPane scTable = new JScrollPane(tblKhach, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTopOfRight.add(scTable, BorderLayout.CENTER);

		/**
		 * bên dưới khung phải
		 */
		pnBottomRight.setLayout(new BoxLayout(pnBottomRight, BoxLayout.Y_AXIS));

		// tạo layout mã khách hàng
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMa = new JLabel("Mã khách hàng: ");
		txtMa = new JTextField(20);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		// tạo layout tên khách hàng
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTen = new JLabel("Tên khách hàng: ");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		// tạo layout số điện thoại
		JPanel pnPhone = new JPanel();
		pnPhone.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblPhone = new JLabel("Số điện thoại khách hàng: ");
		txtPhone = new JTextField(20);
		pnPhone.add(lblPhone);
		pnPhone.add(txtPhone);
		// tạo layout email
		JPanel pnEmail = new JPanel();
		pnEmail.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblEmail = new JLabel("Email khách hàng: ");
		txtEmail = new JTextField(20);
		pnEmail.add(lblEmail);
		pnEmail.add(txtEmail);

		lblMa.setPreferredSize(lblPhone.getPreferredSize());
		lblTen.setPreferredSize(lblPhone.getPreferredSize());
		lblEmail.setPreferredSize(lblPhone.getPreferredSize());
		// thêm vào bootom right
		pnBottomRight.add(pnMa);
		pnBottomRight.add(pnTen);
		pnBottomRight.add(pnPhone);
		pnBottomRight.add(pnEmail);

		// tạo pnbutton
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnLuu = new JButton("lưu khách hàng");
		btnXoa = new JButton("xóa khách hàng");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnBottomRight.add(pnButton);
	}
	
	public void fakeData() {
		//tạo các ds nhóm
		dsNhom = new ArrayList<NhomKhachHang>();
		NhomKhachHang vip = new NhomKhachHang("n1","khách hàng vip");
		NhomKhachHang tiemNang = new NhomKhachHang("n2","khách hàng tiềm năng");
		NhomKhachHang khoTinh = new NhomKhachHang("n3","khách hàng khó tính");
		dsNhom.add(vip);dsNhom.add(tiemNang);dsNhom.add(khoTinh);
		
		
		//tạo dữ liệu
		vip.getKhachHangs().add(new KhachHang("k1", "an", "235263446", "an@gmail.com"));
		vip.getKhachHangs().add(new KhachHang("k2", "long", "536456753", "long@gmail.com"));
		vip.getKhachHangs().add(new KhachHang("k3", "hoang", "2352335647", "hoang@gmail.com"));
		
		tiemNang.getKhachHangs().add(new KhachHang("k1", "rơtgf", "453745777", "34fggd@gmail.com"));
		tiemNang.getKhachHangs().add(new KhachHang("k2", "asdfsg", "5347484848", "ábvc@gmail.com"));
		
		khoTinh.getKhachHangs().add(new KhachHang("k1", "hgkhjl", "548348383", "ầdfa@gmail.com"));
		khoTinh.getKhachHangs().add(new KhachHang("k2", "tegdf", "235263446", "anttrt@gmail.com"));
		
		treeNhom.expandRow(0); //đặt là hàng thứ 0
		for(NhomKhachHang nhom : dsNhom) {
			DefaultMutableTreeNode nodeNhom = new DefaultMutableTreeNode(nhom); //tạo ra 1 node, truyền vào nhóm
			root.add(nodeNhom);//thêm node vào gốc
			for(KhachHang khach : nhom.getKhachHangs()) {
				DefaultMutableTreeNode nodeKhach = new DefaultMutableTreeNode(khach);//tạo ra 1 khách, truyền vào list khách
				nodeNhom.add(nodeKhach);
			}
		}
	}
	
	
	
	public void showWindow() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
