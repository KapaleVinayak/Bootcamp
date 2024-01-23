package com.DayOnePractise;

import java.util.Scanner;

public class SpeedConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double kilometer_per_hour ;
       double meters_per_second ;
       Scanner sc = new Scanner(System.in);
       System.out.println("Press 1 If u want to Convert Kilometer to Meter \n Press 2 If u want to Convert Meter to Kilometer");
       
       int ch = sc.nextInt();
       switch(ch) {
       case 1: 
    	   System.out.println("Enter the Kilometer");
    	   kilometer_per_hour = sc.nextDouble();
    	   meters_per_second = (kilometer_per_hour) * 1000 / 3600 ;
    	   System.out.println("Kilometer to Meter : "+meters_per_second);
    	   break;
       case 2: 
    	   System.out.println("Enter the Meters");
    	   meters_per_second = sc.nextDouble();
    	   kilometer_per_hour  = (meters_per_second) * 3600 / 1000 ;
    	   System.out.println("Meter to Kilometer  : " + kilometer_per_hour);
    	   break;   
    	   
       default:
    	   System.out.println("Invalid Input");
    	   break;
       }
       
	}
	

}
