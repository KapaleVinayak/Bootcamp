package programsDayTwo;

import java.util.Random;
import java.util.Scanner;

class RandomArraySumNAvg{
    public static void main(String [] args){
        int Number;
        Random random = new Random();
        Number = random.nextInt(100);
        int sum = 0;
       for(int i = 0;i<= 75;i++)
       {
        
        sum = sum + Number;
        
       }
       double avg = sum / 75;
       System.out.println(sum);
       System.out.println(avg);
    }
      
}