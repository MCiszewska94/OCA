package Arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {5,10,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        String[] strings = {"50","9","500"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
