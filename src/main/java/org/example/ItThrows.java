package org.example;

public class ItThrows  {
    public static void throwMyException() throws MyException{
        throw new MyException("It throws MyException");
    }

    public static void throwRunTimeException() {
        throw new RuntimeException("It throws RunTimException");
    }
}
