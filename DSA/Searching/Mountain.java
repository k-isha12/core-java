 public class Mountain{
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/editorial
    public static void main(String[] args){
        int[] arr={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
     static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //in decreasing part of array
                //move left, but we dont know that mid value is greater than mid +1 or not
                // so to compare we also need to consider mid
                end = mid;
            }else{
                //we are in ascending part of array
                // as we already know mid < mid+1 , we can move right no need to compare mid value
                start= mid+1;
            }
        }
        // in the end start and end will point to one element whic is max
            return start;// or we can also return end both are equal
    }
 }