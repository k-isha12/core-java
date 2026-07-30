import java.util.Scanner;
class FibinacciSeries{
    //Fibonacci series using ITERATION
    public static void main(String args[]){
     System.out.println("enter the number: ");
     Scanner in= new Scanner(System.in);
     int num=in.nextInt();
     fibinacci(num);
    }
    static int fibinacci(int n){
     int a=0,b=1;
     if(n>=1){
        System.out.println(a+" ");
     }
     if(n>=2){
        System.out.println(b+" ");
     }
     for(int i=2;i<n;i++){
        int nextterm=a+b;
        System.out.println(nextterm+" ");
        a=b;
        b=nextterm;
     }
     return n;
    }
    //Fibonacci series using RECURSION
    /**public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=in.nextInt();
        System.out.println("fibinacci series till "+n);
        for(int i=0;i<n;i++){
            System.out.println(fibanacci(i)+" ");
        }

     }
     static int fibanacci(int n){
        if(n<=1){
            return n;
        }
        return fibanacci(n-1)+fibanacci(n-2);
     } */
}