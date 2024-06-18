import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your grade");
         double grade = scan.nextDouble();
         if(grade > 80){
             System.out.println("Great you got an A");
         }else if(grade >70){
            System.out.println("You got an B");

         }else if(grade > 60){
            System.out.println("You got an C");

         } else if(grade > 50){
            System.out.println("You got an D");

         } else{
            System.out.println("You got an F");
         }
        scan.close();
    }
}
