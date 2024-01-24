class ReverseOrder{
    public static void main(String[] args) {
        int numbers[] ={12,2,3,4,5,6};
        
        for(int i=numbers.length-1;i>=0;i--)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}