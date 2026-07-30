import java.util.ArrayList;

public class LinearSearch{
    public static void main(String[] args){
        int[] arr = {3,2,1,18,9,6,12};
        System.out.println(search(arr,18,0));
        System.out.println(find(arr,18,0));
        System.out.println(findIndexLast(arr,6,arr.length-1));
        int[] array = { 1, 3, 4, 4, 6,12,18};
        findAllIndex(array,4,0);
        System.out.println(list);
        System.out.println(findAllIndex1(array,4,0,new ArrayList<>()));
    }
    static int search(int[] arr ,int target , int index){
        if(arr[index] == target){
            return index;
        }
        if(index == arr.length-1){
            return -1;//means checking till Arrayoutofbound
        }
        return search(arr,target,index+1);
    }
    static boolean find(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);

    }
    static int findIndexLast(int[] arr,int target,int index){
        if(index == -1){
            return -1;//checks from last element of arr
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexLast(arr,target,index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    //list is used to print all indecies of same elemnt in an array
    static void findAllIndex(int[] array , int target , int index){
        if(index== array.length){
            return;//this ends fn acts like base case in void
        }
        if(array[index] == target){
            list.add(index);//adds the index values in list to get
        }
        findAllIndex(array,target,index+1);
    }
    //now let us see how to return the arraylists
    static ArrayList<Integer> findAllIndex1(int[] array , int target , int index, ArrayList<Integer> ans){
        if(index == array.length){
            return ans;
        }
        if(array[index] == target){
            ans.add(index);
        }
        return findAllIndex1(array,target,index+1,ans);
    }
    static ArrayList<Integer> findAllIndex2(int[] array , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == array.length){
            return list;
        }
        if(array[index] == target){
            list.add(index);
        }
        //mot optimal approch since we are creating objects again and again
        ArrayList<Integer> ansAllBeforeCalls = findAllIndex2(array , target , index+1);
        list.addAll(ansAllBeforeCalls);
        return list;
    }
}