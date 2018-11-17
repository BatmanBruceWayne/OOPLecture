package myTables;

import java.util.ArrayList;
import java.util.Scanner;

import myObjects.Student;

public class StudentsList {
	private ArrayList<Student> studentsList;
	private int numberOfStudents = 0;
	
	public StudentsList() {
		studentsList = new ArrayList<>();
		numberOfStudents = 0;
	}
	
	public Student createStudent() {
		Student st;
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên sinh viên: ");
		String name = sc.nextLine();
		System.out.print("Tên lớp học: ");
		String className = sc.nextLine();
		st = new Student(name, className);
		sc.close();
		return st;
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
		System.out.println("Đã thêm sinh viên thành công");
		System.out.println("----------------------");
	}
	
	public void printAllLs() {
		if(numberOfStudents == 0) {
			System.out.println("Chưa có ai trong danh sách");
		} else 
			for(Student st: studentsList) {
				st.printInfo();
			}
		System.out.println("---------------------");
	}
	
//	public void deleteStudent(int id) {
//		int tmp = 0;
//		for(Student st: studentsList) {
//			if(st.getId() == id) {
//				studentsList.remove(st);
//				this.numberOfStudents--;
//				return;
//			}
//			tmp++;
//		}
//		if(numberOfStudents == tmp)
//			System.out.println("Khong ton tai hoc sinh nay");
//		///can bo sung
//	}
}
