import java.util.Scanner;
public class Sieve{
    public static void main(String[] args){
        int n=40;
        boolean[] primes = new boolean[n+1];
        System.out.println(primes[0]);
        sievePrime(primes,n);
    }
    static void sievePrime(boolean primes[],int n ){
        for(int i = 2;i*i<=n;i++){
            //checks till square root of n means only half numbers
            //if primes[i] is true then it is not prime, else it is prime
            if(!primes[i]){
                //checks the respective numbers multiples and remove them
                for(int j = i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i =2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}

