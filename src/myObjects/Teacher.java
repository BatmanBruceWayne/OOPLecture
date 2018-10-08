package myObjects;

import java.util.ArrayList;

public class Teacher {
    private int id;
    private String name;
    private String school;
    public static TeacherCourse teacherAndCourse;

    public Teacher(String name, String school) {
        this.name = name;
        this.school = school;
    }
    
    public void register(int id) {
    	teacherAndCourse.addRegister(this.id, id);
    }
    
    //// getters and setters //////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
