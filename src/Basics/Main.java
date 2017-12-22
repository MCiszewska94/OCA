package Basics;

/**
 * javadoc
 * comment
 */
public class Main {
    /**
     * This is main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("args size: " + args.length);

        /*for(int i = 0; i < args.length; i++){
            System.out.println("args[" + "i" + "] = " + args[i]);
        }*/

        //ONE LINE COMMENT
        /*
        MULTI
        LINE
        COMMENT
         */

        System.out.println(sum(1,3));
    }

    /**
     * Calculates sum of two integers.
     *
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
