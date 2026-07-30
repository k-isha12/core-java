public class ReverseNum{
    public static void main(String[] args){
        rev1(1234);
        System.out.println(sum);
        System.out.println(rev2(23456));
    }
    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n %10;//gives last digit of a num
        sum = sum*10+rem;
        rev1(n/10);//calls the function , as n/10 so it removes the last digit 
    }
    static int rev2(int n){
        //sometimes we create another fn when we need additional variables in the argument
        int digits = (int)(Math.log10(n))+1;//lograthmic value of n of base 10
        return helper(n,digits);
    }
    static int helper(int n , int digits){
        //if it is single digit number
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}