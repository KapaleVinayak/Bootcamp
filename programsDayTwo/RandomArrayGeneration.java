import java.util.Random;
import java.util.Scanner;

class RandomArrayGeneration{
        public static void main(String []args) {
        
        Random random = new Random();
        int number = 100 + (int)(500 * Math.random());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size in the 3 attempt");
        int size = sc.nextInt();
        int k = 0;
        for(int i = 1;i<=size;i++)
        {
            while(k  == 2)
            if(size > 0  && i != k - 1)
            {
                System.out.println("Array is Created");
                break;
            }
            else if(size <= 10 && i != k - 1)
            {
                System.out.println("Rejected");
                break;
            }
           

        }

        }
    }