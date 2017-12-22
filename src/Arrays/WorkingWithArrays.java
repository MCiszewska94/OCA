package Arrays;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int[] one = new int[3]; // array with 3 elements - every element is 0
        int[] two = new int[]{10,11,12}; // array with 3 elements

//        double[] a = new double[2.55]; // does not compile because size must be int
        double[] b =  new double[4 * 5 / 2]; // 10 elements

        int x = 4;
        int y = 4;

        double[] c = new double[x * y]; // array with 16 elements
        int[] three = {10,11,12}; // anonymous array
        int[] four = {}; // size of array is 0

        int[] a1;
        int[] a2;
        int a3[];
        int[] ids,types; // creates two arrays
        int ids2[],types2; // ids2 is array and types2 is int BAD PRACTICE

        String[] animals = {"Parrot","Dog","Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot","Dog","Cat"};

        System.out.println(animals.equals(myAnimals)); // true
        System.out.println(animals == myAnimals); // true
        System.out.println(Arrays.equals(animals,myAnimals)); // true
        System.out.println(animals.equals(otherAnimals)); // false
        System.out.println(animals == otherAnimals); // false
        System.out.println(Arrays.equals(animals,otherAnimals)); // true
        System.out.println();

        System.out.println(animals); // prints memory location
        System.out.println(animals.toString()); // prints memory location
        System.out.println(Arrays.toString(animals)); // prints content of animals array



    }
}
