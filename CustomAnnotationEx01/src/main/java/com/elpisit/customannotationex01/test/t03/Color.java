package com.elpisit.customannotationex01.test.t03;

import java.lang.annotation.Repeatable;

@Repeatable(Colors.class)
public @interface Color {
    String name();
}


