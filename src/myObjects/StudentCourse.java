package myObjects;

import java.util.ArrayList;


public class StudentCourse {
	private ArrayList<studentCourse> studentAndCourse;
	
	public StudentCourse() {
		studentAndCourse = new ArrayList<>();
	}
	
	public void addRegister(int st, int cr) {
		for(studentCourse register: studentAndCourse) {
			if(register.getStudentId() == st && register.getCourseId() == cr) {
				System.out.println("Sinh vien nay da dang ky hoc phan nay roi");
				return;
			}
		}
		studentAndCourse.add(new studentCourse(st, cr));
		System.out.println("Dang ky thanh cong");
	}

	private class studentCourse{
		private int studentId;
		private int courseId;
		public studentCourse(int st, int cr) {
			studentId = st;
			courseId = cr;
		}
		
		public int getStudentId() {
			return studentId;
		}
		
		public int getCourseId() {
			return courseId;
		}
	}
	
}
