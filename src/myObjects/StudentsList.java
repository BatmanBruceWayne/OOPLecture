package myObjects;

import java.util.ArrayList;

public class StudentsList {
	private ArrayList<Student> studentsList;
	private int numberOfStudents = 0;
	
	public StudentsList() {
		studentsList = new ArrayList<>();
		numberOfStudents = 0;
	}
	
	public void addStudent(Student st) {
		if(numberOfStudents == 0) {
			st.setId(1);
		} else {
			int id = studentsList.get(numberOfStudents - 1).getId() + 1;
			st.setId(id);
		}
		this.numberOfStudents++;
		studentsList.add(st);
		System.out.println("Da them hoc sinh thanh cong");
	}
	
	public void modifyStudent() {
		
	}
	
	public void deleteStudent(int id) {
		int tmp = 0;
		for(Student st: studentsList) {
			if(st.getId() == id) {
				studentsList.remove(st);
				this.numberOfStudents--;
				return;
			}
			tmp++;
		}
		if(numberOfStudents == tmp)
			System.out.println("Khong ton tai hoc sinh nay");
		///can bo sung
	}
}
