
public class Objective_1 {
    public static int generateRandomInt()
    {
        return((int)(Math.random()*100));
    }

    public static boolean userGuess(int guess, int correctAnswer)
    {

        if (correctAnswer==guess)
        {
            return(true);
        }
        else
        {
           return(false);
        }
    }

}
