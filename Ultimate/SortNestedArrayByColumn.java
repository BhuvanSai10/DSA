package DSA.Ultimate;

import java.util.Arrays;

public class SortNestedArrayByColumn {
    public static void sortbyColumn(int a[][], int c){
        Arrays.sort(a, (x, y) -> Integer.compare(x[c],y[c]));
    }

    public static void main(String args[])
    {
        int m[][] = { { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 } };

        // Sort this matrix by 3rd Column
        int c = 3;

        sortbyColumn(m, c - 1);

        // Display the sorted Matrix
        for (int[] ints : m) {

            for (int anInt : ints) System.out.print(anInt + " ");

            System.out.println();

        }
    }
}
