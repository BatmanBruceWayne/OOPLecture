package myTables;

import java.util.ArrayList;

import myObjects.Teacher;

public class TeachersList {
	private ArrayList<Teacher> teachersList;
	private int numberOfTeachers = 0;
	
	public TeachersList() {
		teachersList = new ArrayList<>();
		numberOfTeachers = 0;
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
		System.out.println("Da them giang vien thanh cong");
	}
	
	public void modifyTeacher() {
		
	}
	
	public void printAllLs() {
		if(numberOfTeachers == 0) {
			System.out.println("Chua giang vien nao trong danh sach");
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
