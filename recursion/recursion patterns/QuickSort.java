import java.util.Arrays;
public class QuickSort{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int low,int high){//low and high tells us which part of arr we are working on
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;//start and end helps to swap the elemnts and low , high are used to know which part we are working on
        int mid = start +(end - start)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start] < pivot){
                start++;//means element less than pivot is at left,at correct position so move forward
            }
            while(arr[end] > pivot){
                end--;
            }
            //we reach here when both conditions are violated so we swap the elemnts
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            //now my pivot is at correct index now we need to sort two halfs (low,end) and(start,high)
        }
        sort(arr,low,end);
        sort(arr,start,high);
    }
}