package DSA.STS;


public class CelebrityProblem{
    static int celebrity(int[][] mat) {
        int n = mat.length;

        int i = 0, j = n - 1;
        while (i < j) {

            // j knows i, thus j can't be celebrity
            if (mat[j][i] == 1)
                j--;

                // else i can't be celebrity
            else
                i++;
        }

        // i points to our celebrity candidate
        int c = i;

        // Check if c is actually
        // a celebrity or not
        for (i = 0; i < n; i++) {
            if (i == c) continue;

            // If any person doesn't
            // know 'c' or 'c' doesn't
            // know any person, return -1
            if (mat[c][i] != 0 || mat[i][c] == 0)
                return -1;
        }

        return c;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 } };
        System.out.println(celebrity(mat));
    }
}
