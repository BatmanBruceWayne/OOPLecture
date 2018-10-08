package mainDatabase;

import java.util.ArrayList;

import myObjects.Course;
import myObjects.Student;
import myObjects.StudentCourse;
import myObjects.StudentsList;
import myObjects.Teacher;
import myObjects.TeacherCourse;
import myObjects.TeachersList;

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
	
}
