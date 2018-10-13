package com.course.testng.group;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("运行grouponclass2中sut1方法");

    }
    public void stu2(){
        System.out.println("运行grouponclass2中sut2方法");

    }
}
