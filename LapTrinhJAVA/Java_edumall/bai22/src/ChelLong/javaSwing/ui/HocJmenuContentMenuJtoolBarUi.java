package ChelLong.javaSwing.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class HocJmenuContentMenuJtoolBarUi extends JFrame{
	JMenuBar menubar; //nơi chứa các menu
	JMenu mnuFile;
	JMenu mnuEdit;
	JMenu mnuHelp;
	
	JMenuItem mnuFileNew;
	JMenuItem mnuFileOpen;
	JMenuItem mnuFileExit;
	
	JMenuItem mnuEditCopy;
	JMenuItem mnuEditPaste;
	JMenuItem mnuEditDelete;
	
	JMenuItem mnuHelpGui;
	JMenuItem mnuHelpAbout;    
	
	JButton btn1, btn2;
	JMenuItem mnuPopupMauXanh, mnuPopupMauDo;
	
	JButton btnLastedChoose = null;
	
	JToolBar toolBar;
	JButton btnLenh1, btnLenh2;
	JCheckBox ckb1, ckb2;
	
	public HocJmenuContentMenuJtoolBarUi(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		addConTrols();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		mnuFileExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		mnuFileNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "bạn vừa new file ");
			}
		});
		
		
	}

	private void addConTrols() {
		// TODO Auto-generated method stub
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		mnuFile = new JMenu("File");
		menubar.add(mnuFile);
		mnuEdit = new JMenu("Edit");
		menubar.add(mnuEdit);
		mnuHelp = new JMenu("Help");
		menubar.add(mnuHelp);
		
		mnuFileNew = new JMenuItem("New");
		mnuFileNew.setAccelerator(KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));//gán phím tắt
		mnuFileOpen = new JMenuItem("Open");
		mnuFileExit= new JMenuItem("Exit");
		mnuFileExit.setIcon(new ImageIcon("image/sad.png")); //set icon
		mnuFile.add(mnuFileNew);
		mnuFile.add(mnuFileOpen);
		mnuFile.addSeparator();
		mnuFile.add(mnuFileExit);
		
		mnuEditCopy = new JMenuItem("Copy");
		mnuEditPaste = new JMenuItem("Paste");
		mnuEditDelete = new JMenuItem("Delete");
		mnuEdit.add(mnuEditCopy);
		mnuEdit.add(mnuEditPaste);
		mnuEdit.add(mnuEditDelete);
		
		mnuHelpGui = new JMenuItem("Guilder");
		mnuHelpAbout = new JMenuItem("About");
		mnuHelp.add(mnuHelpGui);
		mnuHelp.add(mnuHelpAbout);
		
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		toolBar = new JToolBar(); //tạo 1 toolbar để kéo thả trên giao diện
		btnLenh1 = new JButton("lệnh 1");
		btnLenh2 = new JButton("lênh 2");
		ckb1 = new JCheckBox("tự động lưu dữ liệu sau 10 phút!");
		toolBar.add(btnLenh1);
		toolBar.add(btnLenh2);
		toolBar.add(ckb1);
		con.add(toolBar,BorderLayout.NORTH); //đặt ở bên trên
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new FlowLayout());
		btn1 = new  JButton("button1");
		btn2 = new JButton("button2");
		pnMain.add(btn1);
		pnMain.add(btn2);
		con.add(pnMain,BorderLayout.CENTER);
		
		btn1.addMouseListener(new PopClickListener());
		btn2.addMouseListener(new PopClickListener());
	}
	class PopUpDemo extends JPopupMenu {//tạo ra menu khi kích chuột phải vào
		public PopUpDemo() {
			mnuPopupMauDo = new JMenuItem("Tô màu đỏ");
			add(mnuPopupMauDo);
			mnuPopupMauXanh = new JMenuItem("Tô màu xanh");
			add(mnuPopupMauXanh);
			
			mnuPopupMauDo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (btnLastedChoose!=null) {
						btnLastedChoose.setBackground(Color.red);
					}
				}
			});
			
			mnuPopupMauXanh.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (btnLastedChoose!=null) {
						btnLastedChoose.setBackground(Color.BLUE);
					}
				}
			});
		}
	}
	
	class PopClickListener extends MouseAdapter { //để biết xem nhấn chuột nào
		public void mousePressed(MouseEvent e) { //kiểm tra kích chuột
			if (e.isPopupTrigger()) { //kích chuột phải
				doPop(e);
			}
		}
		
		public void mouseReleased(MouseEvent e) { //kiểm tra nhả chuột
			if (e.isPopupTrigger()) {
				doPop(e);
			}
		}
		
		private void doPop(MouseEvent e) { 
			PopUpDemo menu = new PopUpDemo();
			btnLastedChoose = (JButton)e.getComponent(); //chọn ra nút ấn cuối cùng
			menu.show(e.getComponent(), e.getX(), e.getY());
		}
	}
	public void showWindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
