import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {4,3,2,8,1};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr , int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[max]){
                sort(arr,r,c+1,c);
            }else{
                sort(arr,r,c+1,max);
            }
        }else{
            //means we found max after interating the complete arr in one pass
            //after finding max we need to swap with last element 
            int temp = arr[max];//last element is at index 3 if arr.length is 4 
            //means r - 1
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            sort(arr,r-1,0,0);
        }
    }
}