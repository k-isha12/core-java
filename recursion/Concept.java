public class Concept{ //Passing Number
    public static void main(String[] args){
        fun(3);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
      /* fun(n--); Stack overflow occurs, as 1st fun(3) is called and then subtracts 
        but it is already too last as we already passed fun(3) 
        so again n value becomes 3 and repeats,base condition is never acquired */
        fun(--n); //this prints 3 2 1 coz 1st we subtract and then we pass the value which calls f(3)
    }
}