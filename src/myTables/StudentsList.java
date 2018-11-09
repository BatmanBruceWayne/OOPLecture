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
		System.out.print("Ten lop hoc: ");
		String className = sc.nextLine();
		st = new Student(name, className);
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
		System.out.println("Da them hoc sinh thanh cong");
		System.out.println("----------------------");
	}
	
	public void modifyStudent(int id) {
		
	}
	
	public void printAllLs() {
		if(numberOfStudents == 0) {
			System.out.println("Chua hoc sinh nao trong danh sach");
		} else 
			for(Student st: studentsList) {
				
				st.printInfo();
			}
		System.out.println("---------------------");
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
