package if_statement;
import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("What is your age?: ");
        age = sc.nextInt();

        System.out.print("ARe you student (true/ false): ");
        isStudent = sc.nextBoolean();




        //group 1
        if (name.isEmpty()) {
            System.out.print("You did not enter your name!");
        }else {
            System.out.println("Hello " + name);
        }






        // gruop 2
         if(age >= 65){
            System.out.println("You are an old man!");
        }else if(age >25 && age < 65){
             System.out.println("You are man!");
         }
        else if (age >= 18){
            System.out.println("You are an adult");
        }else if (age <0){
            System.out.println("You are not born yet");

        }else if (age ==0){
            System.out.println("You are a baby");
        }
        else {
            System.out.println("You are a child");
        }
        // group 3

        if (isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("You are not a student");
        }






        sc.close();
    }
}
