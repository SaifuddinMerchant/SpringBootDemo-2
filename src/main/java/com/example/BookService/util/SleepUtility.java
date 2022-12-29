package com.example.BookService.util;

import java.util.concurrent.TimeUnit;

public class SleepUtility {

    public static void sleep(int timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {

        }
    }

}
