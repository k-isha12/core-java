import java.util.Scanner;
public class PrimePalindrome{
    static boolean isPalindrome(int n){
    int original = n;
    int rev = 0;
    while(n > 0){
        int digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }
    return original == rev;
}
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
    static boolean isPrimepalindrome(int n){
        if(isPalindrome(n) && isPrime(n)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = in.nextInt();
        if(isPrimepalindrome(number)){
            System.out.println(number+"is a prime palindrome number");
        }else{
          System.out.println(number+"is not a prime palindrome number");  
        }
    }
}