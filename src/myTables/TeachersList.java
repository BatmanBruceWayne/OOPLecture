package myTables;

import java.util.ArrayList;
import java.util.Scanner;

import myObjects.Student;
import myObjects.Teacher;

public class TeachersList {
	private ArrayList<Teacher> teachersList;
	private int numberOfTeachers = 0;
	
	public TeachersList() {
		teachersList = new ArrayList<>();
		numberOfTeachers = 0;
	}
	
	public Teacher createTeacher() {
		Teacher tc;
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên Giảng viên: ");
		String name = sc.nextLine();
		System.out.print("Tên trường: ");
		String school = sc.nextLine();
		tc = new Teacher(name, school);
		sc.close();
		return tc;
	}
	
	public void addTeacher(Teacher tc) {
		if(numberOfTeachers == 0) {
			tc.setId(1);
		} else {
			int id = teachersList.get(numberOfTeachers - 1).getId() + 1;
			tc.setId(id);
		}
		this.numberOfTeachers++;
		teachersList.add(tc);
		System.out.println("Đã thêm giảng viên thành công");
		System.out.println("----------------------");
	}
	
	public void modifyTeacher() {
		
	}
	
	public void printAllLs() {
		if(numberOfTeachers == 0) {
			System.out.println("Chưa có ai trong danh sách");
		} else 
			for(Teacher st: teachersList) {
				st.printInfo();
			}
		System.out.println("---------------------");
		
	}

	public ArrayList<Teacher> getTeachersList() {
		return teachersList;
	}
	
	//////////////////////
	
	
	
	
//	public void deleteTeacher(int id) {
//		int tmp = 0;
//		for(Teacher tc: teachersList) {
//			if(tc.getId() == id) {
//				teachersList.remove(tc);
//				this.numberOfTeachers--;
//				return;
//			}
//			tmp++;
//		}
//		if(numberOfTeachers == tmp)
//			System.out.println("Khong ton tai giang vien nay");
//		////can bo sung
//	}
}
