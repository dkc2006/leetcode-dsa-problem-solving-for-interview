class Solution {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Row & column check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) { // Check column
                return false;
            }
            if (board[row][i] == (char) (number + '0')) { // Check row
                return false;
            }
        }

        // Grid check
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow = 0, ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
