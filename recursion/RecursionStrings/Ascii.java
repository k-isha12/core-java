public class Ascii{
    public static void main(String[] args){
        //char ch = 'a';
        //System.out.println(ch+0);
        subSequence("" , "ab");
    }
    static void subSequence(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
        subSequence(p+(ch+0),up.substring(1));
    }
}