package myObjects;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String className;
    public static StudentCourse studentAndCourse;

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }
    
    public void register(int id) {
    	studentAndCourse.addRegister(this.id, id);
    }
    
    ///////////////// getters and setters /////////////////////////
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return name;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
