package DSA.Prep.Imp;

import java.util.ArrayList;
import java.util.List;

public class IsDivisibleAfterFlipingBits {

    public static int toDecimal(List<Integer> bits){
        int val = 0;
        for(int bit : bits){
            val = (val << 1) | bit;
        }
        return val;
    }

    public static boolean isDivisible(int val){
        return val % 7 == 0;
    }

    public static int makeDivisible(List<Integer> bits){
        int max = -1;

        // Check original value
        int originalVal = toDecimal(bits);
        if (isDivisible(originalVal)) {
            max = originalVal;
        }

        // Try flipping each bit once
        for (int i = 0; i < bits.size(); i++) {
            List<Integer> temp = new ArrayList<>(bits);
            temp.set(i, 1 - temp.get(i)); // Flip the bit
            int val = toDecimal(temp);

            if (isDivisible(val)) {
                max = Math.max(max, val);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<Integer> bits = new ArrayList<>();
        bits.add(1);
        bits.add(0);
        bits.add(1);
        bits.add(0);

        System.out.println(makeDivisible(bits));  // Should print 14
    }
}
