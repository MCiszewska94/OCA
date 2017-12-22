package BasicFlowControl;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
//        System.out.println("i = " + i); // does not compile
        System.out.println();

        int a;
        for (a = 0; a < 10; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("after for loop a = " + a);

        // infinite for loop ( endless )
//        for(;;){
//            System.out.println("Hello");
//        }

        int x = 0;
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println("y = " + y);
        }
        System.out.println("x = " + x);

        int d = 10;
//        for(int e = 0, d = 0; e < 10 || d < 10; e++, d-- ){} // does not compile because d is already declared
//        for( long z = 0, int d = 4; z < 10; z++; d++){} // does not compile because we want to use different types
        for (long z = 0; z < 10; z++) {
        }
        for (double xy = 0.0; xy < 10.5; xy += 0.5) {
        }


    }
}
