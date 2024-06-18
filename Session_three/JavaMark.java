public class JavaMark {
    public static void main(String[] args) {
        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");

        // if you have enough money
        if (wallet >= toyCar) {
            // print: Sure!
            System.out.println("Sure! $" + toyCar);
            // pay for the toy car
            wallet -= toyCar;
        } else {
            // else: Sorry, I only have <wallet> left.
            System.out.println("Sorry I only have " + wallet + " left!");
        }

        double nike = 95.99; // run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        // if you have enough money
        if (wallet >= nike) {
            // print: Sure!
            // pay for the nike shoes
            System.out.println("Sure! $" + (wallet - nike));
        }
        // else: Sorry, I only have <wallet> left.

        else

        {
            System.out.println("Sorry I only have $" + wallet + " left!");
            System.out.println("If I could get $"+(nike - wallet)+ " more!");
        }
    }
}