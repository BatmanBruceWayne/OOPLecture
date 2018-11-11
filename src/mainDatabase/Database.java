package mainDatabase;

import java.util.ArrayList;
import java.util.Scanner;

import myObjects.Course;
import myObjects.Student;
import myTables.CoursesList;
import myTables.ProjectsList;
import myTables.StudentsList;
import myObjects.Teacher;
import myTables.TeachersList;

public class Database {
	private CoursesList coursesList;
	private StudentsList studentsList;
	private TeachersList teachersList;
	private ProjectsList projectsList;
	
	public Database() {
		coursesList = new CoursesList();
		studentsList = new StudentsList();
		teachersList = new TeachersList();
		projectsList = new ProjectsList();
	}
	
	public void chooseOptions() {
		while(true) {
			System.out.println("1. Thêm sinh viên");
			System.out.println("2. In ra danh sách sinh viên");
			System.out.println("3. Thêm giảng viên");
			System.out.println("4. In ra danh sách giảng viên");
			System.out.println("5. Thêm môn học");
			System.out.println("6. In ra danh sách môn học");
			System.out.print("Chọn chức năng: ");
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
				case 3: 
					Teacher tc = teachersList.createTeacher();
					teachersList.addTeacher(tc);
					break;
				case 4:
					teachersList.printAllLs();
				case 5: 
					Course cr = coursesList.createCourse();
					coursesList.addCourse(cr);
					break;
				case 6:
					coursesList.printAllLs();

					break;
				default:
					System.out.println("Bạn chưa chọn chức năng");;
			}
		}
		
	}
	
}
