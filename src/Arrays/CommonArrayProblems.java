package Arrays;

public class CommonArrayProblems {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // index range is from 0 to 4

        for (int i = 1; i < numbers.length; i++)
            System.out.println(i + " - " + numbers[i]);
        System.out.println();

        for (int i = 1; i <= numbers.length - 1; i++) {
            System.out.println(i + " - " + numbers[i]); // IndexOutBoundException
        }
        System.out.println();

//        int[20] cale; // does not compile
        int[] nums = new int[20]; // size only at initialization

//        int size = numbers.length(); // does not compile because length is not a method

        int size = numbers.length;

//        numbers.length = 10; // does not compile because length is final variable




    }
}
