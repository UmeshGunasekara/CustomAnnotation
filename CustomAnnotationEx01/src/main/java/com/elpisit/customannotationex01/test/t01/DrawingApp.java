package com.elpisit.customannotationex01.test.t01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
//        Triangle triangle= new Triangle();
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring24.xml");
        applicationContext.registerShutdownHook();
        BeanFactory beanFactory=applicationContext;

//        Triangle triangle= (Triangle) beanFactory.getBean("triangle");
//        triangle.draw();
//        System.out.println(triangle);
        
        Shape shape= (Shape) beanFactory.getBean("circle");
        shape.draw();
        System.out.println(shape);
        
    }
}
