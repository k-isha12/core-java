public class Patterns {
    public static void main(String[] args) {
        pattern7(4);
    }

    static void pattern1(int n) {
        for(int rows = 1; rows <= n; rows++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1;row<=n;row++){
            //for row1 n col,row 2 n-1 col.. 
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n ){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" " );
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 1;row<=n+1;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1;row<=n;row++){
            //for row1 n col,row 2 n-1 col.. 
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        /*    *
             **
            ***
           ****
          ***** */
        for(int row = 0; row < n; row++){
            int spaces = n - row - 1;

        for(int s = 0; s < spaces; s++){
            System.out.print(" ");
        }
        for(int col = 0; col <= row; col++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
    static void pattern7(int n){
        /*   *****
              ****
               ***
                **
                 * 
                 * */
        for(int row = 0;row<=n ; row++){//n = 4
            int spaces = row;
            for(int s = 0;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int col= n;col>row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
  /*     *
        * *
       * * *
      * * * *
     * * * * *
        */
        for(int row=0;row< n;row++){
            //for col 1 => 1*, for col 2 => 2* and so on..
            //need to add spaces 
            int spaces = n - row - 1;
            for(int s = 0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col = 0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }
}