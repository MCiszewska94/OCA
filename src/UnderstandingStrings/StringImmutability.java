package UnderstandingStrings;

public class StringImmutability {

    public static void main(String[] args) {
        // string is immutable - it means if we create a new string we can't change it
        String hello = "hello";
        String hi = hello + "world"; // hi = helloworld
        hi  = hello; // hi = hello

        System.out.println(hi + hello); // hellohello
        System.out.println();

        hello.toUpperCase();
        System.out.println(hello); // returns hello in lower case because of immutability
        System.out.println();


        hello = hello.toUpperCase();
        System.out.println(hello); // returns HELLO
        System.out.println();

        // concat
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println();



    }
}
