package org.example;

import org.configuration.JavaBeanContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.university.Teacher;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Teacher xmlTeacher1 = context.getBean("teacher", Teacher.class);
        System.out.println(xmlTeacher1);

        ApplicationContext javaContext = new AnnotationConfigApplicationContext(JavaBeanContextConfiguration.class);
        Teacher javaTeacher1 = javaContext.getBean("teacher", Teacher.class);
        System.out.println(javaTeacher1);
    }
}