import java.util.ArrayList;

public class SubSeq{
    public static void main(String[] args){
        subSequence(" ","abc");
        System.out.println(subseq("","ab"));
        System.out.println(subseqUsingAscii("","ab"));
    }
    static void subSequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
    }
    //return the arrlist of string
    static ArrayList<String> subseq(String p,String up ){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq(p+ch,up.substring(1));
        ArrayList<String> right = subseq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> subseqUsingAscii(String p,String up ){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqUsingAscii(p+ch,up.substring(1));
        ArrayList<String> second = subseqUsingAscii(p,up.substring(1));
        ArrayList<String> third = subseqUsingAscii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}