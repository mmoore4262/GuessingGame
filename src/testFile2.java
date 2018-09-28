import java.util.Scanner;



public class testFile2 {
    public static void main(String[] args)
    {
        //USer Input:
        /**First asks for range, determines if it's a valid input.
            option should store the input of range, which can later be used to guess within a range of ints
            Computer then guesses for the middle number in the range 1-10,1-100,1-1000,1-10000 (5,50,500,5000 repsectively
             User types in if their number is higher or lower. Should check if it's a valid input. Should create function
             with three parameters, an argument that indicates whether or not it's higher or lower than the guess, and whether it's testing against the upper oor lower range.**/

        System.out.println("Watch an AI guess a number!");
        System.out.println("Type 1 for numbers 1-10\n" + "Type 2 for numbers 1-100\n" + "Type 3 for numbers 1-1000\n" + "Type 4 for numbers 1-10000\n");
        boolean validIn=false;
        Scanner input=new Scanner (System.in);
        int option=input.nextInt();
        while( validIn==false)
        {
            if (Objective_2.isItValid(option))
            {
                validIn=true;

            }
            else
            {
                System.out.println("Invalid input, try again");
                option=input.nextInt();
                Objective_2.isItValid(option);
            }
        }
        validIn=false;
        System.out.println("Watch the magic happen.");
        int compGuess=Objective_2.generateRandomIntInitial(option);
        System.out.println("Is this your integer? y/n   "+ compGuess);

        String valid=input.next();
        while (validIn==false)
        {
            if (valid!="y" || valid!="n")
            {
                System.out.println("Invalid input, try again");
                validIn=true;
            }
        }
        if (valid=="y")
        {
            System.out.println("Sweet it took 1 guess");
            input
        }
        if (valid=="n")
        {
            System.out.println("Type 'h' if your number is higher, type 'l' if your number is lower.");
        }











    }
}
