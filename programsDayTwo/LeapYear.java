package programsDayTwo;

import java.util.Scanner;

class LeapYear{
    public static void main(String []args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
         year = sc.nextInt();
         if(year >= 1582)
         {
        if((year % 400 == 0 )|| (year % 4 == 0) && (year % 100 != 0))
        {
            System.out.println("Its a Leap Year");
        }
        else
        {
            System.out.println("Its not Leap Year");
        }
    }
    else
    {
        System.out.println("Invalid Please Take year bigger than 1582");
    }
                 
        
    }
}