package ChelLong.javaswing.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import ChelLong.javaswing.bean.Room;
import ChelLong.javaswing.bean.Student;
import ChelLong.javaswing.bean.Teacher;

public class SQLService {
	public static Connection conn = null;

	public SQLService(String username, String password, String databaseName) {
		String sql = "jdbc:mysql://localhost:3306/" + databaseName + "?userUnicode=true&characterEncoding=utf-8";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(sql, username, password);

		} catch (SQLException e) {
			// TODO: handle exception
			if (!databaseName.equalsIgnoreCase("quanlylophoc")) {
				JOptionPane.showMessageDialog(null, "Databasename is incorrect", "warning report",
						JOptionPane.OK_OPTION, new ImageIcon("images/warning.png"));
				return;
			}
			JOptionPane.showMessageDialog(null,
					"Connect database not successful\n" + "username or password is incorrect", "error report",
					JOptionPane.OK_OPTION, new ImageIcon("images/sad.png"));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<Student> listStudent() {
		ArrayList<Student> list = new ArrayList<>();
		try {
			String sql = "select * from quanlylophoc.student";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				Student stud = new Student();
				stud.setStudentCode(result.getString(1));
				stud.setName(result.getString(2));
				stud.setAge(result.getInt(3));
				stud.setHobby(result.getString(4));
				stud.setCodeRoom(result.getString(5));
				list.add(stud);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<Teacher> listTeacher() {
		ArrayList<Teacher> list = new ArrayList<>();
		try {
			String sql = "select * from quanlylophoc.teacher";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				Teacher teacher = new Teacher();
				teacher.setCodeTeacher(result.getString(1));
				teacher.setName(result.getString(2));
				teacher.setAge(result.getInt(3));
				teacher.setHobby(result.getString(4));
				teacher.setCodeRoom(result.getString(5));
				list.add(teacher);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<Room> listRoom() {
		ArrayList<Room> list = new ArrayList<>();
		try {
			String sql = "select *from quanlylophoc.room";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				Room room = new Room();
				room.setCodeRoom(result.getString(1));
				room.setNameRoom(result.getString(2));
				room.setListStudent(listStudentByRoom(room.getCodeRoom()));
				room.setListTeacher(listTeacherByRoom(room.getCodeRoom()));
				list.add(room);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<Student> listStudentByRoom(String codeRoom) {
		ArrayList<Student> list = new ArrayList<>();
		try {
			String sql = "select * from quanlylophoc.Student where codeRoom=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, codeRoom);
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				Student stud = new Student();
				stud.setStudentCode(result.getString(1));
				stud.setName(result.getString(2));
				stud.setAge(result.getInt(3));
				stud.setHobby(result.getString(4));
				stud.setCodeRoom(result.getString(5));
				list.add(stud);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Teacher> listTeacherByRoom(String codeRoom) {
		ArrayList<Teacher> list = new ArrayList<>();
		try {
			String sql = "select * from quanlylophoc.teacher where codeRoom=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, codeRoom);
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				Teacher stud = new Teacher();
				stud.setCodeTeacher(result.getString(1));
				stud.setName(result.getString(2));
				stud.setAge(result.getInt(3));
				stud.setHobby(result.getString(4));
				stud.setCodeRoom(result.getString(5));
				list.add(stud);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public int insertStudent(String codeStudent, String nameStudent, int age, String hobby, String codeRoom) {
		try {
			String sql = "INSERT into quanlylophoc.Student values(?,?,?,?,?)";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, codeStudent);
			preStatement.setString(2, nameStudent);
			preStatement.setInt(3, age);
			preStatement.setString(4, hobby);
			preStatement.setString(5, codeRoom);
			int result = preStatement.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}
	
	public static void main(String[] args) {
		SQLService sql = new SQLService("root", "7798", "");
		if (conn != null) {
			System.out.println("kết nối thành công");
		} else {
			System.out.println("kết nối ko thành công");
		}
		ArrayList<Teacher> list = sql.listTeacherByRoom("p1");
		for (Teacher stud : list) {
			System.out.println(stud);
		}
	}
}
