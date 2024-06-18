import java.util.Scanner;

public class DelimeterScan {
    public static void main(String[] args) {
        /*
         * Scan.nextLine() read the entire line it doesn't care about delimeters it
         * reads all the white spaces within each value
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers ( on the same line )");
        String number = scan.nextLine();

        System.out.println("Enter two very big integers ( on the same line )");
        String bigNumber = scan.nextLine();

        System.out.println("Enter two decimals ( on the same line )");
        String decimal = scan.nextLine();

        System.out.println("Enter two text values ( on the same line )");
        String text = scan.nextLine();

        scan.close();

        System.out.println("\tIntegers: " + number);
        System.out.println("\tLong: " + bigNumber);
        System.out.println("\tDecimal: " + decimal);
        System.out.println("\tString: " + text);

    }
}
