package UnderstandingStrings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringEquality {

    public static void main(String[] args) {
        // it checks in string pool if
        // there's string named John and
        // if it's not then creates a string and returns the reference
        String name = "John";
        // there is a string "John" in string pool so it returns the reference
        String anotherName = "John";
        // there is a string "John" in string pool so it returns the reference
        String john = "Jo" + "hn";
        // we create a NEW OBJECT so, we don't use string pool
        String newName = new String("John");


        // true because of string pool
        System.out.println("name == anotherName -> " + (name == anotherName));
        // true because of string pool
        System.out.println("name == john -> " + (name == john));
        // false because they are different objects
        System.out.println("name == newName -> " + (name == newName));
        System.out.println();

        // equals method
        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));
        System.out.println();

        System.out.println("name hashcode = " + System.identityHashCode(name));
        System.out.println("anotherName hashcode = " + System.identityHashCode(anotherName));
        System.out.println("john hashcode = " + System.identityHashCode(john));
        System.out.println("newName hashcode = " + System.identityHashCode(newName));
        System.out.println();


        String str1 = "abc";
        String str2 = "ab";
//        String str3 = "ab" + "c";
        String str3 = str2 + "c"; // different reference because concatenation is in runtime

        System.out.println("str1 hashcode = " + System.identityHashCode(str1));
        System.out.println("str2 hashcode = " + System.identityHashCode(str2));
        System.out.println("str3 hashcode = " + System.identityHashCode(str3));
        System.out.println();

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);


    }
}
