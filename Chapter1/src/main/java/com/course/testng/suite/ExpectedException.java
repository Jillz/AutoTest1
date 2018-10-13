package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExpectedException {
   // @Test(expectedExceptions =RuntimeException.class)
    public void test1(){
        System.out.println("这是异常测试test1");
    }
    @Test(expectedExceptions =RuntimeException.class)
    public void test2(){
        System.out.println("这是异常测试test2");
        throw new RuntimeException();
    }
}
