import java.util.Scanner;
class PythograenNumber{
    public static void main(String args[]){
        System.out.println("enter there numbers: ");
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        pythog(a,b,c);
        if(pythog(a,b,c)){
            System.out.println("the numbers forms pythograen triplet");
        }else{
            System.out.println("the numbers does not forms pythograen triplet");
        }

    }
    static boolean pythog(int a, int b ,int c){
        int greatest=Math.max(a,Math.max(b,c));
        if(greatest==a){
            return (b*b)+(c*c)==(a*a);
        }else if(greatest==b){
            return b*b==(a*a)+(c*c);
        }else{
           return c*c==(a*a)+(b*b);
        }
    }
}