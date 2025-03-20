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

// IN C
//#include <stdio.h>
//        #include <stdlib.h>
//        #include <string.h>
//        #include <math.h>
//
//        char* convertToBinary(int num) {
//        char* s = (char*)malloc(32 * sizeof(char)); // Assuming 32-bit integer
//        int i = 0;
//
//        while (num != 1) {
//        s[i++] = (num % 2) + '0';
//        num = num / 2;
//        }
//        s[i++] = '1';
//        s[i] = '\0';
//
//        // Reverse the string
//        int len = strlen(s);
//        for (int j = 0; j < len / 2; j++) {
//        char temp = s[j];
//        s[j] = s[len - j - 1];
//        s[len - j - 1] = temp;
//        }
//
//        return s;
//        }
//
//        int convertBinaryToDecimal(char* s) {
//        int num = 0;
//        int x = 0, bit;
//        int len = strlen(s);
//
//        for (int i = len - 1; i >= 0; i--) {
//        if (s[i] == '1') {
//        bit = 1;
//        num += (int)(bit * pow(2, x));
//        }
//        x++;
//        }
//        return num;
//        }
//
//        int swapBitPos(int num, int p1, int p2, int size) {
//        char* binary = convertToBinary(num);
//        printf("%s\n", binary);
//
//        int len = strlen(binary);
//        p1 = len - p1;
//        p2 = len - p2;
//
//        for (int i = 0; i < size; i++) {
//        char temp = binary[p1];
//        binary[p1] = binary[p2];
//        binary[p2] = temp;
//        p1--;
//        p2--;
//        }
//
//        printf("[");
//        for(int i = 0; i < len; i++){
//        printf("%c", binary[i]);
//        if(i < len-1){
//        printf(", ");
//        }
//        }
//        printf("]\n");
//
//        int newNum = convertBinaryToDecimal(binary);
//        free(binary); // Free the allocated memory
//        return newNum;
//        }
//
//        int main() {
//        int num = 375;
//        int p1 = 2;
//        int p2 = 5;
//        int size = 3;
//
//        printf("%d\n", swapBitPos(num, p1, p2, size));
//
//        return 0;
//        }