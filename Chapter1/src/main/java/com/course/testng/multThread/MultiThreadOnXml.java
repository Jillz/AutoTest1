package com.course.testng.multThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.print("Thread ID："+Thread.currentThread().getId());

    }
    @Test
    public void test2(){
        System.out.print("Thread ID："+Thread.currentThread().getId());

    }
    @Test
    public void test3(){
        System.out.print("Thread ID："+Thread.currentThread().getId());

    }
}
