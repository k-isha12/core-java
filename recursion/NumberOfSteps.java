public class NumberOfSteps{
    //count no of steps to reduce a num to 0
    //if num is even divide by 2
    //if num is odd subtract 1
    //leetcode question 1342 , but do here this problem using recursion
    public static void main(String[] args){
        System.out.println(numSteps(8));
    }
    static int numSteps(int n){
        return helper(n,0);
    }
    static int helper(int num , int steps){
        if(num == 0){
            return steps;
        }
        if(num%2 != 0){//means num is even
            return helper(num-1 , steps+1);
        }
        return helper(num/2 , steps+1);
    }
}