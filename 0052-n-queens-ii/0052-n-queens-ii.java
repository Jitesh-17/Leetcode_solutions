
class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        boolean[] cols = new boolean[n];
        boolean[] diag = new boolean[2 * n];
        boolean[] antiDiag = new boolean[2 * n];

        backtrack(0, n, cols, diag, antiDiag);

        return count;
    }

    void backtrack(int row, int n, boolean[] cols,
                   boolean[] diag, boolean[] antiDiag) {

        // All n queens have been placed
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {

            int d = row - col + n;
            int aD = row + col;

            // Check column and both diagonals
            if (cols[col] || diag[d] || antiDiag[aD]) {
                continue;
            }

            // Choose: place the queen
            cols[col] = true;
            diag[d] = true;
            antiDiag[aD] = true;

            // Explore: move to the next row
            backtrack(row + 1, n, cols, diag, antiDiag);

            // Undo: backtrack
            cols[col] = false;
            diag[d] = false;
            antiDiag[aD] = false;
        }
    }
}
