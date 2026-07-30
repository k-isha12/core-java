import java.util.Scanner;
class PerfectNumber{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=in.nextInt();
       if(perfect(n)){
        System.out.println(n+"is a perfect number");
       }else{
        System.out.println(n+"is not a perfect number");
       }
    }
    static boolean perfect(int n){
        if(n<=0){
            return false;
        }
        int SumofDivisiors=0;
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                SumofDivisiors+=i;
            }
        }
        return SumofDivisiors==n;
    }
}