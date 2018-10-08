import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String name;
	public void setAge(int ag) {
		age = ag;
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	private int age;
	private int studentId;
	private Date birthday = null;
	private SimpleDateFormat check;
	
	
	public Student(String name, int age, int studentId, String birth) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.check = new SimpleDateFormat("dd/MM/yyyy");
		check.setLenient(false);
		try {
			this.birthday = check.parse(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public Student(String name, int age, int studentId, String birth, int a) {
//		this( name,  age,  studentId, birth);
//		System.out.println("Student's name is " + this.name);		
//	}
//	
	
	
	public void printInfo() {
		System.out.println("Student's name is " + this.name);
		System.out.println("Student's age is " + this.age);
		System.out.println("Student's id is " + this.studentId);
		System.out.println("Student's birthday is " + this.birthday);

		System.out.println("I am Batman");


	}
	
}
