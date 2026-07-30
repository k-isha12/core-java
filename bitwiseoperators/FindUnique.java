public class FindUnique{
    //using XOR operation
    public static void main(String[] args){
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            // a^a = 0, a^0 = a , a^1=a compliment
            unique ^= n;
        }
        return unique;
    }
}