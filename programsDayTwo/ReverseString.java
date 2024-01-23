package programsDayTwo;

import java.util.Scanner;

class ReverseString{
    public static void main(String[] args) {
       String inputString;
       System.out.println("Enter the String");
       Scanner sc = new Scanner(System.in);
       inputString = sc.next();
       String outputString = " ";
       for(int i = inputString.length()-1 ; i>=0;i--)
       {
          outputString = outputString + inputString.charAt(i);
       }
       System.out.println(outputString);
}
}