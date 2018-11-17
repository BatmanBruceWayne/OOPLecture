package myTables;

import java.util.ArrayList;
import java.util.Scanner;

import myObjects.Course;
import myObjects.StudyClass;
import myObjects.Teacher;

public class ClassesList {
	private ArrayList<StudyClass> classesList;
	private int numberOfClasses = 0;
	
	public ClassesList() {
		classesList = new ArrayList<>();
		numberOfClasses = 0;
	}
	
	public StudyClass createClass() {
		StudyClass cl;
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên lớp học: ");
		String name = sc.nextLine();
		System.out.print("Tên phòng học: ");
		String room = sc.nextLine();
		System.out.print("ID của môn học: ");
		int course_id = sc.nextInt();
		cl = new StudyClass(name, room, course_id);
		sc.close();
		return cl;
	}
	
	public void addClass(StudyClass cl) {
		if(numberOfClasses == 0) {
			cl.setId(1);
		} else {
			int id = classesList.get(numberOfClasses - 1).getId() + 1;
			cl.setId(id);
		}
		this.numberOfClasses++;
		classesList.add(cl);
		System.out.println("Đã thêm lớp học thành công");
		System.out.println("----------------------");
	}
	
	public void modifyStudent(int id) {
		
	}
	
	public void printAllLs(CoursesList coursesList, TeachersList teachersList) {
		if(numberOfClasses == 0) {
			System.out.println("Chưa có lớp nào trong danh sách");
		} else {
			for(StudyClass cl: classesList) {
				cl.printInfo(coursesList, teachersList);
			}
		}
		System.out.println("---------------------");
	}

	public ArrayList<StudyClass> getClassesList() {
		return classesList;
	}
	
	///////////////////
	
	
	
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
//			System.out.println("Không tồn tại lớp học này");
//		///can bo sung
//	}
}
