package com.anna;
import java.util.*;

public class Repedify {

    public static String repidify (String word, int n) {
        if (n <= 0) return "";
        return word + repidify(word, n - 1);
    }

//    public static int peak (int[] seq) {
//        int start = 0;
//        int finish = seq.length - 1;
//        int mid = -1;
//        while (start < finish) {
//            mid = (finish - start ) / 2 + start;
//            System.out.println(mid);
//
//            if (seq[mid] > seq[mid + 1]){
//
//                if (seq[mid] < seq[mid - 1]) return mid;
//
//                finish = mid;
//            }
//            else  finish = mid;
//        }
//        return mid;
//    }


    public static void main(String[] args) {
        System.out.println(repidify("hello", 3));
        int[] nums = {2, 3, 4, 5, 2, 1};
//        System.out.println(peak(nums));

    }
}
