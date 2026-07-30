import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {5,3,2,1,4,6};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr , int r, int c){
        //sorts the array using bubble sort and recursion 
        if(r == 0){
            return;//coz we wont go untill row is 0 
        }
        if(c < r){
            if(arr[c+1] < arr[c]){
                //we swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sort(arr,r,c+1);
        }else{
            sort(arr,r-1,0);
        }
    }
}