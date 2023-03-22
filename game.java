import java.util.Scanner;
import java.util.Random;
class game
{   private int number;
    private int inputNumber;
    private int noOfGuesses = 0;
    game()
    {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void inputNumber()
    {   System.out.println("Guess the number...");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrect()
    {   noOfGuesses++;
        if(inputNumber==number)
          System.out.format("You guessed it right...."+","+"Guessed number is %d\n"+"You guessed in %d attempts\n",number,noOfGuesses);
        else if(inputNumber<number)
          System.out.println("Your number is lower than the generated number");
        else
          System.out.println("your number is higher");
        return false;
    }  

    public static void main(String[] args)
    {
        game g = new game();
        boolean b = false;
        while(!b)
        {
            g.inputNumber(); 
            b = g.isCorrect(); 
        }
    }
}