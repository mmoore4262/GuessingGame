

import java.util.Scanner;


public class testFile
{
    public static void main(String[] args)
    {
        int stor1= Objective_1.generateRandomInt();
        boolean gameIsInPlay=true;
        System.out.println(stor1);
        System.out.println("Guess an integer");
        Scanner input= new Scanner(System.in);
        int guess=input.nextInt();
        while (gameIsInPlay==true)
        {
            if (Objective_1.userGuess(guess,stor1)==true)
            {
                System.out.println("Your Guess "+guess+" is correct");
                input.close();
                gameIsInPlay=false;
            }
            else
            {
                System.out.println("Your Guess "+guess+" is incorrect");
                System.out.println("Try again");
                guess=input.nextInt();
            }
        }


    }
}
