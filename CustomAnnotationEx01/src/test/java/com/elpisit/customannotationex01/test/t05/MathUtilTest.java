package com.elpisit.customannotationex01.test.t05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MathUtilTest {

    @Test
    void test(){
//        fail("test");
        MathUtil mathUtil=new MathUtil();
        double expect=2;
        double actual=mathUtil.sum(5,2);
        assertEquals(expect,actual);

    }

}
