 import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        int[] arr = {5,6,4,2,3,1};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        //this is for only elements in range 1 to n
        //put the element at index=element-1
        int i = 0;
        while(i<arr.length){
            //check whether elemnt is at correct index or not
            int correct = arr[i] - 1;
            //if elemnt at i is not placed in its correct index then swap
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}