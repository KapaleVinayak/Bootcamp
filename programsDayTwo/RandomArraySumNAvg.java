package programsDayTwo;

import java.util.Random;
import java.util.Scanner;

class GuessingTheNumber{
    public static void main(String [] args){
        int answer , guess;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        answer = random.nextInt(100)+ 1;
        System.out.println("Enter the Number Between 1 to 100");
        guess = sc.nextInt();
       
        if(guess > answer)
        {
            System.out.println("Too High");
        }
        else if(guess < answer)
        {
            System.out.println("Too Low");
        }
        else
        {
            System.out.println("Correct");
        }
        }
    }
