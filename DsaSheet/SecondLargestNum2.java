package DSA.DsaSheet;

public class SecondLargestNum2 {
    public static int secondLargest(int[] arr, int n)
    {
        if(n<2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
    public static void main(String[] args) {
        int[] nums ={1, 2, 4, 7, 7, 5};
        int n = nums.length;
        System.out.println(secondLargest(nums,n));
    }
}
