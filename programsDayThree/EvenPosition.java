class EvenPosition{
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        System.out.println("Even Positions Numbers are :" );
        for(int i=1;i<numbers.length;i=i+2)
        {
            System.out.println(numbers[i]);
        }
    }
}