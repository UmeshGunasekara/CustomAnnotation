package com.elpisit.customannotationex01.test.t03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Colors{
    Color[] value();
}
