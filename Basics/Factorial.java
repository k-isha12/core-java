import java.util.Scanner;
class Factorial{
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=in.nextInt();
        fact(n);
        if(n<0){
            System.out.println("Invalid input as factioral doest exist for -ve numbers");
        }else{
            int result=fact(n);
            System.out.println(" Factorial of "+n+" is "+result);
        }
    }
     //Factorial using RECURSION
  //  static int fact(int n){
        /** if(n<0){
            System.out.println("Invalid input as factioral doest exist for -ve numbers");
        }else{
            // int result=fact(n); ->  cased Stack overflow error, 
            //if i give input as 5 it calls fact(5) this fact(5) again calls fact(5) casuing stackoverflow.
            System.out.println(" Factorial of "+n+" is "+result);
        }*/
       // if(n==0||n==1){
     //       return n;
     //   }
     //   return n*fact(n-1);
   // }
    //Factorial using ITERATION
    static int fact(int n){
        int result=1;
        if(n==0||n==1){
          System.out.println(result);
        }
        for(int i=1;i<=n;i++){
          result= result * i;
        }
        return result;
    }
}