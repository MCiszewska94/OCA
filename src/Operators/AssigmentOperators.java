package Operators;

public class AssigmentOperators {

    public static void main(String[] args) {
//        int x = 1.0; // does not compile
//        short y = 1234545; // does not compile
//        int z = 9f; // does not compile
//        long d= 1234345546565; // does not compile
        int x = (int) 1.0;
        short y = (short) 1234565653; // overflow
        int z = (int) 9f;
        long t = 123445657676343L;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);
        System.out.println();

        // overflow and underflow with byte ( -128, 127)
        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);
        System.out.println();

//        myByte = (byte) (myByte + 1);
        myByte++; // goes to smallest value of byte
        mySecondByte--; // goes to the biggest value of byte
        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);
        System.out.println();

        short a = 10;
        short b = 20;
//        short c = a * b; // does not compile because java automatically convert a * b to int
        short c = (short) (a * b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
