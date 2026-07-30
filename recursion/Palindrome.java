public class Palindrome{
    public static void main(String[] args){
        System.out.println(ispalindrome(1234321));
    }
    static int rev(int n){
        /* we use loop to calculate num of digits but there is also a shortcut 
         int digitCount = 0;
        while(n>0){
            digitCount++;
            n/=10;
        }
        */
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n , int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean ispalindrome(int n){
        return n == rev(n);
    }
}