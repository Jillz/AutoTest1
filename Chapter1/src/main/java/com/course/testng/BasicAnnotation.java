package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
 //最基本的注解，用来把方法标记为测试的一部分

    @Test
    public void testCase1(){
        System.out.println("this is the first test case");

    }
    @Test
    public void testCase2(){
        System.out.println("this is the second test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforemethod:这是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("aftermethod:这是在测试方法之后运行的");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass:这是在类运行前调用的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterclass:这是在类运行后调用的");

    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit测试套件");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit测试套件");

    }
}
