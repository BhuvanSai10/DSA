package ProblemsOnStack;

import java.util.Arrays;

public class NextSmallerOfNextGreaterElement {
    public static int findNextSmallerElement(int[] arr,int index){
        for (int i = index ; i<arr.length ;i++){
            for (int j = index+1 ; j<arr.length ; j++){
                if (arr[j]<arr[i]){
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static int[] findNextSmallerOfNextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        Arrays.fill(result,-1);

        for (int i=0 ; i<arr.length ;i++){
            for (int j=i+1 ; j<arr.length ; j++){
                if (arr[j]>arr[i]){
                    result[i] = findNextSmallerElement(arr,j);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,4,10,2,5};
        System.out.println(Arrays.toString(findNextSmallerOfNextGreaterElement(arr)));
    }
}
