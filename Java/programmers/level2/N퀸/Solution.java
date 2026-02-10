package java.programmers.level2.N퀸;

class Solution {
    private int N = 0;

    public int solution(int n) {
        int[] queens = new int[n];
        placeQueen(0, queens, n);
        return N;
    }

    private void placeQueen(int row, int[] queens, int n) {
        if (row == n) {
            N++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(row, col, queens)) {
                queens[row] = col;
                placeQueen(row + 1, queens, n);
            }
        }
    }

    private boolean isValid(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }
        return true;
    }
}
