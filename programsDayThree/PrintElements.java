import java.util.Scanner;

class PrintElements{
    public static void main(String []args){
        int numbers[] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements ");
        for(int i = 0;i<=numbers.length;i++)
        {
            numbers[i] = sc.nextInt();
            System.out.print(numbers[i] + " ");
        }
      
    }
}