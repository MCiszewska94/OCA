package UnderstandingStrings;

public class StringMethods {

    public static void main(String[] args) {
        String str = "java is fun";

        // length
        System.out.println("length = " + str.length());

        // charAt
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));
//        System.out.println(str.charAt(12)); // StringIndexOutOfBoundException

        // indexOf
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a',2));
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("fun",10)); // -1 : match not found

        // substring
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,5)); // from [0 - 4] index
        System.out.println(str.substring(4,4)); // empty string

//        System.out.println(str.substring(4,2)); // out of range : StringIndexOutOfBoundsException
//        System.out.println(str.substring(8,14)); // out of range : StringIndexOutOfBoundsException

        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
        dog.toUpperCase(); // does not change dog variable
        dog = dog.toUpperCase(); // not changes variable, but assign new value to dogi
        System.out.println(dog);

    }
}
