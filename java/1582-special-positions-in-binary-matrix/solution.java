class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int R = mat.length;
        int C = mat[0].length;
        int[] rowCount = new int[R];
        int[] colCount = new int[C];

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (mat[r][c] == 1) {
                    rowCount[r]++;
                    colCount[c]++;
                }
            }
        }

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (mat[r][c] == 1) {
                    if (rowCount[r] == 1 && colCount[c] == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
