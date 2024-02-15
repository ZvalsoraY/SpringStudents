package org.university;

import javax.annotation.PostConstruct;
import java.util.Map;

public class Student {
    private String name;
    private Map<Discipline, Integer> performance;
    private boolean enrolled;


    public Student() {
    }

    public Student(String name, Map<Discipline, Integer> performance) {
        this.name = name;
        this.performance = performance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrolled(boolean enrolledSelect) {
        enrolled = enrolledSelect;
    }

    public void setPerformance(Map<Discipline, Integer> performance) {
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public Map<Discipline, Integer> getPerformance() {
        return performance;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    @PostConstruct
    public void init() {
        int sumPerform = 0;
        for (int perform: performance.values()) {
            sumPerform += perform;
        }
        if (sumPerform/ performance.size() >= 3) {
            setEnrolled(true);
        }
    }
    @Override
    public String toString() {
        return "Student name = " + name + '\'' +
                ", performance = " + performance +
                ", isEnrolled = " + enrolled +
                '}';
    }

}