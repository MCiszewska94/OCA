package Operators;

public class NumericPromotion {

    public static void main(String[] args) {
        // promotion is converting smaller data type to bigger data type
        int x = 5;
        double y = 10.55;

        System.out.println("x + y = " + (x + y)); // x is auto promoted to double

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b + c + d;
        System.out.println("result= " + result);

        // casting is converting "bigger" type to "smaller" type
        double myDouble = 5.55;
        int myInt = 4 + (int) myDouble;
        System.out.println("myInt = " + myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int resultInt = anotherInt + myByte;
//        byte byteResult = anotherInt + myByte; // does not compile
        byte byteResult = (byte) (anotherInt + myByte); // overflow
        System.out.println("resultInt: " + resultInt);
        System.out.println("byteResult: " + byteResult);



    }
}
