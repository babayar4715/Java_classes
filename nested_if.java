package if_statement;

public class nested_if {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a stundent discount of 10%");
                price *= 0.7;

            }else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;

            }
        }else {
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
        }
        System.out.printf("Your price of ticket is: $%.2f", price);
    }
}
