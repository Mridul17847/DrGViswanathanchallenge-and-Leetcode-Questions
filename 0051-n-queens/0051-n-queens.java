class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, result, n);
        return result;
    }

    private void backtrack(int row, char[][] board, List<List<String>> result, int n) {
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';           
                backtrack(row + 1, board, result, n);
                board[row][col] = '.';            
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board, int n) {
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 'Q') return false;
        }
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') return false;
        }
        for (int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) {
            if (board[r][c] == 'Q') return false;
        }

        return true;
    }
    private List<String> constructBoard(char[][] board) {
        List<String> currentBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            currentBoard.add(new String(board[i]));
        }
        return currentBoard;
    }
}