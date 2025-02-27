package DSA.Problems;


public class RemoveElement {
    public static int remove(int[] nums,int key){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(remove(nums,3));
    }
}
