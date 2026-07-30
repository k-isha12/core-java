public class FindIthBit{
    public static void main(String[] args){
        System.out.println(ithbit(3,13));
    }
    static int ithbit(int i,int num){
        //binary of 13 is 1101 , thw ith bit we need at 3rd position
        //initially we take 0001 and move 1 to the position we require
        // we need 0100 so we move 2 positions, as we need 3rd posion 
        // so we reqired to move i-1 position
        int mask = 1<<(i-1);
        //now we do and operation to mask as all other are 0 and only one 1 we get the ith bit 
        if((num&mask) == 0){
            return 0;
        }
        return 1;
    }
}