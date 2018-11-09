package myObjects;

import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private ArrayList<Integer> classesList;
    
    public Course(int id, String name, Teacher teacher, Class course_class, ArrayList <Student> course_students) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }
    
    public void addClass(int class_id) {
    	classesList.add(class_id);
    }
    
    ///// getters and setters ///////

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
