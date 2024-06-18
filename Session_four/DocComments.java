public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * function name:  greet
     * 
     * inside the function
     * 1.print hi
     */
    public static void greet(){
        System.err.println("Hi");
    }
    /**
     * Function name: printText
     * @param name (String)
     * @param age (String)
     * 
     * inside the function
     * 1.this function print the name and the age
     */
    public static void printText(String name, String age){
        System.out.println("Hi, I am " + name+ " and I am " + age + " year old");

    }
    /**
     * 
     * function name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return      (double)
     * 
     * inside the fuction
     * 1.it returns the area of a rectangle
     */
    public static double calculateArea(double length, double width) {
        double area =length * width;
        return area;
        
    }
}
