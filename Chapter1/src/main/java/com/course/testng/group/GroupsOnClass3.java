package com.course.testng.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass3 {
    public void stu1(){
        System.out.println("运行grouponclass3中sut1方法");

    }
    public void stu2(){
        System.out.println("运行grouponclass3中sut2方法");

    }
}
