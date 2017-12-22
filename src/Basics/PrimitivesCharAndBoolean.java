package Basics;

public class PrimitivesCharAndBoolean {
    public static void main(String[] args) {
        char ch = 'a';
//        char ch1 = 'ab';// not compile too many characters in char literal
        char ch1 = '1';
        char uniChar = '\u03A9'; // upper case greek omega character
        char romanNumber = '\u216C'; // roman 50 number
        System.out.println(ch1);
        System.out.println(uniChar);
        System.out.println(romanNumber);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;
        System.out.println();
        System.out.println(myBoolean);
        System.out.println(myFalseBoolean);

//        boolean false = true; // does not compile

    }
}
