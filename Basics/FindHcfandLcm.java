import java.util.Scanner;
class FindHcfandLcm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number a and b: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int a = num1;
        int b = num2;
        while(b!=0){
            int temp = b;
            b = b%a;
            a = temp;
        }
        int HCF = a;
        System.out.printf("HCF of %d and %d is %d\n",a,b,HCF);
        int LCM = (num1*num2)/HCF;
        System.out.printf(" LCM of %d and %d is %d\n",a,b,LCM);
    }
}
