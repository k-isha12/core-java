public class Resetbit{
    public static void main(String[] args){
        System.out.println(resetIthBit(13,3));
    }
    static int resetIthBit(int num,int i){
        //means we use and gate after masking
        //while masking we convert into 1 so we do not gate for masking
        int mask = ~(1<<(i - 1));
        return num & mask;
    }
}