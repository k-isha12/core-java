import java.util.Arrays;
public class MergeSort{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        arr = (sort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;//there are no more elements to divide
        }
        int mid = arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr,0,mid));
        int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));//we include mid as that is exclusive
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i =0;//pointer of 1st array
        int j = 0;//pointer of second array
        int k =0;//pointer in mix array
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not finish
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}