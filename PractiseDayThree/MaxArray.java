package PractiseDayThree;

class MaxArray{
    public static void main(String[] args) {
        int numbers[] = {22,11,3,4,5,6};
        int max = numbers[0];
        for(int i = 0; i<numbers.length;i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
           
        }
        System.out.println("Max Number is :" + max);
    }
}