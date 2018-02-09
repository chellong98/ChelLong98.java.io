package ChelLong.javaswing.bean;

public class Teacher extends Nguoi {
	private String codeTeacher;
	private String codeRoom;
	
	public String getCodeRoom() {
		return codeRoom;
	}

	public void setCodeRoom(String codeRoom) {
		this.codeRoom = codeRoom;
	}

	public String getCodeTeacher() {
		return codeTeacher;
	}

	public void setCodeTeacher(String codeTeacher) {
		this.codeTeacher = codeTeacher;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String hobby, String codeTeacher, String codeRoom) {
		super(name, age, hobby);
		this.codeTeacher = codeTeacher;
		this.codeRoom = codeRoom;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}
	
	
}
