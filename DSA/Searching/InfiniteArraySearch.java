public class InfiniteArraySearch{
    //geeksforgeeks problem of amzon interviw question
    //but i was unable to find it in geeksforgeeks
    public static void main(String[] args){
        int[] arr={3,5,7,9,10,90,100,120,180,689,900,987};
        int target=90;
        System.out.println(findingRange(arr,target));
    }
    static int findingRange(int[] arr, int target){
       //at first let us take the smalles box range that is 2 
       int start=0;
       int end=1;
       //now keep on doubling the box size if you cant find the target in the start and end range
       //it means target is > than the end
       while(target>arr[end]){
        int newStart=end+1;
        //+1 is coz of indexing, *2 is to double the size of array
        //initial end-initial start
        end=end+(end-start+1)*2;
        start=newStart;
       }
       return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        //as start value changes while doubling the size of box and end value cant be given
        //  as there is no size of array so arr.length cant be taken
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
}