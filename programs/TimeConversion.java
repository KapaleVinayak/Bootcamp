package com.DayOnePractise;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seconds ;
		System.out.println("Enter the Seconds");
		Scanner sc = new Scanner(System.in);
		seconds = sc.nextInt();
		
		
		int  hours = seconds / 3600;
		int min = seconds % 3600 / 60;
		
		int per_seconds = seconds % 3600 % 60;
		System.out.println( hours + " hours " + min + " minutes " + per_seconds + " seconds ");

	}

}
