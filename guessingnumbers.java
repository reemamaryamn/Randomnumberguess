import java.util.Random;
import java.util.Scanner;
public class guessingnumbers{
    public static void main (String[] args){
        
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int target=random.nextInt(10);//0 to 10 integers only
        int attempts=0;//initiating attempts to 0

        for (; attempts<5; attempts++)
        {
        //while (true){
            System.out.println("Guess the random number: ");
            int usernum=input.nextInt();//takes in the user input
            //attempts++;

            if (target==usernum)
                {System.out.println("Yay!! you guessed it right!");
                break;}
            else if (target<usernum)
                {System.out.println("The number input is higher than the guess");}
            else 
                {System.out.println("The number input is lesser than the guess");}
        }
            
        if (attempts==5) {
            System.out.println("Sorry you have reached your maximum number of attempts:( ");}//prints this if the max number of attempts exceeded
        input.close();
    }
        

}

