package Arrays;

import java.util.Arrays;

public class VariableArguments {

//    public static void main(String[] args) {}


    public static void main(String... args){
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        System.out.println();
        print(args);
        print("Java"); // don't need to pass array to this method, you can pass as many as you like arguments
        // they just need to be the same type !


        // it works because print method has String... argument
        // if we change String... args to String[] args it won't work!
        print("this","is","my","string","array");
        print(new String[]{"this","is","my","string","array"}); // don't need to create an array
        print("variable","arguments","are","nice","and","useful","feature");

    }

    private static void print(String... args){
        System.out.println(Arrays.toString(args));
    }
}
