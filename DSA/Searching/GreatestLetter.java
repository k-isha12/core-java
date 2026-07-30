public class GreatestLetter{
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1835930311
    public static void main(String[] args){
       char[] letters={'c','f','j'};
       char target='a';
       System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        //to return 0, can also directly return 0
        return letters[start % letters.length];  
    }
}