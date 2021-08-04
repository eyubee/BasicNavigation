package com.utilities;

public class BrowserUtils {
    /** method that will accept int
     * wait for giving seconds or duration*/
    public static void sleep(int seconds)  {
        seconds *=1000;
        //1 sec = 1000 milli seconds
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("something happened in sleep method");
        }

    }
}
