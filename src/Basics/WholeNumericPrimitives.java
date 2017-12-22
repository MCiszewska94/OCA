package Basics;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        // W javie liczby całkowite są interpretowane jako integery, więc żeby stworzyć longa trzeba dopisać na końcu L
        // Żeby sobie życie ułatwić możemy używać _

        // TO SIĘ NIE SKOMPILUJE
       // long a  = _2343434235252L;
//        long a = 3432525252525252L_;
        long max = 3_241_234_252L;

        // octal (0-7)
        int oct = 07;
        int firstOct = 010; // 8 in decimal
        int secondOct = 022; // 18 in decimal

        int sumOct = firstOct + secondOct;
        System.out.println("first octal: " + Integer.toOctalString(firstOct));
        System.out.println("second octal: " + Integer.toOctalString(secondOct));
        System.out.println("sum octal: "+ Integer.toOctalString(sumOct));
        System.out.println();

        // hexadecimal (0 - 9) and A - F
        int firstHex = 0xF; //15 in decimal
        int secondHex = 0x1E; // 30 in decimal
        int sumHex = firstHex + secondHex;
        System.out.println("first hex: " + Integer.toHexString(firstHex) + " first decimal: " + firstHex);
        System.out.println("second hex: " + Integer.toHexString(secondHex)+ " second decimal: " + secondHex);
        System.out.println("sum hex: " + Integer.toHexString(sumHex) + " decimal sum: " + sumHex);
        System.out.println();

        // binary ( 0 or 1 )
        int firstBinary = 0b1001; // 9 decimal
        int secondBinary = 0b0111; // 7 decimal
        int sumBin = firstBinary + secondBinary;
        System.out.println("first binary: " + Integer.toBinaryString(firstBinary) + " first decimal: " + firstBinary);
        System.out.println("second binary: " + Integer.toBinaryString(secondBinary) + " second decimal: " + secondBinary);
        System.out.println("sum binary: " + Integer.toBinaryString(sumBin) + " sum decimal: " + sumBin);
    }
}
