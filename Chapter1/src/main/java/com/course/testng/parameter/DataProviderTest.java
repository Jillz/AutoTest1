package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.rmi.Naming;

public class DataProviderTest {
    @Test(dataProvider="data")
    public void TestDataProvider(String name,int age){
        System.out.println("name:"+name+"+age:"+age);
    }
    @DataProvider(name="data")
    public Object[][] providedata(){
        Object[][] o= new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
}
