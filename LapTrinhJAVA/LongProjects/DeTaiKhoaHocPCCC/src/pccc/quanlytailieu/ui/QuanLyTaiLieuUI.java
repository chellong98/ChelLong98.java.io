package pccc.quanlytailieu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import pccc.detaikhoahoc.model.ThuatNgu;
import pccc.detaikhoahoc.service.ThuatNguService;

public class QuanLyTaiLieuUI extends JFrame {
	DefaultTableModel dtmTable;
	JTable tblTable;
	JButton btnThemMoi, btnXoa, btnSua, btnRefresh;
	JTextField txtThuatNgu;
	JPopupMenu popupMenu;
	JMenuItem itemSua, itemXoa;
	
	public static int size;
	static int rowSelected=-1;
	public QuanLyTaiLieuUI(String title) {
		super(title);
		addControls();
		addEvents();
		hienThiThuatNgu();
	}

	private void hienThiThuatNgu() {
		// TODO Auto-generated method stub
		ThuatNguService service = new ThuatNguService();
		Vector<ThuatNgu> list = service.docToanBoThuatNgu();
		Collections.sort(list);
		size = list.size();
		dtmTable.setRowCount(0);
		for(ThuatNgu tt : list) {
			Vector<Object> vec = new Vector<>();
			vec.add(tt.getSoThuTu());
			vec.add(tt.getTenThuatNgu());
			vec.add(tt.getDinhNghiaThuatNgu());
			vec.add(tt.getTaiLieuThuatNgu());
			vec.add(tt.getIsImportant());
			dtmTable.addRow(vec);
		}
//		tblTable.changeSelection(500, 0, true , true);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		txtThuatNgu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					int num = Integer.parseInt(txtThuatNgu.getText());
					tblTable.changeSelection(num-1, 0, false, false);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "số thứ tự không tồn tại");
				}
				
			}
		});
		
		btnThemMoi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyThemMoi();
			}
		});
		
		btnSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLySua();
			}
		});
		
		tblTable.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.isPopupTrigger()) {
					int row = tblTable.rowAtPoint(e.getPoint());
					int col = tblTable.columnAtPoint(e.getPoint());
					if(!tblTable.isRowSelected(row)) {
						tblTable.changeSelection(row, col, false, false);
					}
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
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
				rowSelected = tblTable.getSelectedRow();
			}
		});
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyXoa();
			}
		});
		
		btnRefresh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				hienThiThuatNgu();
			}
		});
		
		itemSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLySua();
			}
		});
		
		itemXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyXoa();
			}
		});
	}

	protected void xuLyXoa() {
		// TODO Auto-generated method stub
		ThuatNguService service = new ThuatNguService();
		if(rowSelected<0) {
			return;
		}
		
		if(service.xoaThuatNgu(rowSelected+1)) {
			JOptionPane.showMessageDialog(null, "xóa thành công");
		} else {
			JOptionPane.showMessageDialog(null, "xóa không thành công");
		}
	}

	protected void xuLySua() {
		// TODO Auto-generated method stub
		XuLyCapNhatUI ui = new XuLyCapNhatUI("xử lý cập nhật");
		if(rowSelected<0) {
			return;
		}
		ui.txtTenThuatNgu.setText(dtmTable.getValueAt(rowSelected, 1)+"");
		ui.txtDinhNghia.setText(dtmTable.getValueAt(rowSelected, 2)+"");
		ui.txtTaiLieu.setText(dtmTable.getValueAt(rowSelected, 3).toString().trim());
		ui.showWindow();
		
	}

	protected void xuLyThemMoi() {
		// TODO Auto-generated method stub
		XuLyThemMoiUI ui = new XuLyThemMoiUI("xử lý thêm mới");
		ui.showWindow();
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel pnTitle = new JPanel();
		JLabel lblTitle = new JLabel("Quản Lý Thuật Ngữ Phòng Cháy Chữa Cháy");
		lblTitle.setFont(new Font("times new roman", Font.ITALIC, 20));
		lblTitle.setForeground(Color.red);
		pnTitle.add(lblTitle);
		con.add(pnTitle, BorderLayout.NORTH);
		
		JPanel pnTable = new JPanel();
		pnTable.setLayout(new BorderLayout());
		dtmTable = new DefaultTableModel();
		dtmTable.addColumn("Số thứ tự");
		dtmTable.addColumn("Tên Thuật Ngữ");
		dtmTable.addColumn("Định Nghĩa");
		dtmTable.addColumn("Tài Liệu");
		dtmTable.addColumn("Quan Trọng");
		tblTable = new JTable(dtmTable);
		tblTable.setRowHeight(25);
		JScrollPane scTable = new JScrollPane(tblTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTable.add(scTable, BorderLayout.CENTER);
		con.add(pnTable, BorderLayout.CENTER);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnThemMoi = new JButton("thêm mới");
		btnXoa = new JButton("xóa");
		btnSua = new JButton("cập nhật");
		btnRefresh = new JButton("Refresh");
		pnButton.add(btnThemMoi);
		pnButton.add(btnXoa);
		pnButton.add(btnSua);
		JLabel lblThuatNgu = new JLabel("nhập số thứ tự cần tìm");
		txtThuatNgu = new JTextField(10);
		pnButton.add(lblThuatNgu);
		pnButton.add(txtThuatNgu);
		pnButton.add(btnRefresh);
		con.add(pnButton, BorderLayout.SOUTH);
		
		popupMenu = new JPopupMenu();
		itemSua = new JMenuItem("Cập nhật");
		popupMenu.add(itemSua);
		popupMenu.addSeparator();
		itemXoa = new JMenuItem("Xóa");
		popupMenu.add(itemXoa);
		
		
	}
	
	public void showWindow() {
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
