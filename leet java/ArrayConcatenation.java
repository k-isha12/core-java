import java.util.Scanner;
import java.util.Arrays;
class ArrayConcatenation{
    int[] getConcatenation(int[] nums){
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
        ans[i]=nums[i];
        ans[i+n]=nums[i];
      } 
      return ans;
    }
    public static void main(String args[]){
        int[] arr={1,2,3};
        //creates object for non static metho to call
        ArrayConcatenation sol=new ArrayConcatenation();
        //creating new array named result array to store the answer
        //called the method getconcatenation using obj sol created and passed arguments arr
        int[] resultarray=sol.getConcatenation(arr);
        //arrays.tostring() makes output exay to read and pass the arguments
        System.out.println("original array is: "+Arrays.toString(arr));
        System.out.println("concatenation array is: "+Arrays.toString(resultarray));
    }
}