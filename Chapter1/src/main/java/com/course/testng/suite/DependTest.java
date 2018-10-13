package com.course.testng.suite;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("运行方法1");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("运行方法2");
    }


    }
