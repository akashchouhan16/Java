import java.util.Scanner;
import java.util.Random;

/*
     Create a Number Guessing game in Java, which allows a user to guess.
     Game should have the follow methods : 
     a) Constructor to generate a random number
     b) takeUserInput() to take user input.
     c) isCorrectNumber() to detect whether the Guess is correct.
     d) Getter and Setter methods for no of guesses.
     Use Properties : 
     noOfGuesses(int), etc to get this task done.

    //  Additional Additions apart from the Ques : 
        1. Added static init block, also utilised Random object from java.util.
        2. Added Difficulty choice.

*/
class Game {
    protected int Guess;
    static protected int guessLimit = 5;
    protected int randomNum; // Randomly Generated Number.
    static Random random = new Random();
    static int difficulty;
    {
        difficulty = 1;
    } // Default Level

    static Scanner Gamesc = new Scanner(System.in);

    Game(int x) {
        this.Guess = 0;
        this.randomNum = 0;
        guessLimit = 0;
    }

    Game() {
        // this(156);
        String choice;
        System.out.println("Do you want to Update the Guess Limit? ");
        choice = Gamesc.next();
        if (choice == "yes") {
            int updateCode = Math.abs(random.nextInt()) % 999;
            guessLimit = updateGuessLimit(updateCode);
        }
        System.out.println("Choose the Difficulty Level : ");
        this.difficulty = Gamesc.nextInt();
        if (difficulty == 1) {
            this.randomNum = Math.abs(random.nextInt()) % 10; // Easy.
        } else if (difficulty == 2) {
            this.randomNum = Math.abs(random.nextInt()) % 50; // Hard.
        } else
            this.randomNum = Math.abs(random.nextInt()) % 20; // Intermediate.
        System.out.println("Random Number Generated : " + this.randomNum);
    }

    void takeUserInput() {
        System.out.println("Enter Your Guess : ");
        this.Guess = Gamesc.nextInt();
        if (this.Guess < 0 || ((this.difficulty == 1) ? this.Guess > 10 : this.Guess > 50)) {
            System.out.println("Invalid Guess! :/");
            System.exit(1); // Error occured, Code Terminated.
        }
        return;
    }

    public boolean isCorrectNumber() {
        while (guessLimit != 0) {
            guessLimit--;
            System.out.println("No of Guesses Left (" + guessLimit + ")");
            takeUserInput();

            if (this.Guess == this.randomNum) {
                System.out.println("Congratulations!! You have Guessed the Number! :)");
                return true;
            } else if (this.Guess > this.randomNum) {
                if (guessLimit != 0)
                    System.out.println("You were Close, pick a smaller Number!");
                else
                    System.out.println("You were quite close! Thanks for playing.");
            } else if (this.Guess < this.randomNum) {

                if (guessLimit != 0)
                    System.out.println("You were very Close, pick a larger Number!");
                else
                    System.out.println("You were quite close! Thanks for playing.");
            }
        }
        return false; // game Over.
    }

    int updateGuessLimit(int reference) {
        System.out.println("[" + reference + "]Enter the New Guess Limit : ");
        int Limit = Gamesc.nextInt();
        System.out.println("GuessLimit Updated!");
        return Limit;
    }
};

public class GuessWho {
    public static void main(String args[]) {
        Game object = new Game();

        boolean check = object.isCorrectNumber();
        if (check == false) {
            System.out.println("Game Over!");
        }
    }
}