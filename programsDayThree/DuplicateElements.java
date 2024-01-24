class DuplicateElements{
    public static void main(String[] args) {
        int numbers[] = {12,3,5,6,7,2,3,7};
        System.out.println("Duplicate Numbers in array are : " );
        for(int i = 0;i<numbers.length;i++)
        {
            for(int j = i+1;j<numbers.length;j++)
            {
                if(numbers[i] == numbers[j])
                {
                  System.out.println(numbers[j] + " ");
                }
            }
        }
    }
}