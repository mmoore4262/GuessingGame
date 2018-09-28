public class Objective_2 {

    public static boolean isItValid(int userChoice)
    {
        //see is input is valid
        if (userChoice==1 || userChoice==2 || userChoice==3 || userChoice==4)
        {
            return (true);
        }
        else
        {
            return (false);
        }
    }
    public static int generateRandomIntInitial(int userChoice)
    {
        if (userChoice==1)
        {
            return(5);
        }
        if (userChoice==2)
        {
            return(50);
        }
        if (userChoice==3)
        {
            return(500);
        }
        if (userChoice==4)
        {
            return(5000);
        }

    }
   /** public static int generateRandomInt(int userChoice)
    {
        if (userChoice==1)
        {
            return((int)(Math.random()*10));
        }
        if (userChoice==2)
        {
            return((int)(Math.random()*100));
        }
        if (userChoice==3)
        {
            return((int)(Math.random()*1000));
        }
        if (userChoice==4)
        {
            return((int)(Math.random()*10000));
        }

    }**/

}
