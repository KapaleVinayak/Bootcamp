package com.DayOnePractise;

import java.util.Scanner;

public class ComputeMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String student_name;
        int Physics_marks;
        int Chemistry_marks;
        int Maths_marks;
        
        System.out.println("Enter the name and marks of Physics,Chemistry and Maths subject");
        Scanner sc = new Scanner(System.in);
        
        student_name = sc.nextLine();
        Physics_marks = sc.nextInt();
        Chemistry_marks = sc.nextInt();
        Maths_marks = sc.nextInt();
        
        
        int total =  Physics_marks + Chemistry_marks + Maths_marks;
        
        
        
        double total_percentage = total / 3 ;
        
        
        System.out.println(student_name + "  obtained following " + total  + " of marks in PCM : " + " % in Physics , " + Physics_marks + " % in Chemistry , " + Chemistry_marks + " % in Maths " + Maths_marks + " So Total Percentage (%) is  :" + total_percentage	);
       
        
	}

}
