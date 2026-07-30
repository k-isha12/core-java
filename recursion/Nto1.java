public class Nto1{
    public static void main(String[] args){
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            //here return doesnt returns the value , it tells java to stop,saying base condition is met
            return;
        }
        //intially it prints n and then calls n-1 function so n to 1 numbers will be print
        System.out.println(n);
        fun(n-1);
        //to print 1 to n numbers first we call n-1 fun till it is 0, so 1st 1 will be printed and so on till n 
        //all fun will be stored in stack till 1 is printed and after base condition they come out of stack and print
    }
}