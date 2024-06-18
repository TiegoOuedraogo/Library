import java.util.Scanner;

public class DelimiterTrap {
    public static void main(String[] args) {
        /*
         Without the scan.nextLine being called before
         the use of the input it skip everything
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers");
        int number = scan.nextInt();

        scan.nextLine();
        System.out.println("Write a sentence");
        String sentence = scan.nextLine();

        System.out.println("\tYou enter: "+ number);
        System.out.println("\tHere is your sentence: "+ sentence);
        scan.close();

    }
}

