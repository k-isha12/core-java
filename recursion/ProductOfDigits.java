public class ProductOfDigits{
    public static void main(String[] args){
        System.out.println(product(550));
    }
    static int product(int n){
        if((n%10) == n){ //as n value decreases if it is last digit then base condition is met 
            return n;
        }
        //n value keeps on changing by removing the last digit
        return (n%10) * product(n/10);
    }
}