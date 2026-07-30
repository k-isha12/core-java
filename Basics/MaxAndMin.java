import java.util.Scanner;
class MaxAndMin{
    public static void main(String args[]){
        System.out.println("enter there numbers: ");
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        max(a,b,c);
        min(a,b,c);
    }
    static void max(int a,int b,int c){
        if((a>b && a>c)||(a>b && b>c)){
            System.out.println(a+"is greatest number");
        }else if((b>a && b>c)||(b>a && b>c)){
            System.out.println(b+"is greatest number");
        }
        else{
            System.out.println(c+"is greatest number");
        }
    }
    static void min(int a,int b, int c){
        if((a<b && a<c)||(a<b && b<c)){
            System.out.println(a+"is smallest number");
        }else if((b<a && b<c)||(b<a && a<c)){
            System.out.println(b+"is smallest number");
        }else{
            System.out.println(c+"is smallest number");
        }
    }
}