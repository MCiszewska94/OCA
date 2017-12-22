package Arrays;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class UsingArrays {

    public static void main(String[] args) {
        String[] pets = {"parrot", "cat", "dog"};

        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
        System.out.println();
//        System.out.println(pets[3]); // throws ArrayIndexOutOfBounds since we have only 3 elements

        pets[0] = "bird";

        for (int i = 0; i < pets.length; i++)
            System.out.println(pets[i]);
        System.out.println();

        // range of index [0-2], 0 - length - 1
        for (int i = 0; i <= pets.length - 1; i++)
            System.out.println(pets[i]);
        System.out.println();

        System.out.println(pets); // [L java.lang.String;@677327b6 -> [L represents array
        System.out.println();

        System.out.println(Arrays.toString(pets));
        System.out.println();

        int[] numbers = new int[5];

        System.out.println(Arrays.toString(numbers));
        System.out.println();

        String[] newPets = new String[5];
        System.out.println(Arrays.toString(newPets));
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        System.out.println();

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();


        // if we print nums it will be null
        Integer[] nums = new Integer[4];
        System.out.println(Arrays.toString(nums));
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 3;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println();



    }
}
