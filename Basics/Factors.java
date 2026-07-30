import java.util.Scanner;
class Factors{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=in.nextInt();
        factor(n);
    }
    static void factor(int n){
            System.out.println("Factors of "+n+" are: ");
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
    }
    // factors using built in fn
    /**public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=in.nextInt();
        factor(n);
    }
        static void factor(int n){
        //iterating only till sqrt of num, eg: considering 25 5*5=25, so iterating till 5 is enough to reduce time complexity
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
            }
            if(i!=n/i){
                System.out.println(n/i);
            }
        }
    } */
}