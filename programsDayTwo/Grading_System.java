package programsDayTwo;

import java.util.Scanner;

class Grading_System{
    public static void main(String [] args){
          int score;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Marks");
          score = sc.nextInt();
          
          if(score >= 90 && score <= 100)
          {
            System.out.println("Got A grade");
          }
          else if(score >= 80 && score <= 89)
          {
            System.out.println("Got B grade");
          }
          else if (score >= 70 && score <= 79)
          {
            System.out.println("Got C grade");
          }
          else if(score >= 60 && score <= 69)
          {
            System.out.println("Got D grade");
          }
          else
          {
            System.out.println("Got F grade");
          }
        }

    }
