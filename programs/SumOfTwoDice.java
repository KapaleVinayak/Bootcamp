package com.DayOnePractise;

import java.util.Random;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Random random = new Random ();
     int num1 = 1 + random.nextInt(6);
     int num2 = 1 + random.nextInt(6);
     
     int sum = num1+num2;
     System.out.println(sum);
	 }

}
