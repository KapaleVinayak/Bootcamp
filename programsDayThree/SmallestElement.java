class SmallestElement{
    public static void main(String []args){
        int numbers[] = {3,12,56,8,2,9};
        int Min = numbers[0];
        for(int i = 0;i<numbers.length;i++)
            if(numbers[i] < Min)
            {
               Min = numbers[i];
            }
            System.out.println("Smallest element in array is : " + Min);
        
    }
}