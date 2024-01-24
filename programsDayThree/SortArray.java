import java.util.Arrays;

class SortArray{
    public static void main(String[] args) {
        int numbers[] = {12,3,4,5,6,7,8,10};
        Arrays.sort(numbers);
        for(int i = 0;i<numbers.length;i++)
        {
        System.out.print(numbers[i] + " ");
        }
    }
}