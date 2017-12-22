package Basics;

public class UnderstandingNull {

    static Object myObject = new Object();
    static Object myOtherObject; // by default is null
    static String myString;

    public static void main(String[] args) {
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject: " + myObject); // address in memory
        System.out.println("myOtherObject: " + myOtherObject);
        System.out.println("myLocalObject: " + myLocalObject);
//        System.out.println("anotherLocalObject: " + anotherLocalObject); // does not compile
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("AnotherName: " + anotherName);


        myString = "JAVA";
        System.out.println("myString: " + myString);
        myString.toLowerCase();
        System.out.println("myString: " + myString);

    }
}
