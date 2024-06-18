public class Points {
    public static void main(String[] args) {
        int point = 0;
        System.out.println();
        System.out.println("Harry was caught wandering the halls. -50 point for Gryffindor");
        System.out.println();

        point -= 50;
        System.out.println("Harry was being cheeky in class. -3 point for Gryffindor");
        System.out.println();
        point -= 3;
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 point for Gryffindor");
        System.out.println();
        point += 30;
        System.out.println("Ron won the underground chess game. 100 point for Gryffindor");
        System.out.println();
        point += 100;
        System.out.println("Harry defeated Quirrell. 60 point for Gryffindor");
        System.out.println();
        point += 60;
        System.out.println(point);
    }
}
