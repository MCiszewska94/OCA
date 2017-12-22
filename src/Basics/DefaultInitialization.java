package Basics;

public class DefaultInitialization {
    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {
        int localInt;
//        System.out.println(localInt); // does not compile
        System.out.println("boolean: " + myBoolean);
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);

        Person person = new Person();
        System.out.println("Person first name: "+ person.getFirstName());
        System.out.println("Person last name: " + person.getLastName());
        System.out.println("Person age: " + person.getAge());

    }
}
