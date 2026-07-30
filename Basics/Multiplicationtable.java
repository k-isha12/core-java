import java.util.Scanner;
class Multiplicationtable{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=input.nextInt();
        System.out.println("Multiplication table for "+num);
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d=%d\n",num,i,num*i);
        }
        input.close();
    }
}