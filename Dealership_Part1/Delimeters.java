import java.util.Scanner;

public class Delimeters {
    public static void main(String[] args) {
        /* //Delimeters separes users inputs 
        by default white space 
        scan.nextInt() skip the delimeter and read
        the next integer

        scan.nextLong() skip the delimeter and read
        the next Long

        scan.nextDouble() skip the delimeter and read
        the next Double

        scan.next skip the delimeter and read
        the next String value
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers ( on the same line )");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter two very big integers ( on the same line )");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();
        System.out.println("Enter two decimals ( on the same line )");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();
        System.out.println("Enter two text values ( on the same line )");
        String text1 = scan.next();
        String text2 = scan.next();
        scan.close();

        System.out.println("\tIntegers: "+ num1+ " "+ num2);
        System.out.println("\tLong: "+ bigNum1+ " "+ bigNum2);
        System.out.println("\tDecimal: "+ decimal1+ " "+ decimal2);
        System.out.println("\tString: "+ text1+ " "+ text2);


    }
}
