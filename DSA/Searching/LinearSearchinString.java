import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchinString{
     public static void main(String[] args){
       String name="monisha";
       char target='n';
       System.out.println(Arrays.toString(name.toCharArray()));
       int element=linearSearchString(name,target);
       System.out.println(element);
     }
     static int linearSearchString(String str,char target){
        if(str.length()==0){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return i;
            }
        }
       return -1;
     }
       
}