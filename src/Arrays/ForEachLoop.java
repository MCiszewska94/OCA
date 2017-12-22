package Arrays;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};

        for (String name : names) {
            System.out.println("name = " + name);
        }
        System.out.println();

        for (String name : names) {
            name = name + " " + name;
        }
        System.out.println();

        for (String name : names)
            System.out.println(name);
        System.out.println();

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        for(StringBuilder builder : builders)
            System.out.println(builder);
        System.out.println();

        for(StringBuilder builder : builders){
            builder.append("123");
        }

        System.out.println(Arrays.toString(builders));

        String pets = "Parrot";

//        for(String pet : pets){} // does not compile
//        for(int name : names) { } // does not compile

        for(char c : pets.toCharArray())
            System.out.println(c);




    }
}
