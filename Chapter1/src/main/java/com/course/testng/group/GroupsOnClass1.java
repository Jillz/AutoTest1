package com.course.testng.group;

import org.testng.annotations.Test;

@Test(groups="teacher")
public class GroupsOnClass1 {

    public void teacher1(){
        System.out.println("运行grouponclass1中teacher1方法");

    }
    public void teacher2(){
        System.out.println("运行grouponclass1中teacher2方法");

    }
}
