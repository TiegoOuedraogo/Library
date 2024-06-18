public class BuiltInFunction {
    public static void main(String[] args) {
       double sine = Math.sin(2.4);
       double power = Math.pow(2 , 3);
       /* 
       return randon range 0 to 1
       to go beyond 1b multiply the return by the max you want
       */
       double rand = Math.random()*100;
       System.out.println(sine);
       System.out.println(power); 
       System.out.println(rand);
    }
}
