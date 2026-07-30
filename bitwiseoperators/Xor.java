public class Xor{
    //find the xor of numbers from 0 to a
    public static void main(String[] args){
        System.out.println(xorTilla(8));
    }
    static int xorTilla(int a){
        if(a % 4 == 0){
            return a;
        }else if(a%4==1){
            return 1;
        }else if(a%4==2){
            return a+1;
        }else{
            return 0;
        }
    }
}