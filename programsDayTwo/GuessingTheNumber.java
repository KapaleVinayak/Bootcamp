package programsDayTwo;

import java.util.Random;
import java.util.Scanner;

class RandomArrayGeneration{
     public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int numbers = 100 + random.nextInt(500);
     }
}