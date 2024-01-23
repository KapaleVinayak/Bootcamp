package com.DayOnePractise;

import java.util.Scanner;

public class PrintOrderDetails {

	public static void main(String[] args) {
		int  order_id;
        int quantity;
        int total_cost;
        String name;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order id ");
        order_id = sc.nextInt();
        System.out.println("Enter the quantity ");
        quantity = sc.nextInt();
        System.out.println("Enter the name ");
        name = sc.next();
        System.out.println("Enter the total cost ");
        total_cost = sc.nextInt();
        
         
        System.out.println(" ORDER " + order_id + " : " + quantity + " of " + name + " for a total Rs " + total_cost + " . ");
        
        
	}

}
