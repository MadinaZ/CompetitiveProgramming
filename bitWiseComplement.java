package com.Madina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
PRINTING ARRAY
1. Simple Array
  String[] array = new String[] {"John", "Mary", "Bob"};
          System.out.println(Arrays.toString(array));
2. Nested Array
  String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
    System.out.println(Arrays.deepToString(deepArray));
 */


//public class Main {
//
//    public static void main(String[] args) {
//
//        int N = 10; //Test number
//        String n = Integer.toBinaryString(N);
//        String str = "";
//        int sum = 0;
//        for(int i = 0; i < n.length(); ++i)
//        {
//            str += flip(n.charAt(i));
//        }
//
//        System.out.println("1s complement: " + str);
//
//        for(int i = str.length() - 1; i >= 0; --i){
//            if(str.charAt(i) == '1')
//                sum += Math.pow(2, str.length()-1 - i);
//            else
//                continue;
//        }
//        System.out.println(sum);
//    }
//
//    public static char flip(char c){
//        return (c == '1') ? '0' : '1';
//    }
//}


//2nd solution
public class Main {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }

    static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n>>1);
    }

    public static int bitwiseComplement(int N) {
        if (N == 0) return 1;
        return (int)Math.pow(2, countDigits(N)) - 1 - N;
    }
}
