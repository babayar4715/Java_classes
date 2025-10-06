package if_statement;

import java.util.Random;

public class random {
    public static void main(String[] args ) {
        Random random = new Random();

       /* int number;
        int number1;
        int number2;

        number = random.nextInt(1, 9);
        number1 = random.nextInt(1, 9);
        number2 = random.nextInt(1, 9);


        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

        */

        boolean isHeads = false;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }



    }
}
