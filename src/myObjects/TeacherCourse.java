package myObjects;

import java.util.ArrayList;

public class TeacherCourse {
private ArrayList<teacherCourse> teacherAndCourse;
	
	public TeacherCourse() {
		teacherAndCourse = new ArrayList<>();
	}
	
	public void addRegister(int tc, int cr) {
		for(teacherCourse register: teacherAndCourse) {
			if(register.getTeacherId() == tc && register.getCourseId() == cr) {
				System.out.println("Giang vien nay da dang ky hoc phan nay roi");
				return;
			}
		}
		teacherAndCourse.add(new teacherCourse(tc, cr));
		System.out.println("Dang ky thanh cong");
	}

	private class teacherCourse{
		private int teacherId;
		private int courseId;
		public teacherCourse(int tc, int cr) {
			teacherId = tc;
			courseId = cr;
		}
		
		public int getTeacherId() {
			return teacherId;
		}
		
		public int getCourseId() {
			return courseId;
		}
	}
}
