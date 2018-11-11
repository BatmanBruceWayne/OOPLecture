package myObjects;

import java.util.ArrayList;

import abstractParent.Person;
import myTables.ClassesList;
import myTables.CoursesList;
import myTables.TeachersList;

public class Teacher extends Person{
    private String school;
    private ArrayList<Integer> coursesList;

    public Teacher(String name, String school) {
    	super(name);
        this.school = school;
    }
    
    public void register(int course_id) {
    	coursesList.add(course_id);
    }
    
    public void printClassesLs(ClassesList classesList, CoursesList coursesList, TeachersList tcsList) {
    	for(StudyClass cl: classesList.getClassesList()) {
    		if(cl.getTeacher_id() == this.id) {
    			cl.printInfo(coursesList, tcsList);
    		}
    	}
    }
    
    //// getters and setters //////    

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
    ////////////////////

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("ID giảng viên: " + id);
    	System.out.println("Tên giảng viên: " + name);
    	System.out.println("Tên trường: " + school);
    	System.out.println("---------------------");
	}
}
