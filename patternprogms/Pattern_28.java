class Pattern_28{
    public static void main(String[] args){
        pattern28(4);
    }
    static void pattern28(int n){
  /*     *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *          */
        for(int row=0;row< 2*n;row++){
            //n = 5 , at 6th row => row> n ? yes => 10-6=4
            int totalColsInRow = row > n ? 2*n - row : row;
            //need space and then *
            int noOfspaces = n - totalColsInRow;
            for(int s = 0;s<noOfspaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}