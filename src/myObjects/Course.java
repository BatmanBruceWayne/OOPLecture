package myObjects;

import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private Class course_class;

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

    public Class getCourse_class() {
        return course_class;
    }

    public void setCourse_class(Class course_class) {
        this.course_class = course_class;
    }

    public Course(int id, String name, Teacher teacher, Class course_class, ArrayList <Student> course_students) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.course_class = course_class;
    }
}
