package programs;

import java.util.Scanner;

class Quadratic{
    public static void main(String [] args){
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a ,b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int delta = b * b - 4 * a * c;
        System.out.println("Delta is : " + delta);

        double root1_of_x = (-b + Math.sqrt(delta))/ (2*a);
        double root2_of_x = (-b - Math.sqrt(delta))/ (2*a);
        
        System.out.println("Root 1 is : " + root1_of_x);
        System.out.println("Root 2 is : " + root2_of_x );

    }
}