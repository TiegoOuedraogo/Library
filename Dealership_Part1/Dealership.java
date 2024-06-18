import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java DealerShip");
        // option plus 8 for the dot
        System.out.println(" • Select option 'a' to buy a car");
        System.out.println(" • Select option 'b' to sell a car");

        String option = scan.nextLine();

        switch (option) {
        case "a":
            System.out.println("What is your budget?");
            int budget = scan.nextInt();
            if (budget >= 10000) {
                // System.out.println("The Nissan Altima is availabe");
                System.out.println("\n\tDo you have insurance? Wriet 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\n\tDo you have a driver livense Wriet 'yes' or 'no'");
                String driverLicense = scan.nextLine();
                System.out.println("\n\tWhat's your credit score?");
                int creditScore = scan.nextInt();

                if (insurance.equals("yes") && driverLicense.equals("yes") && creditScore >= 660) {
                    System.out.println("\tSold! Pleasure doing business with you");
                } else {
                    System.out.println("We sorry you are not eligible");
                }

            } else {
                System.out.println("Sorry! we don't sell cars less than $10000");
            }
            break;
        case "b":
            System.out.println("\n\tWhat is your car value at?");
            int value = scan.nextInt();
            System.out.println("\n\tWhat is your selling price?");
            int price = scan.nextInt();
            if (value > price && price < 30000) {
                System.out.println("\n\tWe will buy your car. pleasure doing business with you");
            } else {
                System.out.println("\n\twe are not interested!");
            }
            break;
        default:
            System.out.println("Invalid option");
        }
        scan.close();
    }
}