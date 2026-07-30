import java.util.ArrayList;

public class Factors2{
    public static void main(String[] args){
        //factors1(36);
        //factors2(20);
        factors3(20);
    }
    //O(n)
    static void factors1(int n){
        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i+" ");
            }
        }
    }
    //O(sqrt(n))
    static void factors2(int n){
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                //we need to avoid duplicates
                if(n/i == i){
                    System.out.println(i);
                }else{
                    System.out.print(i+" "+ n/i+" ");
                }
            }
        }
        //but we are not getting in sorted order, to solve it
        //starting from 1st number alternate ones are in ascending oreder
        //and from last number going front alternate numbers are descending order
        //both time and space will be O(sqrt(n)
    }
    //method similar to factors2 but in sorted oreder
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                //we need to avoid duplicates
                if(n/i == i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    //descending order elements are going to store in the list
                    list.add(n/i);
                }
            }
        }
        //prints the elements in reverse oreder in a list
        for(int i = list.size() - 1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}