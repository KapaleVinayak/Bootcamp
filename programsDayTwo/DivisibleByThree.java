package programsDayTwo;

class DivisibleByThree{
    public static void main(String[] args) {
         int arr[] = new int [30];
        for(int i = 1;i<=arr.length;i++)
        {
            if(i % 3 == 0)
            {
                System.out.print(i + " ");;
            }
        }
    }
}