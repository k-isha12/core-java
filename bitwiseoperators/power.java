public class Power{
    public static void main(String[] args){
        //calculate a^b
        int base = 3;
        int power = 6;
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            //we are squaring the base vlue if bit at particular position is 0
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}