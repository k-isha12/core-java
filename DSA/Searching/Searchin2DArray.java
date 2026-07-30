import java.util.Arrays;

public class Searchin2DArray{
    public static void main(String[] args){
        int [][]arr={
            {12,6},
            {15,18,24},
            {78,99,34,56}
        };
        int target=18;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                    //new creates an obj
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}