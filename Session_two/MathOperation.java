public class MathOperation {
    public static void main(String[] args) {
        int bagOfSweet1 = 5;
        int bagOfSweet2 = 10;

        long starInMilkyWay = 2500000000L;
        long starInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks= 2.5;
        System.out.println("Fred and George collected " + (bagOfSweet1 + bagOfSweet2)+ " sweets");
        System.out.println("There are " + (starInMilkyWay + starInAndromeda) +  " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " +(testScore + bonusMarks)+ " /10 on his potions test. Snape wasn't too thrilled");

        System.out.println("Fred has " +  (bagOfSweet2 - bagOfSweet1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has "+ (starInAndromeda -starInMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored "+ (testScore - bonusMarks) + " on his potions test");

        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweet2*bagOfSweet1));
        //System.out.println("Fred and George used a special spell to multiply their sweets to:" + (starInAndromeda*starInMilkyWay));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to:" + (testScore*bonusMarks)/10);

        System.out.println("Originally, Fred had " + (bagOfSweet2/bagOfSweet1)+ " times more sweets than George ");
        System.out.println("Andromeda has " + (starInAndromeda/starInMilkyWay)+ " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: "+ (testScore/bonusMarks));


    }
    
}
