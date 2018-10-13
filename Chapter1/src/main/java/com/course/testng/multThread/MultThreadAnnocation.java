package com.course.testng.multThread;

import org.testng.annotations.Test;

public class MultThreadAnnocation {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.print("Thread ID："+Thread.currentThread().getId());

    }
}
