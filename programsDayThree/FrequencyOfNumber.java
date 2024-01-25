import java.util.Arrays;

class FrequencyOfNumber{
    public static void main(String[] args) {
        int[] array = {12,3,5,12,8,9,4,2,3};
      
        //sorting an array
        Arrays.sort(array);
        
        //declaring the variables
        int i,j;
        System.out.println("The Duplicate Elements in Array are : -");
        
        //loop for logic implementation
        for(i=0; i<array.length; i++){
            int count = 1;
           for(j=i+1; j<array.length; j++){
              if(array[j] == array[i]){
                 count++;
              } else {
                 break;
              }
           }
           i=j-1;
           if(count> 1){
           
              //printing the output
              System.out.println(array[i] + " is  " + count + " times");
           }
        }
     }
    }
    
