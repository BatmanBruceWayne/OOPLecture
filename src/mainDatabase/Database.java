package mainDatabase;

import java.util.ArrayList;
import java.util.Scanner;

import myObjects.Course;
import myObjects.Student;
import myTables.ProjectsList;
import myTables.StudentsList;
import myObjects.Teacher;
import myTables.TeachersList;

public class Database {
	private ArrayList<Course> coursesList;
	private StudentsList studentsList;
	private TeachersList teachersList;
	private ProjectsList projectsList;
	
	public Database() {
		coursesList = new ArrayList<>();
		studentsList = new StudentsList();
		teachersList = new TeachersList();
		projectsList = new ProjectsList();
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
					System.out.println("Ban chua chon chuc nang");;
			}
		}
		
	}
	
}
