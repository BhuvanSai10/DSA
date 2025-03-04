package DSA.Problems;

import java.util.Arrays;

public class EqualRowColPairs
{
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int[][] trans = new int[n][n];
        for (int i=0 ; i<n ; i++) {
            for (int j=0 ; j<n ; j++) {
                trans[i][j] = grid[j][i];
            }
        }
        int count = 0;
        for (int[] col : trans) {
            for (int[] row : grid) {
                if (Arrays.equals(row, col)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}));
    }
}
