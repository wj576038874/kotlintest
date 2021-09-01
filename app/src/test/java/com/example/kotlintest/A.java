package com.example.kotlintest;


/**
 * author: wenjie
 * date: 2021-08-03 15:49
 * descption:
 */
public class A {

    public static final A.Companion Companion = new A.Companion();


    public static String getString(int value) {
        return Companion.getValue(value);
    }

    public static final class Companion {

        public final String getValue(int value) {
            return String.valueOf(value);
        }

        private Companion() {
        }

    }
}
