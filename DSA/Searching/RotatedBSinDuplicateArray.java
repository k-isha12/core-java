public class RotatedBSinDuplicateArray{
    public static void main(String[] args){
         int[] nums={2,2,2,7,0,1,2};
         int target=0;
         System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target){
        int pivot=findPivot(nums);
        if(pivot==-1){
            //do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }else if(target>=nums[0]){
            //pivot is the largest element it means elements before pivot and after pivot are smaller
            //if target is > 0 element it cant cross pivot 
            //so start is 0 and end is pivot-1
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        //this will not work for duplicate values
         int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                //mid<end condition should be coz, if mid is at last elemnt then mid+1 is out of bound , error
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                //if mid is in 1st position then mid-1 is error
                return mid-1;
            }
            //if elements at mid,start,end are same .means duplicates are there then,
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //start++;
                //end--;
                // //NOTE: what if elements at start and end are pivot??
                //check if start is pivot!!
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted,so pivot is on right
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}