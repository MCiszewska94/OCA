package UnderstandingStrings;

public class StringBuilderMethods {

    public static void main(String[] args) {
        // charAt, indexOf, length, substring

        // 0 1 2 3 4 5 6 7 8 9 10
        // p r o g r a m m i n g
        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi")); // gram
        int len = sb.length(); // 11
        char ch = sb.charAt(5); // a
        System.out.println(sub + ", " + len + ", " + ch);
        System.out.println();

        // append - adds parameter to the string builder and returns reference to current string builder
        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("-").append(true);
        System.out.println(b);
        System.out.println();

        // insert - appends or inserts character at specific index and returns reference to current string builder
        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "-"); // program-ming
        builder.insert(2, 2); // pr2ogram-ming
        System.out.println(builder); // pr2ogram-ming
        System.out.println();

        // delete, deleteCharAt
        // 0 1 2 3 4 5 6 7 8 9 10 11 12
        // p r 2 o g r a m - m  i  n  g
        builder.delete(4, 9);
        System.out.println(builder); // pr2oming
        builder.deleteCharAt(2);
        System.out.println(builder); // proming

//        builder.delete(2,1); // StringIndexOutOfBoundsException
        builder.delete(1, 1); // does not change anything
        System.out.println(builder);
        System.out.println();

        // reverse , toString
        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);


        String myString = sb1.toString();
        myString = myString.toLowerCase();
        System.out.println(myString);

        

    }
}
