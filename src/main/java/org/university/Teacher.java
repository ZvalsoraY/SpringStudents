package org.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Teacher {
    @Value("Anton")
    private String name;
    @Autowired
    private List<Student> students;

    public Teacher() {
    }

    //@Autowired
    public Teacher(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Teacher name = " + name + '\'' +
                " students = " + students;
    }

}
