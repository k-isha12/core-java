import java.util.Scanner;
public class LinearSearch{
    public static void main(String[]args){
       int[] nums ={12,6,18,25,45,5,3};
       int target=6;
       int ans=linearSearch(nums,target);
       System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
       if(arr.length==0){
        return -1;
       }
       for(int i=0;i<arr.length;i++){
         int element=arr[i];
         if(element==target){
            return i;
         }
       }
       return -1;
    }
}