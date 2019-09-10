package com.elpisit.customannotationex01.test.t02;

import java.util.ArrayList;
import java.util.List;

public class Planting {
    public static <T> T[] unsafe(T... elements) {
        return elements; // unsafe! don't ever return a parameterized varargs array
    }

    public static <T> T[] broken(T seed) {
        T[] plant = unsafe(seed, seed, seed); // broken! This will be an Object[] no matter what T is
        return plant;
    }

    public static void plant() {
        String[] plants = (String[]) broken("seed"); // ClassCastException
        for (String s:plants) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        plant();
    }
}
