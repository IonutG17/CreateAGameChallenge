import java.util.Random;
import java.util.Scanner;

public class CreateAGameChallenge {

    public static void main(String[] args) {

        boolean numberGuessed = false;

        System.out.println("Hello gamer, welcome to the Guessing game");

        System.out.println("Let's start, please write your name bellow:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Are you ready to start the game?! y/n");

        String answerYes = "y";
        String answerNo = "n";
        String answerUser01 = scanner.next();
        if (answerUser01.equals(answerYes)) {

            Random random = new Random();
            int myRandomNumber = random.nextInt(30) + 1;
            System.out.println("Yey!");
            System.out.println("Okay then, you have 5 chances to guess the number I am thinking of (between 1 and 30)");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Chance number " + i + " :");
                int userNumber = scanner.nextInt();

                if (myRandomNumber == userNumber) {
                    System.out.println("Wow, you got it on your " + i + " try. Congrats!!");
                    numberGuessed = true;
                    break;
                } else if (myRandomNumber > userNumber && i != 5) {
                    System.out.println("Go higher!");
                } else if (myRandomNumber < userNumber && i != 5) {
                    System.out.println("Go lower!");
                }
            }

            //Default message
            if (!numberGuessed) {
                System.out.println("Sorry bud, maybe more luck next time.");
                System.out.println("The number was: " + myRandomNumber);
            }

        } else if (answerUser01.equals(answerNo)) {
            System.out.println("Hmpff ..ok :( ");
        } else {
            System.out.println("Why you write gibberish?! /:)");
        }
    }
}
