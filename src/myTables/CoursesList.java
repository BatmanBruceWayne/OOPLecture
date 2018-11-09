package myTables;

import java.util.ArrayList;

import myObjects.Course;

public class CoursesList {
	private ArrayList<Course> coursesList;
	private int numberOfCourses = 0;
	
	public CoursesList() {
		coursesList = new ArrayList<>();
		numberOfCourses = 0;
	}
	
	public void addCourses(Course cr) {
		if(numberOfCourses == 0) {
			cr.setId(1);
		} else {
			int id = coursesList.get(numberOfCourses - 1).getId() + 1;
			cr.setId(id);
		}
		this.numberOfCourses++;
		coursesList.add(cr);
		System.out.println("Da them mon hoc thanh cong");
	}
	
	public void modifyCourse() {
		
	}
	
	public void deleteCourse(int id) {
		int tmp = 0;
		for(Course cr: coursesList) {
			if(cr.getId() == id) {
				coursesList.remove(cr);
				this.numberOfCourses--;
				return;
			}
			tmp++;
		}
		if(numberOfCourses == tmp)
			System.out.println("Khong ton tai mon hoc nay nay");
		////can bo sung
	}
}
