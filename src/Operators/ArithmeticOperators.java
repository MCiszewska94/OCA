package Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int result = 3 - 2 + 2 * 2 + 3;
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3
        // 5 + 3
        System.out.println("result = " + result);
        result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 8 + 10
        // 3 - 8 + 10
        // -5 + 10
        // 5
        System.out.println("new result = " + result);
        int a = 4;
        int b = 3 - 2 * --a; // decrement then use
        // 3 - 2 *(3)
        // -3
        System.out.println("a = " + a); // 3
        System.out.println("b = " + b); // -3

        a = 4;
        b = 3 - 2 * a--; // use then decrement
        System.out.println("new a = " + a); // 3
        System.out.println("new b = " + b); // -5

        long c = 2;
        long d = 4 + 3 * c++; // use then increment
        System.out.println("c = " + c); // 3
        System.out.println("d = " + d); // 10

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        // 10 - 3 * 3 - 4 / 4
        // 10 - 9 - 1
        // 0
        System.out.println("new new result = " + result);

        int f = 12;
        int g = 5;
        int h = 2;
        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
        // 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
        // 6 - 3 - 2 * 2 - 2 * 3
        // 6 - 3 - 4 - 6
        // -7
        System.out.println("m = " + m);


    }
}
