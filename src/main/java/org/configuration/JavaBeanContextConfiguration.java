package org.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.university.Discipline;
import org.university.Student;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("org.university")
public class JavaBeanContextConfiguration {
    @Bean
    public Student student1() {
        Map<Discipline, Integer> grades = new HashMap<>();

        grades.put(Discipline.LANGUAGE, 5);
        grades.put(Discipline.MATHEMATICS, 5);
        grades.put(Discipline.PHYSICS, 5);

        return new Student("student1", grades);
    }

    @Bean
    public Student student2() {
        Map<Discipline, Integer> grades = new HashMap<>();

        grades.put(Discipline.LANGUAGE, 4);
        grades.put(Discipline.MATHEMATICS, 4);
        grades.put(Discipline.PHYSICS, 4);

        return new Student("student2", grades);
    }

    @Bean
    public Student student3() {
        Map<Discipline, Integer> grades = new HashMap<>();

        grades.put(Discipline.LANGUAGE, 2);
        grades.put(Discipline.MATHEMATICS, 2);
        grades.put(Discipline.PHYSICS, 2);

        return new Student("student3", grades);
    }

    @Bean
    public Student studentJil() {
        Map<Discipline, Integer> grades = new HashMap<>();

        grades.put(Discipline.LANGUAGE, 2);
        grades.put(Discipline.MATHEMATICS, 2);
        grades.put(Discipline.PHYSICS, 2);

        return new Student("Jil", grades);
    }
}