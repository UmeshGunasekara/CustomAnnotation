package com.elpisit.customannotationex01.test.t03;

@Color(name = "red")
@Color(name="blue")
public class Shirt {
    public static void main(String[] args) {
        Shirt s=new Shirt();
        Color [] colA=Shirt.class.getAnnotationsByType(Color.class);
        for (Color c:colA) {
            System.out.println(c.name());
        }
    }
}
