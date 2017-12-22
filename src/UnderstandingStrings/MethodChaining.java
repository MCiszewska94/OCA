package UnderstandingStrings;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MethodChaining {

    public static void main(String[] args) {
        String start = "  Java  ";

        String trimmed = start.trim();
        System.out.println("trimmed = " + trimmed);

        String lowerCase = trimmed.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);

        String result = lowerCase.replace("j","J");
        System.out.println("result = " + result);

        String anotherResult = "  Java  ".trim().toLowerCase().replace("j","J");
        System.out.println("anotherResult = " + anotherResult);
        System.out.println(result.equals(anotherResult));
        System.out.println();

        String a = "abc";
        String b = a.toUpperCase(); // this produces new string, doesn't change a variable;
        String c = b.replace('B','b').replace('C','c'); // produces new string
        System.out.println(a + ", " + b + ", " + c); // abc, ABC, Abc

        if(a.equalsIgnoreCase(b))
            System.out.println("Strings are equal");
        if(a.toLowerCase().trim().equals(b.toLowerCase().trim()))
            System.out.println("Equal");


    }
}
