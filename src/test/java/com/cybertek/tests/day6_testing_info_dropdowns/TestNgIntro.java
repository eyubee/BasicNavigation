package com.cybertek.tests.day6_testing_info_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgIntro {
    @BeforeClass
    public void setUpClass(){
        System.out.println("----> Before class is running ");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("----> After class is running ");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("----> Before method is running.....");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> After method is running....");
    }
    @Test (priority = 1)
    public void test1() {
        System.out.println("running test1...");
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        System.out.println("running test2...");
        String actual = "apple";
        String expected = "apples";
        Assert.assertTrue(actual.equals(expected));
    }
}