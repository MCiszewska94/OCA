package Operators;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        int x = 2;
        int z = 3;
//        x = x * z; // simple assignment
        x *= z;
        System.out.println("x = " + x + " z = " + z);
//        int a += 5; // does not compile

        // without explicit cast
        long a = 10;
        int b = 4;
//        b = b * a; // does not compile
        b *= a;
        System.out.println("a = " + a + " b = " + b);

        long c = 4;
        long d = (c = 2);
        System.out.println("c = " + c + " d = " + d);

        long e = 3;
        long f = 2;
        long h = 1;
        long i = e + 3 * (f = 3) - (h += 2);
        System.out.println("e = " + e); // 3
        System.out.println("f = " + f); // 3
        System.out.println("h = " + h); // 3
        System.out.println("i = " + i); // 9
    }
}
