public class Count_zeroes{
    //important concept
    public static void main(String[] args){
        System.out.println(count(30204));
    }
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n == 0){
            return count;
        }
        int rem = n %10;//gives the last digit
        if(rem == 0){
            //checks that last digit is 0 or not
            //if 0 increase the count
            return helper(n/10 , count+1);
        }
        return helper(n/10,count);
    }
}