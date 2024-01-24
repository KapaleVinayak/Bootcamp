package programsDayTwo;

import java.util.Random;
import java.util.Scanner;

class GuessNumberCondition{
    public static void main(String [] args){
        Random random = new Random();
        int number = random.nextInt(100)+ 1;;
     Scanner sc = new Scanner(System.in);                          
 
     System.out.println("Guesss the number within 3 trials");
     
     int k = 3;
     int i, guess;
     for( i=0;i<k;i++)
     {
        System.out.println("Guess the number between 1 to 100");
        guess = sc.nextInt();
        if(guess == number)
        {
          System.out.println("You Guess Right Number SO you Win . Congratulations3");
          break;
        }
        else if(guess >number && i != k - 1)
        {
            System.out.println(" Lower Than :" + guess);
        }
        else if(guess <number && i != k - 1)
        {
            System.out.println(" Higher Than : " + guess);
        }
    }
    if(i == k)
    {
        System.out.println(
                "You have guess more than three times but you failed so Computer Wins");
 
            System.out.println(
                "The number was " + number);
    }
    }
}
    
