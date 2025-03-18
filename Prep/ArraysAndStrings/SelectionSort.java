package DSA.Prep.ArraysAndStrings;
public class SelectionSort {
    void sort(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx])
                    min_idx = j;
            }

            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int a[] = { 64, 25, 12, 22, 11 };

        ob.sort(a);

        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");

    }
}
