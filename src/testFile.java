

import java.util.Scanner;

import static GuessingGame.Objective_1.userGuess;


public class testFile
{
    public static void main(String[] args)
    {
        System.out.println("Give me your number");
        Scanner input=new Scanner(System.in);
        int guessDeUser=input.nextInt();
        input.close();
        userGuess(guessDeUser);

    }
}
