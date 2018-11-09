package myObjects;

import java.util.ArrayList;

import myTables.CoursesList;
import myTables.TeachersList;

public class StudyClass {
	private String name;
	private String room;
	private int course_id;
	private int teacher_id;
	private ArrayList<Integer> studentsList;
	
	private int id;
	
	public StudyClass(String name, String room, int course_id) {
		this.name = name;
		this.room = room;
		this.course_id = course_id;
	}
	
	public void printInfo(CoursesList crsList, TeachersList tcsList) {
		System.out.println("ID lớp học: " + id);
    	System.out.println("Tên lớp học: " + name);
    	System.out.println("Tên phòng học: " + room);
    	for(Course cr: crsList.getCoursesList()) {
			if(this.id == cr.getId()) {
				System.out.println("Tên môn học: " + cr.getName());
				break;
			}
		}
    	for(Teacher tc: tcsList.getTeachersList()) {
			if(this.id == tc.getId()) {
				System.out.println("Tên giảng viên" + tc.getName());
				break;
			}
		}
    	System.out.println("---------------------");
	}
	
	/////////////////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	
	
}
