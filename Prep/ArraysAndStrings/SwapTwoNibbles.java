package DSA.Prep.ArraysAndStrings;

public class SwapTwoNibbles {
    public static int swapNibbles(int val){
        return (((val & 0x0F) <<4 )|((val & 0xF0) >>4));
    }

    public static void main(String[] args) {
        int val = 100;

        System.out.println(swapNibbles(val));
    }
}
