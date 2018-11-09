package mainDatabase;

import java.util.ArrayList;
import java.util.Scanner;

import myObjects.Course;
import myObjects.Student;
import myTables.StudentCourse;
import myTables.StudentsList;
import myObjects.Teacher;
import myTables.TeacherCourse;
import myTables.TeachersList;

public class Database {
	private ArrayList<Course> coursesList;
	private TeacherCourse teacherAndCourse;
	private StudentsList studentsList;
	private TeachersList teachersList;
	private StudentCourse studentAndCourse;
	
	public Database() {
		coursesList = new ArrayList<>();
		studentAndCourse = new StudentCourse();
		Student.studentAndCourse = studentAndCourse;
		teacherAndCourse = new TeacherCourse();
		Teacher.teacherAndCourse = teacherAndCourse;
		studentsList = new StudentsList();
		teachersList = new TeachersList();
	}
	
	public void chooseOptions() {
		while(true) {
			System.out.println("1. Thêm sinh viên");
			System.out.println("2. In ra danh sách sinh viên");
			System.out.print("Chon Chuc nang: ");
			Scanner sc = new Scanner(System.in);
			int myOption = sc.nextInt();
			switch(myOption) {
				case 1: 
					Student st = studentsList.createStudent();
					studentsList.addStudent(st);
					break;
				case 2:
					studentsList.printAllLs();
					break;
				default:
					System.out.println("dm");;
			}
		}
		
	}
	
}
