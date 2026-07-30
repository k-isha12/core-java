public class NQueens{
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }
    static int queens(boolean[][] board,int row){ // displaying queens in rows so no need col
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        //placing the queen and checking for every row and col
        int count = 0;
        for(int col = 0;col<board.length;col++){
            //place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }
    return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //check vertical row
        for(int i = 0;i<row;i++){
            if(board[i][col]){
                //means queen over there so it is not safe
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for(int i = 1;i<=maxLeft;i++){ //we go left by subtracting 1 so i = 1
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row,board.length - col - 1);
        for(int i = 1;i<=maxRight;i++){ //we go left by subtracting 1 so i = 1
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}