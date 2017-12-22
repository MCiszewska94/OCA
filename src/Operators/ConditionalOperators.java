package Operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        boolean e = a || b; // true

        System.out.println("d = " + d + " e = " + e);

        int f = 4;
        boolean g = false && (f++ < 4); // (f ++ < 4) is never executed
        boolean h = (f-- == 4) && !g; // true and true
        System.out.println("g = " + g + " h = " + h);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4); // true && true || false
        // (myInt <= 3) - > true
        // (anotherInt-- == 4) -> true
        // (myInt++ == 4) is never executed

        System.out.println("myInt = " + myInt); // 3
        System.out.println("anotherInt = " + anotherInt); // 3
        System.out.println("myBoolean = " + myBoolean);

        boolean x = true, z = false;
        int y = 20;
        x = (y != 10) ^ (z = false);

        System.out.println(x + ", " + y + ", " + z);


    }
}
