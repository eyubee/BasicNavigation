package com.cybertek.tests.day8_windows_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1(){
        Faker fake= new Faker();
        String fullName= fake.name().fullName();
        String address= fake.address().fullAddress();
        String backToTheFuture= fake.backToTheFuture().date();
 String friends= fake.friends().quote();
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(backToTheFuture);
        System.out.println(friends);
    }
}
