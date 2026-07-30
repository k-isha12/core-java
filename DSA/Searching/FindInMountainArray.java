public class FindInMountainArray{
    //https://leetcode.com/problems/find-in-mountain-array/editorial
    public static void main(String[] args){
       int[] arr={1,2,3,4,5,3,1};
       int target=3;
       System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry= orderagnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //searching in 2nd half means after peak so peak+1 ,till the last elemnt which is end
        return orderagnosticBS(arr,target,peak+1,arr.length-1);
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
    static int orderagnosticBS(int[] arr, int target,int start,int end){
        boolean isASC=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isASC){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}