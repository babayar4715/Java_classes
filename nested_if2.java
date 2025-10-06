package if_statement;

public class nested_if2 {
    public static void main(String[] args) {
        boolean kingPin = false;
        boolean wheelSeal = true;
        double price = 1700.0;
        double priceSeal = 500;

        if(kingPin){
             if (wheelSeal){
                 System.out.printf("You price with king pin and seal is: $%.2f", price);
                 price= price + priceSeal;
             }else {
                 System.out.printf("You price with king pin is: $%.2f", price);
                 price *= 1;
             }
        }else {
            if (wheelSeal){
                System.out.printf("You price only Wheel Seal is: $%.2f", priceSeal);
                priceSeal *=1;

            }else{
                System.out.println("Thank you for coming");
            }
            System.out.println("You total price is: $"+price+ priceSeal);

        }

    }
}
