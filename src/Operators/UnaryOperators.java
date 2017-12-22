package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = +3;

        System.out.println("x = " + x);

        double y = -x;

        System.out.println("y = " + y);

        boolean a = true;
        boolean b = !a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // increment and decrement have higher order than (+,-,*,/,...)
        int myInt = 5;
        int otherInt = ++myInt;
        System.out.println("myInt = " + myInt + " otherInt = " + otherInt);

        int newInt = 5;
        int newOtherInt = newInt++; // newInt = 6 , newOtherInt = 5
        System.out.println("newInt = " + newInt + " newOtherInt = " + newOtherInt);

        int count = 0;
        System.out.println(count);
        System.out.println(++count);// 1
        System.out.println(count);// 1
        System.out.println(count--);// 1 but set count to 0
        System.out.println(count);// 0


        int e = 3;
        int f = ++e * 5 / e-- + --e; // 4 * 5 / 4 + 2
        System.out.println("e = " + e + " f = " + f); // e = 2 f = 7

        int g = 6;
        int h = 2;
        int i = ++ h + --g * 3 + 2 * g++  - h-- % --g;
        // 3 + 5 * 3 + 2 * g++ - h-- % -- g -> g = 5 , h = 3
        // 3 + 15 + 2 * 5 - h-- % -- g  -> g = 6, h = 3
        // 3 + 15 + 10 - 3 % 5  -> g = 5, h = 2
        // 25
        System.out.println("g = " + g + " h = " + h + " i = " + i);

    }
}
