package org.example;

import java.util.Random;
import java.util.logging.Logger;

import static org.example.ItThrows.throwMyException;
import static org.example.ItThrows.throwRunTimeException;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    private static Logger logger = Logger.getLogger("Course 7 Lesson 1 Homework");
    /**
     * <h2>Tutorial application for Course Lesson1 Homework</h2>
     *
     */
    public static void main(String[] args) {
        long code = new Random().nextInt();

        try {
            if (code % 2 == 0) {
                throwMyException();
            } else {
                throwRunTimeException();
            }
        } catch (MyException | RuntimeException x) {
            logger.info(x.getMessage() + " Code=" + code);
        }

    }
}