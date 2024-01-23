package com.DayOnePractise;

import java.util.Scanner;

public class Weight_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int pound ;
         double weight_in_kg;
         System.out.println("Enter the Weight in Pounds");
         Scanner sc = new Scanner(System.in);
         pound = sc.nextInt();
         
         weight_in_kg = pound * 0.45359237;
         
         System.out.println("The weight in kg is : " +   weight_in_kg);
         
        
	}

}
