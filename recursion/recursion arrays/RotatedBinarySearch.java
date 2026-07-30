public class RotatedBinarySearch{
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(arr,7,0,arr.length-1));
        System.out.println(search(arr,9,0,arr.length-1));
        int[] nums = {5,6,1,2,3,4};
        System.out.println(search(nums,2,0,nums.length-1));
    }
    static int search(int[] arr , int target , int s , int e){
        int m = s +(e-s)/2;
        if(target == arr[m]){
            return m;
        }
        //now check in the 1st half
        if(arr[s] < arr[m]){//this means arr is sorted from s to m
            //now check target element in that range or not
            if(target >=arr[s] && target < arr[m]){
                return search(arr,target,s,m-1);
            }else{
                return search(arr,target,m+1,e);//if target is not in 1st half we go to 2nd half
            }
        }
        if(arr[m] < arr[e]){//2nd half of arr is sorted
            if(target > arr[m] && target <= arr[e]){
                //means target is in that range
                return search(arr,target,m+1,e);
            }else{
                return search(arr,target,s,e-1);
            }
        }
        return -1;
    }
}