package UnderstandingStrings;

public class StringBuilderExamples {

    public static void main(String[] args) {
        String myString = "";
        for(char c = 'a'; c <= 'z'; c++){
            myString += c; // every iteration this will create a new string object
        }
        System.out.println(myString);
        System.out.println();


        // with StringBuilder
        StringBuilder sb = new StringBuilder(); // new instance of StringBuilder object
        for(char c = 'a'; c <= 'z'; c++){
            sb.append(c); // ad c to StringBuilder, reuses string builder without creating string each time
        }
        System.out.println(sb);
        System.out.println();

        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); // "start-middle"
        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println(builder);
        System.out.println(anotherBuilder);
        System.out.println();

        System.out.println("builder == anotherBuilder : " + (builder == anotherBuilder));
        System.out.println("builder hashcode : " + System.identityHashCode(builder));
        System.out.println("anotherBuilder hashcode : " + System.identityHashCode(anotherBuilder));
        System.out.println();

        // StringBuilder has size and capacity.
        // Size is number of characters currently in the sequence
        // Capacity is number of characters which stringBuilder currently can hold.
        // By default capacity is 16 but Java will automatically increase capacity if needed.

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());
        System.out.println();

        myBuilder = new StringBuilder(100);
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());
        System.out.println();

        myBuilder.append("MyNewText");
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());
        System.out.println();


        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("cool");
        System.out.println("a = " + a); // the same content as b
        System.out.println("b = " + b);


    }


}
