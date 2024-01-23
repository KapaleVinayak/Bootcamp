package com.DayOnePractise;

import java.util.Scanner;

public class RandomOperatorMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a  , b;
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers between 1 to 10 only");
        
         a = sc.nextInt();
         b = sc.nextInt();
          
        
        if(a >= 1 && b <= 10)
        {
        	
        	 System.out.println("Enter the  Number of Operation from 1 to 4");
             ch = sc.nextInt();
			switch(ch) {
        	case 1: ch = a + b;
        		System.out.println("1.Addition is :" + ch);
        		break;
        	case 2: ch = a - b;
    		    System.out.println("2.Subtraction is :" + ch);
    		    break;
        	case 3: ch = a / b;
    		    System.out.println("3.Division is :" + ch);
    		    break;
        	case 4: ch = a * b;
    		    System.out.println("4.Multiplication is :" + ch);
    		    break;
           default :
        	   System.out.println("Invalid Input");
        		
        	}
        }
			else
			{
				System.out.println("Please Enter the Numbers from 1 to 10");
			
        }
	}

}
