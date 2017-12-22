package Arrays;

public class ContinueStatement {

    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for (String animal : animals)
            System.out.println(animal);
        System.out.println();

        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Cat"))
                continue MY_LOOP;
            System.out.println(animal);
        }
        System.out.println();

        animal:
        for (String animal : animals) {
            if (animal.equals("Cat"))
                continue animal;
            System.out.println(animal);
        }
        System.out.println();


        for (String animal : animals) {
            if (animal.equals("Lizard") || animal.equals("Cat"))
                continue;
            System.out.println(animal);
        }
        System.out.println();

        int index = 0;
        while (index < animals.length) {
            String animall = animals[index];
            index++;
            if (animall.equals("Bird"))
                continue;
            System.out.println(animall);
        }






    }
}
