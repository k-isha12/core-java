public class Stream {
    public static void main(String[] args){
        skip("","baccad");
        System.out.println(skipCh("abbnnmmaa"));
        System.out.println(skipApple("bmwnappleff"));
        System.out.println(skipAppNotApple("bmwnappleff"));
    }
    static void skip (String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.charAt(0) == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skipCh(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
          return  skipCh(up.substring(1));
        }else{
            return ch + skipCh(up.substring(1));
        }
        
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return " ";
        }    
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));//we skip 5 letters to skip a p p l e
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    //skip app only when app is not equal to apple
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return " ";
        }    
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(5));//we skip 5 letters to skip a p p l e
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
