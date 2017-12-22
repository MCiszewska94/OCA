package BasicFlowControl;

public class DoWhileLoop {

    public static void main(String[] args) {
        int a = 0;
        do {
            a++;

        } while (false);

        System.out.println("a = " + a); // 1

//        while(false){ a++; } // does not compile
//        while(true){ a++;} // does not compile

        int x = 20;
        while (x > 10) x--;
        System.out.println("x = " + x); // 10

        int x2 = 20;

        do x2--;
        while (x2 > 10);

        System.out.println("x2 = " + x2); // 10

        int y = 10;
        int z = 5;

        while (y < 20)
            y++;
        // after loop y = 20
        z += 2; // z = 7
        y += 10; // y = 30

        System.out.println("y = " + y + " z = " + z);

        int number = 10;
        while (number > 10)
            number--;

        // endless loop
        do {
            number--;
            // 9
            while( number > 5){
                number -= 2;
                // 7
                // 5
            }
            // number = 5
        } while (number > 10);

        System.out.println("number = " + number);

    }
}
