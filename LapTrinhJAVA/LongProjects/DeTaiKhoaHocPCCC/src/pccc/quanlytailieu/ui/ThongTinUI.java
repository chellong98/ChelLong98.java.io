package pccc.quanlytailieu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import pccc.detaikhoahoc.model.ThuatNgu;
import pccc.detaikhoahoc.service.ThuatNguService;

public class ThongTinUI extends JFrame {
	JList<ThuatNgu> listThuatNgu;
	DefaultTableModel dtmThuatNgu;
	JTable tblThuatNgu;
	JTextArea txtThuatNgu;
	JTextPane txtpaneThuatNgu;
	JComboBox<ThuatNgu> cboThuatNgu;
	JButton btnNew, btnQuanLyThuatNgu, btnThuatNguQuanTrong;
	JCheckBox ckbThuatNguQuanTrong;
	JPopupMenu popupMenu;
	JMenuItem mnuDeleteItem, mnuDeleteAll;

	ThuatNgu thuatNguSelected;

	public ThongTinUI(String title) {
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		listThuatNgu.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

				hienThiThongTin();
			}
		});
		tblThuatNgu.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.isPopupTrigger()) { // click chuột phải
					int row = tblThuatNgu.rowAtPoint(e.getPoint());
					int col = tblThuatNgu.columnAtPoint(e.getPoint());
					if (!tblThuatNgu.isRowSelected(row)) {
						tblThuatNgu.changeSelection(row, col, false, false);
					}
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				xuLyHienThiTextArea();
			}
		});
		btnQuanLyThuatNgu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LoginUI ui = new LoginUI("đăng nhập quản trị");
				ui.showWindow();
			}
		});
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtpaneThuatNgu.setText("");
			}
		});
		cboThuatNgu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				thuatNguSelected = (ThuatNgu) cboThuatNgu.getSelectedItem();
				if (thuatNguSelected == null) {
					return;
				}
				hienThiThongTinLenbang(thuatNguSelected);
			}
		});
		mnuDeleteItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyXoa(tblThuatNgu.getSelectedRow());
			}
		});
		mnuDeleteAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyXoa();
			}
		});

		ckbThuatNguQuanTrong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyThuatNguQuanTrong();
			}
		});
		btnThuatNguQuanTrong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyHienThiThuatNguQuanTrong();
			}
		});
	}

	protected void xuLyHienThiThuatNguQuanTrong() {
		// TODO Auto-generated method stub
		ThuatNguService service = new ThuatNguService();
		Vector<ThuatNgu> vec = service.docToanBoThuatNguQuanTrong();
		listThuatNgu.setListData(vec);
	}

	protected void xuLyThuatNguQuanTrong() {
		// TODO Auto-generated method stub
		ThuatNguService service = new ThuatNguService();
		if (ckbThuatNguQuanTrong.isSelected()) { // nếu chọn thì cho isimportant = 1
			int ret = service.thuatNguQuanTrong(thuatNguSelected.getSoThuTu(), 1);
			if (ret > 0) {
				JOptionPane.showMessageDialog(null, "đã thêm vào thuật ngữ quan trọng");
			}
		} else { // nếu không chọn thì cho is
			service.thuatNguQuanTrong(thuatNguSelected.getSoThuTu(), 0);
		}
	}

	protected void xuLyXoa() { // xóa hết cả bảng
		// TODO Auto-generated method stub
		int num = tblThuatNgu.getRowCount();
		dtmThuatNgu.setRowCount(0);
		dtmThuatNgu.setNumRows(0);
		
	}

	protected void xuLyXoa(int row) { // xóa 1 dòng đã chọn
		// TODO Auto-generated method stub
		dtmThuatNgu.removeRow(row);
	}

	protected void xuLyHienThiTextArea() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		try {
			
		
		int row = tblThuatNgu.getSelectedRow();
		if (row <0) {
			return;
		}
		// String soThuTu = tblThuatNgu.getValueAt(row, 0)+"";
		// String tenThuatNgu = tblThuatNgu.getValueAt(row, 1)+"";
		// String dinhNghia = tblThuatNgu.getValueAt(row, 2)+"";
		// String taiLieu = tblThuatNgu.getValueAt(row, 3)+"";
		// builder.append("số thứ tự: " + soThuTu + "\n" + "tên thuật ngữ: " +
		// tenThuatNgu + "\n" + "Định Nghĩa: " + dinhNghia + "\n" + "Tài liệu: " +
		// taiLieu);
		// txtThuatNgu.setText(builder.toString());
	
		txtpaneThuatNgu.setText("");
//		addColorText(txtpaneThuatNgu, "Số thứ tự: ", Color.red, 25, "times new roman");
//		addColorText(txtpaneThuatNgu, tblThuatNgu.getValueAt(row, 0) + "\n", Color.black, 20, "arial");
		addColorText(txtpaneThuatNgu, "Tên thuật ngữ: ", Color.red, 25, "times new roman");
		addColorText(txtpaneThuatNgu, tblThuatNgu.getValueAt(row, 1) + "\n", Color.black, 20, "arial");
		addColorText(txtpaneThuatNgu, "Định nghĩa thuật ngữ: ", Color.red, 25, "times new roman");
		addColorText(txtpaneThuatNgu, tblThuatNgu.getValueAt(row, 2) + "\n", Color.black, 20, "arial");
		addColorText(txtpaneThuatNgu, "Tài liệu: ", Color.red, 25, "times new roman");
		addColorText(txtpaneThuatNgu, tblThuatNgu.getValueAt(row, 3) + "\n", Color.black, 20, "arial");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void addColorText(JTextPane pane, String str, Color color, int size, String nameFont) {
		StyledDocument doc = pane.getStyledDocument();
		Style style = pane.addStyle("Color", null);

		StyleConstants.setForeground(style, color);
		StyleConstants.setItalic(style, true);
		StyleConstants.setFontFamily(style, nameFont);
		StyleConstants.setFontSize(style, size);
		try {
			doc.insertString(doc.getLength(), str, style);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void hienThiThongTin() {
		// TODO Auto-generated method stub
		thuatNguSelected = listThuatNgu.getSelectedValue();
		if (thuatNguSelected == null)
			return;
		hienThiThongTinLenbang(thuatNguSelected);
		cboThuatNgu.setSelectedItem(thuatNguSelected);
		if (thuatNguSelected.getIsImportant() == 1) { // nếu là thuật ngữ quan trọng thì tích
			ckbThuatNguQuanTrong.setSelected(true);
			// System.out.println("click");
		} else { // nếu không là thuật ngữ quan trọng thì bỏ tích
			ckbThuatNguQuanTrong.setSelected(false);
		}
	}

	private void hienThiThongTinLenbang(ThuatNgu tt) {
		// TODO Auto-generated method stub
		Vector<Object> vec = new Vector<>();
		vec.add(tt.getSoThuTu());
		vec.add(tt.getTenThuatNgu());
		vec.add(tt.getDinhNghiaThuatNgu());
		vec.add(tt.getTaiLieuThuatNgu());
		if (kiemTraTonTai()) {
			return;
		}
		dtmThuatNgu.addRow(vec);
	}

	private boolean kiemTraTonTai() {
		// TODO Auto-generated method stub
		int row = dtmThuatNgu.getRowCount();
		for (int i = 0; i < row; i++) {
			if (thuatNguSelected.getSoThuTu() == Integer.parseInt(dtmThuatNgu.getValueAt(i, 0) + ""))
				return true; // nếu tìm thấy số thứ tự đã bị trùng trong bảng thì không cho vào bảng nữa
		}
		return false;
	}

	private void addControls() {
		// TODO Auto-generated method stub
		// try {
		// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //tạo
		// giao diện giống window
		// } catch (Exception e) {
		// // TODO: handle exception
		// }

		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		// tạo ra 2 panel chính
		JPanel pnLeft = new JPanel();
		pnLeft.setPreferredSize(new Dimension(400, 0));
		JPanel pnRight = new JPanel();
		JSplitPane spMain = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
		spMain.setOneTouchExpandable(true);
		con.add(spMain, BorderLayout.CENTER);

		// tạo 2 panel trên phải và dưới phải
		pnRight.setLayout(new BoxLayout(pnRight, BoxLayout.Y_AXIS));
		JPanel pnTopOfRight = new JPanel();
		pnTopOfRight.setPreferredSize(new Dimension(0, 300));
		JPanel pnBottomOfRight = new JPanel();
		JSplitPane spRight = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pnTopOfRight, pnBottomOfRight);
		spRight.setOneTouchExpandable(true);
		pnRight.add(spRight);

		// tạo các nội dung chính
		// tạo list
		pnLeft.setLayout(new BorderLayout());
		listThuatNgu = new JList<ThuatNgu>();
		listThuatNgu.setFont(new Font("arial", Font.BOLD, 15));
		listThuatNgu.setForeground(Color.red);
		JScrollPane scList = new JScrollPane(listThuatNgu, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnLeft.add(scList, BorderLayout.CENTER);
		TitledBorder borderList = new TitledBorder(BorderFactory.createLineBorder(Color.RED), "Danh Sách thuật ngữ");
		borderList.setTitleFont(new Font("times new roman", Font.ITALIC, 15));
		borderList.setTitleColor(Color.RED);
		borderList.setTitlePosition(TitledBorder.CENTER); // căn chữ nằm trên border
		borderList.setTitleJustification(TitledBorder.CENTER); // căn chữ ra giữa
		pnLeft.setBorder(borderList);

		// tạo nút
		JPanel pnListButton = new JPanel();
		pnListButton.setLayout(new FlowLayout());
		btnThuatNguQuanTrong = new JButton("Thuật ngữ quan trọng");
		pnListButton.add(btnThuatNguQuanTrong);
		pnLeft.add(pnListButton, BorderLayout.SOUTH);

		// tạo bảng
		pnTopOfRight.setLayout(new BorderLayout());
		dtmThuatNgu = new DefaultTableModel();
		dtmThuatNgu.addColumn("Số thứ tự");
		dtmThuatNgu.addColumn("Tên Thuật Ngữ");
		dtmThuatNgu.addColumn("Định Nghĩa");
		dtmThuatNgu.addColumn("Tài Liệu");

		tblThuatNgu = new JTable(dtmThuatNgu);
		JScrollPane scTable = new JScrollPane(tblThuatNgu, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTopOfRight.add(scTable, BorderLayout.CENTER);
		TitledBorder borderTable = new TitledBorder(BorderFactory.createLineBorder(Color.RED),
				"Bảng chi tiết thuật ngữ");
		borderTable.setTitleFont(new Font("times new roman", Font.ITALIC, 15));
		borderTable.setTitleColor(Color.RED);
		borderTable.setTitlePosition(TitledBorder.CENTER); // căn chữ nằm trên border
		borderTable.setTitleJustification(TitledBorder.CENTER); // căn chữ ra giữa
		pnTopOfRight.setBorder(borderTable);

		// tạo text area
		pnBottomOfRight.setLayout(new BorderLayout());
		// txtThuatNgu = new JTextArea();
		// txtThuatNgu.setWrapStyleWord(true);
		// txtThuatNgu.setLineWrap(true);
		// txtThuatNgu.setEditable(false);// không cho sửa
		// txtThuatNgu.setFont(new Font("arial", Font.ITALIC, 20));
		// JScrollPane scArea = new JScrollPane(txtThuatNgu,
		// JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		// JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		// pnBottomOfRight.add(scArea, BorderLayout.CENTER);
		txtpaneThuatNgu = new JTextPane();
		txtpaneThuatNgu.setEditable(false);
		txtpaneThuatNgu.setFont(new Font("arial", Font.ITALIC, 20));
		JScrollPane scPane = new JScrollPane(txtpaneThuatNgu);
		pnBottomOfRight.add(scPane, BorderLayout.CENTER);

		// tạo cbobox
		JPanel pnCboThuatNgu = new JPanel();
		pnCboThuatNgu.setLayout(new FlowLayout(FlowLayout.CENTER));
		cboThuatNgu = new JComboBox<ThuatNgu>();
		cboThuatNgu.setPreferredSize(new Dimension(200, 20));
		pnCboThuatNgu.add(cboThuatNgu);
		pnBottomOfRight.add(pnCboThuatNgu, BorderLayout.NORTH);
		btnNew = new JButton("Làm mới");
		btnQuanLyThuatNgu = new JButton("Quản lý thuật ngữ");
		ckbThuatNguQuanTrong = new JCheckBox("Thuật ngữ quan trọng");
		pnCboThuatNgu.add(btnNew);
		pnCboThuatNgu.add(btnQuanLyThuatNgu);
		pnCboThuatNgu.add(ckbThuatNguQuanTrong);
		popupMenu = new JPopupMenu();
		mnuDeleteAll = new JMenuItem("Delete All");
		mnuDeleteItem = new JMenuItem("Delete Item");
		popupMenu.add(mnuDeleteItem);
		popupMenu.addSeparator();
//		popupMenu.add(mnuDeleteAll);
	}

	public void showWindow() {
		this.setSize(1100, 700);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
