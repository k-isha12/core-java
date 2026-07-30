import java.util.Scanner;
class PermutationAndCombination{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=in.nextInt();
        System.out.println("enter the value of r: ");
        int r=in.nextInt();
        if(n<0||r<0||(n-r)<0){
            System.out.println("Invalid input");
        }
        long npr=permutation(n,r);
        System.out.println("value of npr is: "+npr);
        long ncr=combination(n,r);
        System.out.println("value of ncr is: "+ncr);

    }
    static int fact(int num){
        int fact=1;
        if(num<0){
           return 0;
        }
        for(int i=1;i<=num;i++){
           fact*=i;
        }
        return fact; 
    }
    static int permutation(int n, int r){
        int permutation=fact(n)/fact(n-r);
        return permutation;
    }
    static int combination(int n, int r){
        int combination=(fact(n))/(fact(r)*fact(n-r));
        return combination;
    }
}