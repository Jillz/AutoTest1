package com.course.testng;

import org.testng.annotations.Test;

public class TimeOut {

    @Test(timeOut = 3000)
    public void timeOuttest1() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 3000)
    public void timeOuttest2() throws InterruptedException {
        Thread.sleep(4000);
    }
}
