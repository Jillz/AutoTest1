package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite running");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuite running");

    }
}
