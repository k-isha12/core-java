import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
       int[] arr = {5,4,3,2,1};
       System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
       //run the loop for n-1 times
       boolean swapped;
       for(int i = 0; i < arr.length ; i++){
        swapped = false;
        //i indicates number of passes
        //j indicates number of times in single pass
        //last elemt after one pass will get sorted and repeats
        //number of elemnts sorted at last = ith pass
        //j repeats n-i-1 times if from 0 then , n-i times
        for(int j = 1 ; j < arr.length - i ; j++){
            //we need to swap if item is smaller than pervious one
            //if we take item greater than next one , array out of bound exception araises, if j is at last element
            if( arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swapped = true;
            }
        }
        if(!swapped){
            break;
        }
       }
       return arr;
    }
}