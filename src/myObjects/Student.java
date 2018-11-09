package myObjects;

import java.util.ArrayList;

import abstractParent.Person;
import myTables.ClassesList;
import myTables.CoursesList;
import myTables.TeachersList;

public class Student extends Person{
    
    private String className;
    private ArrayList<Integer> coursesList;
    private ArrayList<Integer> classesList;

    public Student(String name, String className) {
    	super(name);
        this.className = className;
    }
    
    public void registerCourse(int course_id) {
    	this.coursesList.add(course_id);
    }
    
    public void registerClass(int class_id) {
    	this.classesList.add(class_id);
    }
    
    public void printInfo() {
    	System.out.println("ID sinh vien: " + id);
    	System.out.println("Ten sinh vien: " + name);
    	System.out.println("---------------------");
    }
    
    public void printClassesLs(ClassesList classesList, CoursesList crsList, TeachersList tcsLs) {
    	for(Integer class_id: this.classesList) {
    		for(StudyClass cl: classesList.getClassesList()) {
    			if(cl.getId() == class_id) {
    				cl.printInfo(crsList, tcsLs);
    				break;
    			}
    		}
    	}
    }
    
    ///////////////// getters and setters /////////////////////////
   

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
