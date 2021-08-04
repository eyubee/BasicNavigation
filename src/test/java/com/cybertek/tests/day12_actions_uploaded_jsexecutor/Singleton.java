package com.cybertek.tests.day12_actions_uploaded_jsexecutor;
/**we will create similar logic we careted in driver utility class but it will be for a string */

public class Singleton {
    //create private constructor
    private Singleton(){
        //by making the string private, we will ensure we create access only through our getter method

    }
    private static String word;
    //allow users to have access to the word in the way we want them to have
    public static String getWord(){
        if(word==null){
            System.out.println("First time call.word object is null + assigning value ");
            word= "something";
        }else {
            System.out.println("word already have a value ");
        }
        return word;
    }
}
