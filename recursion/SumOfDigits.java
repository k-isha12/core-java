public class SumOfDigits{
    public static void main(String[] args){
        System.out.println(sum(1342));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        // rem = n % 10; gives last digit of a num
        // n = n / 10; removes last digit and gives remaining num
        // means f(n) = n%10 + f(n/10);
        return (n%10) + sum(n/10);
    }
}