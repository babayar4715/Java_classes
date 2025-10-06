package if_statement;
import java.util.Scanner;

public class math_class {
    public static void main(String[] args) {
        //System.out.println(Math.PI);
        //System.out.println(Math.E);
        /*
        double result;

        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9); // square root
        result = Math.round(3.14); // rounds numbers
        result = Math.ceil(3.14); // ceiling numbers like 3.14 = 4
        result = Math.floor(3.99); // floor is like opposite of ceil 3.99 = 3
        result = Math.max(10, 20); // this is determines which numbers of there is the biggest
        result = Math.min(10, 20); // But this is oppsite of above that it will determine the minimum number



        System.out.println(result);

         */
        // Hypotenuse c = Math.sqrt(a^2 + b^2 )

        /* Scanner scanner =new Scanner(System.in);

        double a ;
        double b ;
        double c ;

        System.out.print("Enter the length of side A: ");
        a=scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b=scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is: "+c +" cm" );


        System.out.println(a);
        System.out.println(b);








        scanner.close();*/

        // curcumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 /3.0) * Math.PI * Math.pow(radius, 3)

        Scanner sc = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();


        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0)*Math.PI * Math.pow(radius , 3);



        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);






        sc.close();


    }
}
