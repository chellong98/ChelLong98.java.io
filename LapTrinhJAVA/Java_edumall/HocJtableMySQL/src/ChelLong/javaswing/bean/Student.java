package ChelLong.javaswing.bean;

public class Student extends Nguoi {
	private String studentCode;
	private String codeRoom;
	

	public String getCodeRoom() {
		return codeRoom;
	}

	public void setCodeRoom(String codeRoom) {
		this.codeRoom = codeRoom;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String hobby, String studentCode, String codeRoom) {
		super(name, age, hobby);
		this.studentCode = studentCode;
		this.codeRoom = codeRoom;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}
	
	
}
