package GuessingGame;
public class Objective_1 {
    public static void userGuess(int guess)
    {
        int correct=10;
        if (correct==guess)
        {
            System.out.println("Your Guess "+correct+" was correct");
        }
        else
        {
            System.out.println("Try again. Your guess was not correct.");
        }
    }
}
