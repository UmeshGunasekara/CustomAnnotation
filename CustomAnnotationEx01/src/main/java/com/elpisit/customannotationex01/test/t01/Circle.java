package com.elpisit.customannotationex01.test.t01;

import com.elpisit.customannotationex01.test.t04.Init;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class Circle implements Shape{
    private Point center;

    @Override
    @Init
    public void draw() {
        System.out.println("Circle");
        System.out.println("Center: ("+getCenter().getX()+","+getCenter().getY()+")");
    }

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void myInitializeCircle(){
        System.out.println("My Init of Circle");
    }

    @PreDestroy
    public void myDistroyCircle(){
        System.out.println("My Distroy of Circle");
    }
}
