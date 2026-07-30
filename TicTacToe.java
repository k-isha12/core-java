import java.util.*;

public class TicTacToe {
    private final char[][] board = new char[3][3];
    private char currentPlayer = 'X';
    private final Scanner sc = new Scanner(System.in);
    private boolean vsComputer = true; // set in menu

    public static void main(String[] args) {
        new TicTacToe().start();
    }

    private void start() {
        initBoard();
        System.out.println("==== Tic Tac Toe (Java Console) ====");
        System.out.println("1) Play vs Computer\n2) Two Players");
        System.out.print("Choose mode (1/2): ");
        String choice = sc.nextLine().trim();
        vsComputer = choice.equals("1");
        System.out.println();

        printBoard();
        while (true) {
            if (vsComputer && currentPlayer == 'O') {
                computerMove();
            } else {
                playerMove();
            }
            printBoard();

            if (hasWon(currentPlayer)) {
                System.out.println("Player '" + currentPlayer + "' wins! 🎉");
                break;
            }
            if (isBoardFull()) {
                System.out.println("It's a draw.");
                break;
            }
            switchPlayer();
        }
    }

    private void initBoard() {
        for (int r = 0; r < 3; r++) Arrays.fill(board[r], ' ');
        currentPlayer = 'X';
    }

    private void printBoard() {
        System.out.println();
        for (int r = 0; r < 3; r++) {
            System.out.printf(" %c | %c | %c %n", board[r][0], board[r][1], board[r][2]);
            if (r < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }

    private void playerMove() {
        while (true) {
            System.out.print("Player '" + currentPlayer + "' enter row and column (1-3 1-3): ");
            String line = sc.nextLine().trim();
            int r, c;
            try {
                String[] parts = line.split("\\s+");
                if (parts.length != 2) throw new IllegalArgumentException();
                r = Integer.parseInt(parts[0]) - 1;
                c = Integer.parseInt(parts[1]) - 1;
                if (r < 0 || r > 2 || c < 0 || c > 2) throw new IndexOutOfBoundsException();
            } catch (Exception e) {
                System.out.println("Invalid input. Example: 2 3");
                continue;
            }
            if (board[r][c] != ' ') {
                System.out.println("Cell already taken. Try again.");
                continue;
            }
            board[r][c] = currentPlayer;
            break;
        }
    }

    private void computerMove() {
        System.out.println("Computer thinking...");
        // 1) Can I win now?
        int[] win = findBestMove('O');
        if (win != null) {
            board[win[0]][win[1]] = 'O';
            return;
        }
        // 2) Can I block X from winning?
        int[] block = findBestMove('X');
        if (block != null) {
            board[block[0]][block[1]] = 'O';
            return;
        }
        // 3) Take center if free
        if (board[1][1] == ' ') { board[1][1] = 'O'; return; }
        // 4) Take a corner if free
        int[][] corners = {{0,0},{0,2},{2,0},{2,2}};
        for (int[] rc : corners) if (board[rc[0]][rc[1]] == ' ') { board[rc[0]][rc[1]] = 'O'; return; }
        // 5) Otherwise, take any side
        int[][] sides = {{0,1},{1,0},{1,2},{2,1}};
        for (int[] rc : sides) if (board[rc[0]][rc[1]] == ' ') { board[rc[0]][rc[1]] = 'O'; return; }
    }

    // If 'mark' could win in one move, return that move; else null
    private int[] findBestMove(char mark) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    board[r][c] = mark;
                    boolean win = hasWon(mark);
                    board[r][c] = ' ';
                    if (win) return new int[]{r, c};
                }
            }
        }
        return null;
    }

    private boolean hasWon(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true; // rows
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true; // cols
        }
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true; // diag
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true; // anti-diag
        return false;
    }

    private boolean isBoardFull() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c] == ' ') return false;
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
