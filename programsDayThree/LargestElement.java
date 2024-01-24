import java.util.Scanner;

class LargestElement{
    public static void main(String[] args) {
        int numbers[] = {12,3,5,7,1};

        int Max = numbers[0];
        for(int i = 0;i<numbers.length;i++)
        if(numbers[i] > Max)
        {
           Max = numbers[i];
        }
        System.out.println("Largest Element in Array is : " + Max);
    }
}