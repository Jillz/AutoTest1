package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups ="server")
    public void test1(){
        System.out.println("服务端运行方法test1");
    }
    @Test(groups ="server")
    public void test2(){
        System.out.println("服务端运行方法test2");
    }
    @Test(groups ="client")
    public void test3(){
        System.out.println("客户端运行方法test3");
    }
    @Test(groups ="client")
    public void test4(){
        System.out.println("客户端运行方法test4");
    }
    @BeforeGroups("server")
    public void test5(){
        System.out.println("服务端运行前方法test5");
    }
    @AfterGroups("server")
    public void test6(){
        System.out.println("服务端运行后方法test6");
    }


}
