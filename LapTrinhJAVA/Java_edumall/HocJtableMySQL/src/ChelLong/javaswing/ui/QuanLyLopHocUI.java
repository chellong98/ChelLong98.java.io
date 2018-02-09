package ChelLong.javaswing.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

import ChelLong.javaswing.bean.Room;
import ChelLong.javaswing.bean.Student;
import ChelLong.javaswing.bean.Teacher;
import ChelLong.javaswing.services.SQLService;

public class QuanLyLopHocUI extends JFrame {
	JTable tblCenter;
	MyDefaultTable dtmCenter;
	JTree treeNhom;
	DefaultMutableTreeNode root;
	JTextField txtUsername, txtDatabaseName;
	JPasswordField txtPassword;
	JTextArea areaQuery;
	JButton btnTestDatabase, btnExecuteQuery;
	SQLService service = null;
	DefaultMutableTreeNode nodeSelected = null;
	String check = "";
	Student studentSelected = null;
	Teacher TeacherSelected = null;
	JPanel pnCenter = null;
	JScrollPane scCenter = null;
	List<Student> listStudent = null;
	List<Teacher> listTeacher = null;
	List<Room> listRoom = null;
	DefaultMutableTreeNode nodeStudent = null;
	DefaultMutableTreeNode nodeTeacher = null;
	DefaultMutableTreeNode nodeRoom = null;
	String[] types = {"Student","Teacher","Room"};
	public QuanLyLopHocUI(String title) {
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnTestDatabase.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyKetNoi();
			}
		});
		txtDatabaseName.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyKetNoi();
			}
		});
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
				xuLyHienThiTable();
			}
		});

		btnExecuteQuery.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyExecute();
			}
		});
	}

	protected void xuLyExecute() {
		// TODO Auto-generated method stub
		String strQuery = areaQuery.getText();
		strQuery = strQuery.toLowerCase().trim();
		
		
		if(strQuery.equalsIgnoreCase("select * from quanlylophoc."+types[0])) {
			listStudent = service.listStudent();
			hienThiStudent();
		}
		else if(strQuery.equalsIgnoreCase("select * from quanlylophoc."+types[1])) {
			listTeacher = service.listTeacher();
			hienThiTeacher();
		}
		else if(strQuery.equalsIgnoreCase("select * from quanlylophoc."+types[2])) {
			listRoom = service.listRoom();
			hienThiRoom();
		}
		else {
			JOptionPane.showMessageDialog(null, "truy vấn sai!");
		}
		tblCenter = new JTable(dtmCenter);
		scCenter = new JScrollPane(tblCenter);
		pnCenter.add(scCenter, BorderLayout.CENTER);
		showWindow();
	}

	protected void xuLyHienThiTable() {
		// TODO Auto-generated method stub
		nodeSelected = (DefaultMutableTreeNode) treeNhom.getLastSelectedPathComponent();

		if (nodeSelected != null && nodeSelected.getLevel() == 1) {
			Object o = nodeSelected.getUserObject();
			check = o.toString();
			System.out.println(check);
			if (check.equals("Student")) {
				hienThiStudent();
				// showWindow();
			} else if (check.equals("Teacher")) {
				hienThiTeacher();
				// showWindow();
			} else if (check.equals("Room")) {
				hienThiRoom();
			}
			tblCenter = new JTable(dtmCenter);
			scCenter = new JScrollPane(tblCenter);
			pnCenter.add(scCenter, BorderLayout.CENTER);
			showWindow();
		} else if (nodeSelected != null && nodeSelected.getLevel() == 2) {
			int index = -1;
			if (check.equals("Student")) {
				index = nodeStudent.getIndex(nodeSelected);
			}
			if (check.equals("Teacher")) {
				index = nodeTeacher.getIndex(nodeSelected);
			}
			if (check.equals("Room")) {
				index = nodeRoom.getIndex(nodeSelected);
			}
			tblCenter.changeSelection(index, 0, false, false);
		}
	}

	public void hienThiStudent() {
		pnCenter.remove(scCenter);
		showWindow();
		dtmCenter = new MyDefaultTable();
		dtmCenter.addColumn("CodeStudent");
		dtmCenter.addColumn("Name");
		dtmCenter.addColumn("Age");
		dtmCenter.addColumn("Hobby");
		dtmCenter.addColumn("codeRoom");
		dtmCenter.setRowCount(0);
		Vector<Student> vector = new Vector<>();
		vector.addAll(listStudent);
		for (Student stud : vector) {
			Vector<Object> vec = new Vector<>();
			vec.add(stud.getStudentCode());
			vec.add(stud.getName());
			vec.add(stud.getAge());
			vec.add(stud.getHobby());
			vec.add(stud.getCodeRoom());
			dtmCenter.addRow(vec);
		}
	}

	public void hienThiTeacher() {
		pnCenter.remove(scCenter);
		showWindow();
		dtmCenter = new MyDefaultTable();
		dtmCenter.addColumn("CodeTeacher");
		dtmCenter.addColumn("Name");
		dtmCenter.addColumn("Age");
		dtmCenter.addColumn("Hobby");
		dtmCenter.addColumn("codeRoom");

		dtmCenter.setRowCount(0);
		Vector<Teacher> vector = new Vector<>();
		vector.addAll(listTeacher);
		for (Teacher teacher : vector) {
			Vector<Object> vec = new Vector<>();
			vec.add(teacher.getCodeTeacher());
			vec.add(teacher.getName());
			vec.add(teacher.getAge());
			vec.add(teacher.getHobby());
			vec.add(teacher.getCodeRoom());
			dtmCenter.addRow(vec);
		}
	}

	public void hienThiRoom() {
		pnCenter.remove(scCenter);
		dtmCenter = new MyDefaultTable();
		dtmCenter.addColumn("CodeRoom");
		dtmCenter.addColumn("NameRoom");

		dtmCenter.setRowCount(0);
		Vector<Room> vector = new Vector<>();
		vector.addAll(listRoom);
		for (Room room : vector) {
			Vector<Object> vec = new Vector<>();
			vec.add(room.getCodeRoom());
			vec.add(room.getNameRoom());
			dtmCenter.addRow(vec);
		}
	}

	protected void xuLyKetNoi() {
		// TODO Auto-generated method stub
		service = new SQLService(txtUsername.getText(), txtPassword.getText(), txtDatabaseName.getText());
		if (service.conn != null) {
			JOptionPane.showMessageDialog(null, "Connect database successful", "thông báo", JOptionPane.OK_OPTION,
					new ImageIcon("images/successful.png"));
		}
		txtUsername.setText("");
		txtPassword.setText("");
		txtDatabaseName.setText("");
		try {
			xuLyHienThiLenTree();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private void xuLyHienThiLenTree() {
		// TODO Auto-generated method stub
		// đọc dữ liệu học sinh
		listStudent = service.listStudent();
		listTeacher = service.listTeacher();
		listRoom = service.listRoom();

		// listTeacher.toString() = "Student";
		nodeStudent = new DefaultMutableTreeNode("Student");
		nodeTeacher = new DefaultMutableTreeNode("Teacher");
		nodeRoom = new DefaultMutableTreeNode("Room");
		root.add(nodeStudent);
		root.add(nodeTeacher);
		root.add(nodeRoom);

		for (Student stud : listStudent) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(stud);
			nodeStudent.add(node);
		}
		for (Teacher teacher : listTeacher) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(teacher);
			nodeTeacher.add(node);
		}
		for (Room room : listRoom) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(room);
			nodeRoom.add(node);
			List<Student> listStudent = service.listStudentByRoom(room.getCodeRoom());
			for (Student stud : listStudent) {
				DefaultMutableTreeNode subNode = new DefaultMutableTreeNode(stud);
				node.add(subNode);
			}
			List<Teacher> listTeacher = service.listTeacherByRoom(room.getCodeRoom());
			for (Teacher teacher : listTeacher) {
				DefaultMutableTreeNode subNode = new DefaultMutableTreeNode(teacher + "(Teacher)");
				node.add(subNode);
			}
		}
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());

		pnCenter = new JPanel();
		pnCenter.setLayout(new BorderLayout());
		JPanel pnWest = new JPanel();
		pnWest.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		pnNorth.setLayout(new BoxLayout(pnNorth, BoxLayout.Y_AXIS));

		// tạo table
		dtmCenter = new MyDefaultTable();
		dtmCenter.addColumn("Title 1");
		dtmCenter.addColumn("Title 2");
		dtmCenter.addColumn("Title 3");
		dtmCenter.addColumn("Title 4");
		tblCenter = new JTable(dtmCenter);
		scCenter = new JScrollPane(tblCenter);
		pnCenter.add(scCenter, BorderLayout.CENTER);
		pnCenter.setMinimumSize(new Dimension(300, 0));
		pnCenter.setMaximumSize(new Dimension(800, 0));
		pnCenter.setPreferredSize(new Dimension(800, 0));
		// tạo tree
		root = new DefaultMutableTreeNode("Lớp Học");
		treeNhom = new JTree(root);
		JScrollPane scTree = new JScrollPane(treeNhom);
		pnWest.add(scTree, BorderLayout.CENTER);

		JSplitPane spCenter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnCenter, pnWest);
		con.add(spCenter, BorderLayout.CENTER);

		JPanel pnTopOfNorth = new JPanel();
		pnTopOfNorth.setLayout(new FlowLayout());
		JLabel lblUsername = new JLabel("Username");
		txtUsername = new JTextField(20);
		JLabel lblPassword = new JLabel("Password");
		txtPassword = new JPasswordField(20);
		JLabel lblDatabaseName = new JLabel("Tên database");
		txtDatabaseName = new JTextField(20);
		pnTopOfNorth.add(lblUsername);
		pnTopOfNorth.add(txtUsername);
		pnTopOfNorth.add(lblPassword);
		pnTopOfNorth.add(txtPassword);
		pnTopOfNorth.add(lblDatabaseName);
		pnTopOfNorth.add(txtDatabaseName);
		pnNorth.add(pnTopOfNorth, BorderLayout.NORTH);

		btnTestDatabase = new JButton("Test database");
		JPanel pnCenterOfNorth = new JPanel();
		pnCenterOfNorth.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnCenterOfNorth.add(btnTestDatabase);
		pnNorth.add(pnCenterOfNorth, BorderLayout.CENTER);
		JPanel pnExecute = new JPanel();
		pnExecute.setLayout(new FlowLayout(FlowLayout.LEFT));
		// pnExecute.setBackground(Color.red);
		pnExecute.setPreferredSize(new Dimension(0, 100));
		JPanel pnTextArea = new JPanel();
		pnTextArea.setLayout(new BorderLayout());
		areaQuery = new JTextArea(10, 50);
		JScrollPane scArea = new JScrollPane(areaQuery);
		pnTextArea.add(scArea, BorderLayout.CENTER);
		pnExecute.add(pnTextArea);
		btnExecuteQuery = new JButton("Excute Query");
		pnExecute.add(areaQuery);
		pnExecute.add(btnExecuteQuery);
		pnNorth.add(pnExecute, BorderLayout.SOUTH);
		con.add(pnNorth, BorderLayout.NORTH);
	}

	public void showWindow() {
		this.repaint();
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
