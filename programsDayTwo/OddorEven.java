package programsDayTwo;

import java.util.Scanner;

class OddorEven{
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("It is Even Number");
        }
        else
        {
            System.out.println("It is Odd Number");
        }
    }
}