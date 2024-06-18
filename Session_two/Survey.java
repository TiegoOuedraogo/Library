
//import the Scanner package
/* nextLine() to scan for a String value
   nextInt() to scan for a int value
   nextDouble() to scan for a double value
*/
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        /*
         make the Scanner aviable to be use type of variable = Scanner variable name =
          scan new Scanner(system.in) = value
          scanner must be close at then end
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome: Than you for taking the survey");
        int counter = 0;
        System.out.println("\nWhat is your name? ");
        String name = scan.nextLine();
        counter++;
        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many time do you buy coffee? ");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many time do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;
        System.out.println("---------End of the Survey----------");
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " time than your coffee expenses");
        System.out.println("Weekly, you spend $" + (coffeeAmount*coffeePrice)+ " on coffee");
        System.out.println("Weekly, you spend $" + (foodAmount*foodPrice)+ " on food");
        scan.close();

    }

}