package myObjects;

import java.util.ArrayList;

import abstractParent.Person;
import myTables.StudentCourse;

public class Student extends Person{
    
    private String className;
    private ArrayList<Integer> coursesList; 

    public Student(String name, String className) {
    	super(name);
       // this.name = name;
        this.className = className;
    }
    
    public void register(int course_id) {
    	this.coursesList.add(course_id);
    }
    
    public void printInfo() {
    	System.out.println("ID sinh vien: " + id);
    	System.out.println("Ten sinh vien: " + name);
    	System.out.println("---------------------");
    }
    
    ///////////////// getters and setters /////////////////////////
   

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
