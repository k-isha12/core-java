import java.util.Scanner;
public class Amstrongnumber{
    static boolean amstrong(int n){
        int temp,digit;
        int rev=0;
        temp=n;
        while(n>0){
            digit=n%10;
            rev=rev+digit*digit*digit;
            n=n/10;
        }
        return temp==rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(amstrong(n)){
            System.out.println(n+" is an Amstrong number");
        }
        else{
            System.out.println(n+" is not an Amstrong number");
        }
    }
}