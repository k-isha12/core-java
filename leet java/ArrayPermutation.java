import java.util.Arrays;
import java.util.Scanner;
class ArrayPermutation {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
           ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String args[]){
        int[] testArray={0,2,1,5,3,4};
        ArrayPermutation sol=new ArrayPermutation();
        int[] resultArray=sol.buildArray(testArray);
        System.out.println("original array is: "+Arrays.toString(testArray));
        System.out.println("built array is: "+Arrays.toString(resultArray));
    }
}