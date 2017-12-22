package UnderstandingStrings;

public class UnderstandingEquality {

    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println(one == two); // false
        System.out.println(one == three); // true
        System.out.println();

        String x = "Java";
        String y = "Java";

        System.out.println(x == y); // true
        System.out.println();

        String a = "Java";
        String b = " Java".trim(); // trim method returns new String

        System.out.println(a == b); // false
        System.out.println();

        String c = "Java";
        String d = "Ja".trim() + "va";
        System.out.println(c == d); // false



    }
}
