package DSA.Prep.ArraysAndStrings;

import java.util.Arrays;

public class SwapGivenPositionsOfBitsFromEndInANum {

    public static String convertToBinary(int num){
        StringBuilder s = new StringBuilder();

        while(num!=1){
            s.append(num%2);
            num = num / 2;
        }
        s.append(1);
        return s.reverse().toString();
    }

    public static int convertBinaryToDecimal(String s){
        int num = 0;
        int x = 0,bit;
        for (int i = s.length()-1 ; i>=0 ; i--){
             if(s.charAt(i)=='1'){
                 bit = 1;
                 num += (int) (bit*Math.pow(2,x));
             }
             x++;

        }
        return num;
    }

    public static int swapBitPos(int num,int p1,int p2,int size){
        String binary = convertToBinary(num);
        System.out.println(binary);

        char[] bits = binary.toCharArray();

        p1 = bits.length - p1;
        p2 = bits.length - p2;
        for (int i = 0 ; i<size ; i++){
            char temp = bits[p1];
            bits[p1] = bits[p2];
            bits[p2] = temp;
            p1--;
            p2--;
        }
        System.out.println(Arrays.toString(bits));

        int newNum = convertBinaryToDecimal(new String(bits));
        return newNum;
    }

    public static void main(String[] args) {
        int num = 375;
        int p1 = 2;
        int p2 = 5;
        int size = 3;

        System.out.println(swapBitPos(num,p1,p2,size));
    }
}
