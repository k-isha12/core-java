public class FindUniqueof3{
    public static void main(String[] args){
        int[] arr = {2,2,3,7,7,8,7,2,8,8};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        //find ith bit individually ans then add and %3 
        //to find ith bit , bit 0 (num>>0) & 1, for bit 1 (num>>1)&1
        //now add all bit 0 and % 3 
        int ans = 0;//0000

        for(int i =0;i<32;i++){
            //as int has 32 bits
            int sum = 0; // we count sum for each bit individually
            for(int num : arr){
                if(((num >> i) & 1) == 1){
                    sum++;
                    //wwe get sum at particular position
                }
            }
            if(sum % 3 != 0){
                //means we got 1 at particular position,convert into decimal
                ans = ans|(1<<i);
            }
        }
        return ans;
    }
}