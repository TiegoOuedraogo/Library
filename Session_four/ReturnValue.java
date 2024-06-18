import javax.crypto.AEADBadTagException;

public class ReturnValue{
    public static void main(String[] args) {
        double rectMesure1= rectangle(-4.3, 2.2, "area");
        double rectMesure2= rectangle(3.2, 4.1, "perimeter");

        stringPrinter(4.3, 2.2 , rectMesure1, "area");
        stringPrinter(3.2, 4.1, rectMesure2, "perimeter"); 
    }
/**
 * function name: ReturnValue
 * 
 * @param length(double)
 * @param width(double)
 * @param option (String)
 * @return
 * 
 * inside the function
 * 1.it calculate the area and the perimeter of a rectangle
 * checks the the length or width is negative
 */
    public static double rectangle(double length, double width,String option){
        if(length < 0 || width < 0){
            System.out.println("The length "+length+ " and the width "+width+ " can not be negative");
            System.exit(0);
        }
        switch(option){
            case "area":
            return length * width;
            case "perimeter":
            return 2 * (length + width);
            default:
            return 404;
        }

    }
    public static void stringPrinter(double length, double width, double area, String option){
        /* System.out.println("The " + area +" of the rectangle with the
     length " + length +" and with the width "+ width +" is equal to : "+ area);
 */
System.out.println("The "+ option+ " of the rectangle with the length " +length+ " and the width " + width+ " is equal to :"+ area+"\n");
    }
}