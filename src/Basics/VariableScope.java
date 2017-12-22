package Basics;

public class VariableScope {

    static int myNewInt = 5; // field or global variable

    public static void main(String[] args) {
        int myLocalInt = 10;

        {
            {
                int myOtherInt = 30;
                {
//                    int myOtherInt = 15; // does not compile
                }
            }
            int myOtherInt = 20;
            int anotherInt = 30;
            System.out.println("other int: " + myOtherInt);
            System.out.println("my local int: " + myLocalInt);
        }
//        System.out.println(myOtherInt); // does not compile
        System.out.println("my local int: " + myLocalInt);
        System.out.println("my new int: " + myNewInt);

        int myOtherInt = 30;
        int anotherInt = 40;
        System.out.println("My new other int: " + myOtherInt);
        System.out.println("Another int: " + anotherInt);
    }

    public static void myMethod(){
//        myLocalInt; // does not compile

    }
}
