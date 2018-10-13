package com.course.testng;

import org.testng.annotations.Test;

public class IngoreTest {
    @Test
    public void IngoreTest1(){
        System.out.println("ingore 1 运行");
    }
    @Test(enabled = false)
    public void IngoreTest2(){
        System.out.println("ingore 2运行");
    }
    @Test(enabled = true)
    public void IngoreTest3(){
        System.out.println("ingore 3运行");
    }
}
