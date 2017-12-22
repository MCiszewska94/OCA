package Basics;

import java.util.Random;
// don't need to import this package
import java.lang.System;

public class ImportExample {
    public static void main(String[] args) {
        Random random = new Random();
        // java.lang - system is imported automatically
        System.out.println(random.nextInt(5));
    }
}
