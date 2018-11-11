package myTables;

import java.util.ArrayList;
import java.util.Scanner;

import myObjects.Course;

public class CoursesList {
	private ArrayList<Course> coursesList;
	private int numberOfCourses = 0;
	
	public CoursesList() {
		coursesList = new ArrayList<>();
		numberOfCourses = 0;
	}
	
	public Course createCourse() {
		Course cr;
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên môn học: ");
		String name = sc.nextLine();
		cr = new Course(name);
		return cr;
	}
	
	public void addCourse(Course cr) {
		if(numberOfCourses == 0) {
			cr.setId(1);
		} else {
			int id = coursesList.get(numberOfCourses - 1).getId() + 1;
			cr.setId(id);
		}
		this.numberOfCourses++;
		coursesList.add(cr);
		System.out.println("Đã thêm môn học thành công");
		System.out.println("---------------------");
	}
	
	public void printAllLs() {
		if(numberOfCourses == 0) {
			System.out.println("Chưa có môn học nào trong danh sách");
		} else 
			for(Course cr: coursesList) {
				cr.printInfo();
			}
		System.out.println("---------------------");
	}
	
	public void modifyCourse() {
		
	}
	
//	public void deleteCourse(int id) {
//		int tmp = 0;
//		for(Course cr: coursesList) {
//			if(cr.getId() == id) {
//				coursesList.remove(cr);
//				this.numberOfCourses--;
//				return;
//			}
//			tmp++;
//		}
//		if(numberOfCourses == tmp)
//			System.out.println("Không tồn tại môn học này");
//		////can bo sung
//	}

	///////////////////////
	
	public ArrayList<Course> getCoursesList() {
		return coursesList;
	}
}
