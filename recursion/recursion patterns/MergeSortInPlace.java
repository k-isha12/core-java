import java.util.Arrays;
public class MergeSortInPlace{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int start,int end){
        //instaead of creating new arr again nd again 
        // can sort in the same arr by dividing into mid and then sorting
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr,int start,int mid,int end){
        int[] mix = new int[end - start +1];
        int i = start;
        int j = mid+1;
        int k = 0;//point in mix arr(new arr)
        while(i<=mid && j <= end){
            if(arr[i] < arr[j]){
                //add arr[i] at k index of mix
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //one arr might be smaller than the other 
        while(i <= mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j <= end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        //to modify the original arr
        for(int l = 0;l<mix.length;l++){
            arr[start+l] = mix[l];
        }
    }
}