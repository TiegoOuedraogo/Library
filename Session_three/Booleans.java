public class Booleans{
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;

        double sales = 37.55;
        double cost = 5.55;

        int englishGrade = 75;

        String sentence = " I Love this corses!";
        String sentence1 = " I Love this corses!";


        System.out.println("\n" + (chemistryGrade < biologyGrade));
        System.out.println("\n"+ (chemistryGrade > biologyGrade));
        System.out.println("\n"+ (sales > cost));
        System.out.println("\n"+ (sales < cost));
        
        System.out.println("\n"+ (chemistryGrade == englishGrade));
        System.out.println("\n"+ (biologyGrade == englishGrade));

        System.out.println("\n"+ (chemistryGrade <= englishGrade));
        System.out.println("\n"+ (biologyGrade <= englishGrade));

        System.out.println("\n"+ (chemistryGrade >= englishGrade));
        System.out.println("\n"+ (biologyGrade >= englishGrade));

        System.out.println("\n"+ (chemistryGrade != englishGrade));
        System.out.println("\n"+ (biologyGrade != englishGrade));

        System.out.println("\n"+ (sentence.equals(sentence1)));
        System.out.println("\n"+ (!sentence.equals(sentence1)));


    }
}