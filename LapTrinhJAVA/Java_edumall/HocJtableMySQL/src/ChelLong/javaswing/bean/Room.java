package ChelLong.javaswing.bean;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private String codeRoom;
	private String nameRoom;
	private List<Student> listStudent = new ArrayList<>();
	private List<Teacher> listTeacher = new ArrayList<>();
	
	
	public List<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public List<Teacher> getListTeacher() {
		return listTeacher;
	}

	public void setListTeacher(List<Teacher> listTeacher) {
		this.listTeacher = listTeacher;
	}

	public String getNameRoom() {
		return nameRoom;
	}

	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}

	public String getCodeRoom() {
		return codeRoom;
	}

	public void setCodeRoom(String codeRoom) {
		this.codeRoom = codeRoom;
	}

	public Room() {
		super();
	}

	@Override
	public String toString() {
		return this.nameRoom;
	}
	
	
}
