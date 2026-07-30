public class SplitArray{
    //https://leetcode.com/problems/split-array-largest-sum/submissions/1838591530
    //google question
    public static void main(String[] args){
       int[] nums={7,2,5,8,10};
       System.out.println(splitArray(nums,2));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            //if nums.length-1 is used it skips the last elemnt 
            //instead we can use for each loop as for(int num : nums)
            //for every num in nums
            start = Math.max(start,nums[i]); //start = 10
            end += nums[i]; //end = 7+2+5+8+10 = 32
        }
        while(start<end){
            int mid = start+(end-start)/2;//as we need to update mid, intially mid =21
            int sum=0;
            int pieces=1;//intially there will be on complete array
         //for every num in nums array
           for(int num:nums){
              if(sum+num > mid){
                //0+7=7 !> 21 out of if ,move to else
                //7+2=9 !> 21 out of if, move to else
                //9+5=14 !> 21 out of if, move to else . Now arr is {7,2,5}
                //14+8=22 > 21 execute if . 
                //we cannot add the new num in same array so need to create a sub array 
                    sum=num; // new array {8} will be created and then checks again
                    pieces++; 
                }else{
                   sum+=num;
                }
            }
            if(pieces > k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;//at last start == end
    }
}