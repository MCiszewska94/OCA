package Operators;

public class ObjectEquality {

    public static void main(String[] args) {
        // comparing objects
        Integer myInteger = 127;
        Integer myAnotherInteger = 127;

        System.out.println("myInteger == myAnotherInteger : " + ( myInteger == myAnotherInteger)); // true
        System.out.println("128 == 128 : " + (128 == 128)); // true
        System.out.println();

        System.out.println("myInteger hash = " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash = " + System.identityHashCode(myAnotherInteger));
        System.out.println();

        myInteger = 128;
        myAnotherInteger = 128;

        System.out.println("myInteger hash = " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash = " + System.identityHashCode(myAnotherInteger));
        System.out.println();

        System.out.println("myInteger = " + myInteger);
        System.out.println("myAnotherInteger = " + myAnotherInteger);
        System.out.println("myInteger == myAnotherInteger : " + (myInteger == myAnotherInteger)); // false
        System.out.println();
        Integer.valueOf(128);

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        // different memory adresses
        System.out.println("it1 == int2 : " + (int1 == int2)); // false
        System.out.println("it1 == int3 : " + (int1 == int3)); // false
        System.out.println("it2 == int3 : " + (int2 == int3)); // false
        System.out.println();

        // have the same values
        System.out.println("it1.equals(int2) : " + (int1.equals(int2))); // true
        System.out.println("it1.equals(int3) : " + (int1.equals(int3))); // true
        System.out.println("it2.equals(int3) : " + (int2.equals(int3))); // true
        System.out.println();


        System.out.println("int1 hash = " + System.identityHashCode(int1));
        System.out.println("int2 hash = " + System.identityHashCode(int2));
        System.out.println("int3 hash = " + System.identityHashCode(int3));
        System.out.println();


    }
}
