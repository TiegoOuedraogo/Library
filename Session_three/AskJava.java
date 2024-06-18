public class AskJava {
    public static void main(String[] args) {
        double change = 3.50;
        double price = 2.50;

        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change > price) + "\nOf course!");
        // comparison here
        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + ("<compare capacity and people>") + "\n");
        // comparison here
        if (capacity >= people) {
            System.out.println("Sure! The elevator can hold everyone.");
        } else {
            System.out.println("Sorry! The maximum capacity is: " + capacity);
        }
        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + "<compare request and purchase>" + "\n");
        // comparison here
        if (request != purchase) {
            System.out.println("Your friends will hate until you get them " + request);
        } else if (request == purchase) {
            System.out.println("Your friends will definitly be happy with you!");

        }
        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + "<compare space and guests>" + "\n");
        // comparison here
        if (space > guests) {
            System.out.println(
                    "Yes everyone can attend to your dinner party and we have " + (space - guests) + " more left");
        } else if (space == guests) {
            System.out.println(
                    "Yes everyone can attend to your dinner party we have the exact numbers of the guess " + guests);
        } else {
            System.out.println("Sorry we don't have enough space!");
        }
        int yourVotes = 24;
        int competitorVotes = 43;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + "<compare your votes and competitor>" + "\n");
        // comparison here
        if (yourVotes > competitorVotes) {
            System.out.println("Yes! you will win");
        } else
            System.out
                    .println("No! your competitorVotes has " + (competitorVotes - yourVotes) + " more votes than you!");
    }
}