public class Triangle{
    public static void main(String[] args){
        triangle1(4,0);
        triangle2(4,0);
    }
    static void triangle1(int r, int c){
        //this function 1st prints and then calls
        if(r == 0){
            return;//coz we wont go untill row is 0 
        }
        if(c < r){
            System.out.print("* ");
            triangle1(r,c+1);
        }else{
            //we need a new line to go to next row
            System.out.println();//coz col starts from 0 in next row
            triangle1(r-1,0);//we take 4 as the 1st row and then go till 0
        }
    }
    static void triangle2(int r, int c){
        //this function 1st calls and then prints, 
        // means after everything is called last called fun will print 1st so we get lower triangle
        if(r == 0){
            return;//coz we wont go untill row is 0 
        }
        if(c < r){
            triangle2(r,c+1);
            System.out.print("* ");
        }else{
            triangle2(r-1,0);//we take 4 as the 1st row and then go till 0
            //we need a new line to go to next row
            System.out.println();//coz col starts from 0 in next row
        }
    }
}