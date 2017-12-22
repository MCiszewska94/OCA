package Basics;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {
        // by default when we have decimal number Java assumes it's double !!!!
        // when we want float number we have to add f at the end of the number !!!
        float myNumber = 25.4f;

//        double before = 10_.25; // does not compile
//        double after = 10._25; // does not compile
//        double first = _10 .25; // does not compile
//        double first = 10.25_; // does not compile

        double myDouble = 2.54;

        // float number is automatically converted to float
        double myDouble2 = 2.54f;


        double other = 2.54d; // d represents this number is double. It is optional

        double scientific1 = 5.000125E3;
        double scientific = 5.000125E03; // scientific is the same as myDouble3
        double myDouble3 = 5000.125;
        System.out.println(scientific1);
        System.out.println(scientific);
        System.out.println(myDouble3);
        System.out.println();

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number
        System.out.println("hexPi: " + hexPi);

    }
}
