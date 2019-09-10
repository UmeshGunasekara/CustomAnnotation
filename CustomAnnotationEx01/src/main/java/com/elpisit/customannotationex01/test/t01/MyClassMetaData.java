package com.elpisit.customannotationex01.test.t01;

import com.elpisit.customannotationex01.test.t04.Init;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassMetaData {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Point point=new Point();
        point.setX(10);
        point.setY(20);
        circle.setCenter(point);
        Class<Circle> circleClass= (Class<Circle>) circle.getClass();
//        System.out.println("Name of the class is: "+circleClass.getName());
//        System.out.println("Simple Name of the class is: "+circleClass.getSimpleName());
//        System.out.println("Canonical Name of the class is: "+circleClass.getCanonicalName());
//        System.out.println("Type Name of the class is: "+circleClass.getTypeName());
//        System.out.println("Super Class Canonical Name of the class is: "+circleClass.getSuperclass().getCanonicalName());

        for (Method method : circleClass.getDeclaredMethods()) {
            System.out.println(method.getName());
            System.out.println(method.isAccessible());
            System.out.println("@Override :"+method.isAnnotationPresent(Init.class));
            method.setAccessible(true);
            System.out.println(method.isAccessible());
            try {
                if(method.isAnnotationPresent(Init.class))
                method.invoke(circle);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            System.out.println("-------------------------------");
//            if (method.isAnnotationPresent(Init.class)) {
//                method.setAccessible(true);
//                method.invoke(object);
//            }
        }
    }
}
