package programsDayTwo;

import java.util.Scanner;

class Number_Table{
    public static void main(String [] args){
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of table");
        num = sc.nextInt();
        for(int i = 1;i<=10;i++)
        {
             int prod = num * i ;
            System.out.println(prod);
        }
       
    }
}