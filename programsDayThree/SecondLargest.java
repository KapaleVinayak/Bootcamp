class SecondLargest{
    public static void main(String[] args) {
        int numbers[] = {10,24,36,2,30,22};
        int temp;
        for(int i = 0 ;i<numbers.length-1;i++)
        {
            for(int j = i+1;j<numbers.length;j++)
            {
                if(numbers[i]<numbers[j])
                {
                  temp = numbers[i];
                  numbers[i]= numbers[j];
                  numbers[j] = numbers[i];
                }
            }
            System.out.println("Second Largest "+ numbers[1]);
        }
    }
}