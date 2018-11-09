package myObjects;

import java.util.ArrayList;

import myTables.TeacherCourse;

public class Teacher extends Person{
    private String school;
    public static TeacherCourse teacherAndCourse;

    public Teacher(String name, String school) {
    	super(name);
        this.school = school;
    }
    
    public void register(int id) {
    	teacherAndCourse.addRegister(this.id, id);
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
		System.out.println("ID cua giang vien do " + id);
    	System.out.println("Ten cua giang vien do: " + name);
    	System.out.println("---------------------");
	}
}
