package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroupsExample {
    @BeforeGroups(value = {"smoke"})

    public void beforeGroups(){
        System.out.println("beforeGroups");
    }

    @AfterGroups(value = {"regression"})

    @Test(groups = "smoke")
    public void userCanLogin(){

    }

    @Test(groups = "smoke")
    public void userCanLogout(){

    }

    @Test(groups = "regression")
    public void navBarShouldBePresent(){

    }
    @Test(groups = "regression")
    public void test(){

    }
    @Test(groups = "regression")
    public void test2(){

    }


}
