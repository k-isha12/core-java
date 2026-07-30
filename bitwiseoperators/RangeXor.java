public class RangeXor{
    //find xor from a to b
    public static void main(String[] args){
        //range xor from a to b 
        //is (xor of b) ^ (xor of a-1), doing xor again cancels the elements
        int a = 3;
        int b = 9;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        //only for check as time limit will be exceed using this method
        int ans2 = 0;
        for(int i = a;i<=b;i++){
            ans2 = ans2^i;
        }
        System.out.println(ans2);
    }
    //calculate xor from 0 to a
    static int xor(int a){
         if(a % 4 == 0){
            return a;
        }else if(a%4==1){
            return 1;
        }else if(a%4==2){
            return a+1;
        }else{
            return 0;
        }
    }
}